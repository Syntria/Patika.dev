package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.DBConnector;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.Course;
import com.patikadev.Model.Lesson;
import com.patikadev.Model.Operator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EditCourseGUI extends JFrame{

    private Course course;
    private int selected_lesson_id;

    private JPanel wrapper;
    private JPanel panel_top;
    private JLabel label_course_name;
    private JTable table_lesson_list;
    private JPanel panel_lesson_list;
    private JScrollPane scroll_lesson_list;
    private JTextField field_selected_lesson;
    private JButton button_lesson_edit;
    private JButton button_go_to_quiz;
    private JButton button_add_question;
    private JButton button_delete;
    private JButton button_add_lesson;

    private DefaultTableModel model_lesson_list;
    private Object[] row_lesson_list;

    public EditCourseGUI(Course course) {
        this.course = course;

        add(wrapper);
        setSize(1000,500);
        int x= Helper.screenCenterPoint("x",getSize());
        int y=Helper.screenCenterPoint("y",getSize());
        setLocation(x,y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        model_lesson_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Object[] col_lesson_list= {"ID","title", "Description", "link","Course_id"};
        model_lesson_list.setColumnIdentifiers(col_lesson_list);
        row_lesson_list =new Object[col_lesson_list.length];
        loadLessonModel(this.course);
        table_lesson_list.setModel(model_lesson_list);
        table_lesson_list.getColumnModel().getColumn(0).setMaxWidth(75);
        table_lesson_list.getTableHeader().setReorderingAllowed(false);

        table_lesson_list.getSelectionModel().addListSelectionListener(e -> {
            try{
                if (table_lesson_list.getSelectedRow() != -1) {
                    String selected_lesson_title = table_lesson_list.getValueAt(table_lesson_list.getSelectedRow(), 1).toString();
                    field_selected_lesson.setText(selected_lesson_title);
                    this.selected_lesson_id = (int) table_lesson_list.getValueAt(table_lesson_list.getSelectedRow(), 0);
                }
            }catch (Exception exception){
                exception.printStackTrace();
            }

        });

        button_lesson_edit.addActionListener(e -> {

            Lesson lesson = null;
            Statement st= null;
            try {
                st = DBConnector.getInstance().createStatement();
                ResultSet rs= st.executeQuery("SELECT * FROM lesson WHERE id = " + selected_lesson_id);
                if (rs.next()){
                    lesson = new Lesson(rs.getInt("id"),rs.getString("title"),rs.getString("description"),
                            rs.getString("link"), rs.getInt("course_id"));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            EditLessonGUI editLessonGUI = new EditLessonGUI(lesson);
            table_lesson_list.clearSelection();

            editLessonGUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadLessonModel(course);
                }

            });


        });

    }

    private void loadLessonModel(Course course) {
        DefaultTableModel clearModel = (DefaultTableModel) table_lesson_list.getModel();
        clearModel.setRowCount(0);
        int i = 0;
        for (Lesson obj : Lesson.getListByCourse(course)) {
            i = 0;
            row_lesson_list[i++] = obj.getId();
            row_lesson_list[i++] = obj.getTitle();
            row_lesson_list[i++] = obj.getDescription();
            row_lesson_list[i++] = obj.getLink();
            row_lesson_list[i++] = obj.getCourse_id();
            model_lesson_list.addRow(row_lesson_list);
        }
    }
}

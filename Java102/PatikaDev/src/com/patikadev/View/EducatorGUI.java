package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.DBConnector;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.Course;
import com.patikadev.Model.Educator;
import com.patikadev.Model.Operator;
import com.patikadev.Model.Patika;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EducatorGUI extends JFrame{
    private JPanel wrapper;
    private JTabbedPane educator_tab_opertor;
    private JPanel panel_educator_lesson_list;
    private JScrollPane scroll_lesson_list;
    private JTable table_lesson_list;
    private JTextField field_course_name;
    private JButton button_lesson_edit;

    private int selectedCourse_id;

    private DefaultTableModel model_course_list;
    private Object[] row_course_list;

    public EducatorGUI(Educator educator){
        add(wrapper);
        setSize(1000,500);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);


        model_course_list= new DefaultTableModel();
        Object[] col_courseList= {"ID","Ders Adı", "Programlama Dili", "Patika","Eğitmen"};
        model_course_list.setColumnIdentifiers(col_courseList);
        row_course_list=new Object[col_courseList.length];
        loadCourseModel(educator);
        table_lesson_list.setModel(model_course_list);
        table_lesson_list.getColumnModel().getColumn(0).setMaxWidth(75);
        table_lesson_list.getTableHeader().setReorderingAllowed(false);


        table_lesson_list.getSelectionModel().addListSelectionListener(e -> {
            try{
                String selected_course_name = table_lesson_list.getValueAt(table_lesson_list.getSelectedRow(),1).toString();
                field_course_name.setText(selected_course_name);
                this.selectedCourse_id = (int)table_lesson_list.getValueAt(table_lesson_list.getSelectedRow(),0);
            }catch (Exception exception){

            }

        });
        button_lesson_edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Course course = null;
                Statement st= null;
                try {
                    st = DBConnector.getInstance().createStatement();
                    ResultSet rs= st.executeQuery("SELECT * FROM course WHERE id = " + selectedCourse_id);
                    if (rs.next()){
                        course = new Course(rs.getInt("id"),rs.getInt("user_id"),rs.getInt("patika_id"),
                                rs.getString("name"), rs.getString("lang"));
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                EditCourseGUI editCourseGUI=new EditCourseGUI(course);
            }
        });
    }

    private void loadCourseModel(Educator educator) {
        DefaultTableModel clearModel=(DefaultTableModel) table_lesson_list.getModel();
        clearModel.setRowCount(0);
        int i=0;
        for(Course obj: Course.getListByEducator(educator)){
            i=0;
            row_course_list[i++]=obj.getId();
            row_course_list[i++]=obj.getName();
            row_course_list[i++]=obj.getLang();
            row_course_list[i++]=obj.getPatika().getName();
            row_course_list[i++]=obj.getEducator().getName();
            model_course_list.addRow(row_course_list);
        }
    }
}

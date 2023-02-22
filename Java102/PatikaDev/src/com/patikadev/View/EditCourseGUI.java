package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.Course;
import com.patikadev.Model.Educator;
import com.patikadev.Model.Lesson;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EditCourseGUI extends JFrame{

    private Course course;

    private JPanel wrapper;
    private JPanel panel_top;
    private JLabel label_course_name;
    private JTable table_lesson_list;
    private JPanel panel_lesson_list;
    private JScrollPane scroll_lesson_list;
    private JTextField textField1;

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
        Object[] col_lesson_list= {"ID","title", "Description", "link","Course_id"}; // Güncelle
        model_lesson_list.setColumnIdentifiers(col_lesson_list);
        row_lesson_list =new Object[col_lesson_list.length];
        loadLessonModel(this.course);
        table_lesson_list.setModel(model_lesson_list);
        table_lesson_list.getColumnModel().getColumn(0).setMaxWidth(75);
        table_lesson_list.getTableHeader().setReorderingAllowed(false);
    }

    private void loadLessonModel(Course course) {
        DefaultTableModel clearModel = (DefaultTableModel) table_lesson_list.getModel();
        clearModel.setRowCount(0);
        int i = 0;
        for (Lesson obj : Lesson.getListByCourse(course)) {    // lessona get list yazıp oradan lessonları çek
            i = 0;
            row_lesson_list[i++] = obj.getId();
            row_lesson_list[i++] = obj.getTitle();
            row_lesson_list[i++] = obj.getDescription();
            row_lesson_list[i++] = obj.getLink();     // güncelle
            row_lesson_list[i++] = obj.getCourse_id();
            model_lesson_list.addRow(row_lesson_list);
        }
    }
}

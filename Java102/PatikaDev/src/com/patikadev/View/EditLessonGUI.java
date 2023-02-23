package com.patikadev.View;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.Lesson;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditLessonGUI extends JFrame{

    private Lesson lesson;

    private JPanel wrapper;
    private JTextField textField_title;
    private JTextField textField_description;
    private JTextField textField_link;
    private JButton button_update_lesson;

    public EditLessonGUI(Lesson lesson) {
        this.lesson = lesson;

        add(wrapper);
        setSize(1000, 500);
        int x = Helper.screenCenterPoint("x", getSize());
        int y = Helper.screenCenterPoint("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);


        textField_title.setText(this.lesson.getTitle());
        textField_description.setText(this.lesson.getDescription());
        textField_link.setText(this.lesson.getLink());

        button_update_lesson.addActionListener(e -> {

            Lesson.update(this.lesson.getId(), textField_title.getText(), textField_description.getText(), textField_link.getText());
            dispose();
        });
    }
}

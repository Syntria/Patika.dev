package com.patikadev.Model;

import com.patikadev.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Lesson {

    private int id;
    private int course_id;
    private String title;
    private String description;
    private String link;

    private Course course;

    public Lesson(int id, String title, String description, String link, int course_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.link = link;
        this.course_id = course_id;
        this.course=Course.getFetch(course_id);
    }


    public static boolean add(int user_id,int patika_id,String name,String lang){
        String query="INSERT INTO course (user_id,patika_id,name,lang) VALUES (?,?,?,?)";

        try {
            PreparedStatement pr= DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1,user_id);
            pr.setInt(2,patika_id); // düzenle
            pr.setString(3,name);
            pr.setString(4,lang);
            return pr.executeUpdate() !=-1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static ArrayList<Lesson> getListByCourse(Course course){
        ArrayList<Lesson> courseList =new ArrayList<>();
        Lesson obj;
        try {
            Statement st= DBConnector.getInstance().createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM lesson WHERE course_id = " + course.getId());
            while (rs.next()){
                int id=rs.getInt("id");
                String title=rs.getString("title");
                String description = rs.getString("description");
                String link = rs.getString("link");
                int course_id=rs.getInt("course_id");
                obj=new Lesson(id,title,description,link,course_id);
                courseList.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courseList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

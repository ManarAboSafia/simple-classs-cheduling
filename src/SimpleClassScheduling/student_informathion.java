/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleClassScheduling;

/**
 *
 * @author Dexter
 */
public class student_informathion {

    String first_name;
    String last_name;
    String collage;
    int student_ID;
    int student_Level;

    public student_informathion(String first_name, String last_name, String collage, int student_ID, int student_Level) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.collage = collage;
        this.student_ID = student_ID;
        this.student_Level = student_Level;
    }

   
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public int getStudent_Level() {
        return student_Level;
    }

    public void setStudent_Level(int student_Level) {
        this.student_Level = student_Level;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

}

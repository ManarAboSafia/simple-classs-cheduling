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
public class course_informathion {
    
   private String course_Name;
   private int course_Number;
   private String course_hall;
   private String course_teacher;
   private int[] Day=new int[3];
   private String Time;
   private int ID;

    public course_informathion(String course_Name, int course_Number, String course_hall, String course_teacher,int[] Day,String Time,int ID) {
        this.course_Name = course_Name;
        this.course_Number = course_Number;
        this.course_hall = course_hall;
        this.course_teacher = course_teacher;
        this.Day=Day;
        this.Time=Time;
        this.ID=ID;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    

    public int[] getDay() {
        return Day;
    }

    public void setDay(int[] Day) {
        this.Day = Day;
    }

   

    public String getCourse_Name() {
        return course_Name;
    }

    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
    }

    public int getCourse_Number() {
        return course_Number;
    }

    public void setCourse_Number(int course_Number) {
        this.course_Number = course_Number;
    }

    public String getCourse_hall() {
        return course_hall;
    }

    public void setCourse_hall(String course_hall) {
        this.course_hall = course_hall;
    }

    public String getCourse_teacher() {
        return course_teacher;
    }

    public void setCourse_teacher(String course_teacher) {
        this.course_teacher = course_teacher;
    }
    
   
    
}

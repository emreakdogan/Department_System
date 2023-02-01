import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private int courseCode;


    private String courseName;
    private int courseCredit;
    private Area courseClass;
    private Lecturer courseLecturer;


    private boolean attendance = true; // By default attendance is required



    public Course(int courseCode,String courseName,int courseCredit){
        this.setCourseCode(courseCode);
        this.setCourseName(courseName);
        this.setCourseCredit(courseCredit);


    }


    private ArrayList<Integer> courseStudents = new ArrayList<Integer>();

    public int getCourseCode() {
        return courseCode;
    } // End of the getter body

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    } // End of the setter body

    public String getCourseName() {
        return courseName;
    } // End of the getter body

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    } // End of the setter body

    public int getCourseCredit() {
        return courseCredit;
    } // End of the getter body

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    } // End of the setter body

    public Area getCourseClass() {
        return courseClass;
    } // End of the getter body

    public void setCourseClass(Area courseClass) {
        this.courseClass = courseClass;
    } // End of the setter body

    public Lecturer getCourseLecturer() {
        return courseLecturer;
    } // End of the getter body



    public void setCourseLecturer(Lecturer courseLecturer) {
        this.courseLecturer = courseLecturer;
    } // End of the setter body

    public ArrayList<Integer> getCourseStudents() {
        return courseStudents;
    } // End of the getter body


    public boolean isAttendance() {
        return attendance;
    } // End of the function body

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    } // End of the setter body
} // End of the class

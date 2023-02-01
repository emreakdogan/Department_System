import java.util.ArrayList;

public class Department {
    private ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>(); // Array list object of a generic type
    private ArrayList<Student> students = new ArrayList<Student>(); // Array list object of a generic type
    private ArrayList<Course> courses = new ArrayList<Course>(); // Array list object of a generic type
    private ArrayList<Staff> staffs = new ArrayList<Staff>(); // Array list object of a generic type
    private ArrayList<Area> areas = new ArrayList<Area>(); // Array list object of a generic type

    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }  // End of the getter body

    public void setLecturers(ArrayList<Lecturer> lecturers) {
        this.lecturers = lecturers;
    } // End of the setter body

    public ArrayList<Student> getStudents() {
        return students;
    } // End of the getter body

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    } // End of the setter body

    public ArrayList<Course> getCourses() {
        return courses;
    } // End of the getter body

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    } // End of the setter body

    public ArrayList<Staff> getStaffs() {
        return staffs;
    } // End of the getter body

    public void setStaffs(ArrayList<Staff> staffs) {
        this.staffs = staffs;
    } // End of the setter body

    public ArrayList<Area> getAreas() {
        return areas;
    } // End of the getter body
    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    } // End of the setter body
} // End of the class

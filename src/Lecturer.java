import java.util.ArrayList;

public class Lecturer extends Person {
    public ArrayList<Course> teaching = new ArrayList<Course>(); // Array list object of a generic type

    public Lecturer(int id,String name, String surname,Course course) {
        super(id,name,surname);
        // Check the maximum course size for a lecturer
        if(this.teaching.size()>10){
            System.out.println("Maximum Course is 10!");
        }
        else {
        this.teaching.add(course);}

    } // End of the constructor body

    public ArrayList<Course> getTeaching() {
        return teaching;
    } // End of the getter body

    public String toGrade(String grade){
        return grade;
    } // End of the function body

    public void toAttendance(Course course,boolean attendance){
        course.setAttendance(attendance);


    } // End of the function body


    public void setTeaching(ArrayList<Course> teaching) {
        this.teaching = teaching;
    }

    public String toString() {

        String formattedString = super.getName() + " " + super.getSurname()  + " added.";
        return formattedString;

    } // End of the function body 
} // End of the class

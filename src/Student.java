import java.util.HashMap;

public class Student extends Person{

    private String type; // This field is for differing undergraduate and graduate (master and doctora) students


    private int  year;
    private HashMap<Course,String> studentcourses = new HashMap<Course,String>();
    private  static HashMap<String,Double> grades = new HashMap<String,Double>();

    public  static HashMap<String, Double> getGrades() {
        // That object will be the same for all Student objects so that it is static
        return grades;
    } 


    public void setGrades(){
        // Fill the static hashmap of grades
        getGrades().put("AA",4.0);
        getGrades().put("BA",3.5);
        getGrades().put("BB",3.0);
        getGrades().put("CB",2.5);
        getGrades().put("CC",2.0);
        getGrades().put("DC",1.5);
        getGrades().put("DD",1.0);
        getGrades().put("FD",0.5);
        getGrades().put("FF",0.0);

    } // End of the function body




    public Student(int id,String name, String surname,int year,String type) {
        super(id,name,surname);
        this.setYear(year);
        this.setType(type);
    } // End of the constructor body

    public int getYear() {
        return year;
    } // End of the getter body

    public void setYear(int year) {
        this.year = year;
    } // End of the setter body


    public HashMap<Course,String> getStudentcourses() {
        return studentcourses;
    } // End of the getter body


    public double calculateGPA(HashMap<Course,String> studentcourses,HashMap<String,Double> grades){
        // Calculate the gpa of a student object
        double sum_grades = 0;
        double sum_credit = 0;
        for(Course course:studentcourses.keySet()){
            sum_grades = sum_grades + grades.get(studentcourses.get(course))*course.getCourseCredit();
            sum_credit = sum_credit + course.getCourseCredit();
        }

        return sum_grades/sum_credit ;
    } // End of the function body


    public String getType() {
        return type;
    } // End of the getter body

    public void setType(String type) {
        this.type = type;
    } // End of the setter body


} // End of the class




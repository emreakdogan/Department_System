import java.util.ArrayList;
import java.util.HashMap;

public class DepartmentManager {

    private Department department;

    public DepartmentManager(Department department){
        this.department = department;
    }
    public void registerStudent(int id, String name, String surname, int year, String type){
        Student newstudent = new Student(id,name,surname,year, type);
        department.getStudents().add(newstudent);
    }


    public void assignCourse(Student student, Course course, ArrayList<Course> courses){
        if(courses.contains(course)) {
            student.getStudentcourses().put(course, null);
            course.getCourseStudents().add(student.getId());
        }
        else{
            System.out.println("Öğrenci olmayan dersi alıyor");
        }
    }

    public void checkCourse(Student student, Course course,  ArrayList<Course> courses){
        if(!(student.getStudentcourses().get(course).contains(null))) {


            int control = 0;
            for (Course course1 : student.getStudentcourses().keySet()) {
                if (course1 == course) {
                    control = 1;
                    break;
                } else {
                    control = 0;
                }

            }
            if (control == 1) {
                System.out.println("Öğrenci aldı");

            } else {
                System.out.println("almadı");
            }
        }
        else {
            System.out.println("Öğrencinin notu yok");
        }
    } // End of the function body

    public void gradeCourse(Student student, Lecturer lecturer,Course course,String grade){
        student.getStudentcourses().put(course,lecturer.toGrade(grade));    } // End of the function body

    public void getInfo(Student student){
        System.out.println(student.getId()+" "+student.getName()+" "+student.getSurname()+" "+student.getYear()+" "+student.getType()+" "+student.getStudentcourses().values()+" ");
    } // End of the getter body

    public double getGPA(Student student){
       return student.calculateGPA(student.getStudentcourses(),Student.getGrades());
    } // End of the getter body

    public void addCourse(int courseCode, String coursename, int courseCredit){
        Course course  = new Course(courseCode,coursename,courseCredit);
        department.getCourses().add(course);

    } // End of the function body

    public void isEnoughBudget(){
        Accounting accounting1 = new Accounting(1000,20000,300000);
        if(accounting1.totalMoneyToSpend()>100000){
            accounting1.askingForDonation();
        }
        else{
            System.out.println("Budget is enough.");
        }
    }
} // End of the class

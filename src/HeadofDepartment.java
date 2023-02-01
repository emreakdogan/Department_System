public class HeadofDepartment extends Lecturer{

    static int control = 0;
    public HeadofDepartment(int id, String name, String surname, Course course) {
        super(id, name, surname, course);
        this.control+=1;
        if(this.control>1){
            System.out.println("Bir tane Bölüm Başkanı olur.");
        }
    } // End of the constructor body





    public void gra(Student student){
        //Function to deny or confirm student's graduation
        String control;
        control = student.getType();
        switch (control){
            case "Graduate":
                if((student.calculateGPA(student.getStudentcourses(),Student.getGrades())>=2.0) && student.getStudentcourses().size()>=40 ){
                    System.out.println("Graduation");
            }
                else{
                    System.out.println("Not Graduation");
            }
            break;
            case "Master":
                if((student.calculateGPA(student.getStudentcourses(),Student.getGrades())>=2.5) && student.getStudentcourses().size()>=7 ){
                    System.out.println("Graduation");
                }
                else{
                    System.out.println("Not Graduation");
                }
                break;
            case "D":
                if((student.calculateGPA(student.getStudentcourses(),Student.getGrades())>=3.0) && student.getStudentcourses().size()>=8 ){
                    System.out.println("Graduation");
                }
                else{
                    System.out.println("Not Graduation");
                }
                break;
            default:
                System.out.println("Error");
                break;


        } // End of the switch body

        } // End of the function body


} // End of the class



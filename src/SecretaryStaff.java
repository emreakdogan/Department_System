public class SecretaryStaff extends Staff{

    public SecretaryStaff(int id, String name, String surname, String job, String workHours) {
        super(id, name, surname, job, workHours);
    } // End of the constructor body

    @Override
    public void doJob() {
        System.out.println("Secretary Works!");

    } // End of the function body

    @Override
    public boolean isProblem(Area area) {
        return area.isAreaProblem();
    } // End of the function body

    @Override
    public String whereProblem(Area area) {
        return area.toString();
    } // End of the function body

    public void assignCourseLecturer(Course course, Lecturer lecturer){
        course.setCourseLecturer(lecturer);
        if(lecturer.getTeaching().size()>10){
            System.out.println("Maximum Course is 10!");
        }
        else {
            lecturer.getTeaching().add(course);}
            System.out.println("New Lecturer");


    } // End of the function body

    public void changeCourseLecturer(Course course, Lecturer lecturer){
        course.setCourseLecturer(lecturer);
        System.out.println("Changed Lecturer!");

    }
} // End of the class

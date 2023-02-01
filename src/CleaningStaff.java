public class CleaningStaff  extends Staff{

    public CleaningStaff(int id, String name, String surname, String job, String workHours) {
        super(id, name, surname, job, workHours);
    } // End of the constructor body

    @Override
    public void doJob() {
        System.out.println("Clean the Area!");

    } // End of the function body

    @Override
    public boolean isProblem(Area area) {
        return area.isAreaProblem();
    } // End of the function body

    @Override
    public String whereProblem(Area area) {
        return area.toString();
    }
} // End of the class

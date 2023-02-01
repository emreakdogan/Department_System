public class TechnicalStaff extends Staff {

    public TechnicalStaff(int id, String name, String surname, String job, String workHours) {
        super(id, name, surname, job, workHours);
    } // End of the constructor body

    @Override
    public void doJob() {
        System.out.println("Attention Technical Problem!");
    } // End of the function body

    @Override
    public boolean isProblem(Area area) {
        return area.isAreaProblem();
    } // End of the function body

    @Override
    public String whereProblem(Area area) {
        return area.toString();
    } // End of the function body


} // End of the class

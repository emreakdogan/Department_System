public abstract class Staff extends Person{

    private String job;
    private String workHours;

    public abstract void  doJob();
    public abstract boolean isProblem(Area area);

    public abstract String whereProblem(Area area);

    public Staff(int id,String name, String surname,String job,String workHours) {
        super(id,name,surname);
        this.setJob(job);
        this.setWorkHours(workHours);
    } // End of the constructor body


    public String getJob() {
        return job;
    } // End of the getter body

    public void setJob(String job) {
        this.job = job;
    } // End of the setter body

    public String getWorkHours() {
        return workHours;
    } // End of the getter body

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    } // End of the setter body
} // End of the class

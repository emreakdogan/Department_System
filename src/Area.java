public abstract class Area {
    protected int floor; 
    protected int block;
    protected boolean capacity;

    private boolean areaProblem;



    public Area(int floor, int block, boolean capacity) {

        this.floor = floor;
        this.block = block;
        this.capacity = capacity;

    } // End of the constructor body

    public abstract void isFull(); //Function to check whether the area is full or not

    public abstract String toString();  // String representation of the Area object

    public boolean isAreaProblem() {
        return areaProblem;
    }

    public void setAreaProblem(boolean areaProblem) {
        this.areaProblem = areaProblem;
    } 

} // End of the class

public class Class extends Area {

    private String name; // Name of the area object
    private int classNumber; 
    public Class(int floor, int block, boolean capacity, String name, int classNumber) {
        super(floor, block, capacity);
        this.name = name;
        this.classNumber = classNumber;
    } // end of the constructor body

    public void isFull() {
        //Function to check whether the area is full or not

        if(capacity == true) {
            System.out.println(name + " " + classNumber + " is full!");
        } else {
            System.out.println(name + " " + classNumber + " is avaliable.");
        }


    } // end of the function body

    public String toString() {
        // String representation of the Area object
        String formattedString = name + " " + classNumber + "\n" + "Location: " + floor + " " + block;
        return formattedString;
    } // End of the function body



} // End of the class

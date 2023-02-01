public class AssistantOffice extends Area {


private String name; // Name of the area object

public AssistantOffice(int floor, int block, boolean capacity, String name) {
    super(floor, block, capacity);
    this.name = name;

} // End of the constructor body


public void isFull() {
    //Function to check whether the area is full or not
    if (capacity == true ) {

        System.out.println(name + " is full!");

    } else {
        System.out.println(name + " is available.");
    }
    
} // End of the function body


public String toString() {
    // String representation of the Area object
    String formattedString = name + "\n" + "Location: " + floor + " " + block;
    return formattedString;
} // End of the function body






} // End of the class

public class Canteen extends Area {




    private boolean foodStock;
    private String name; // Name of the area object



    public Canteen(int floor, int block, boolean capacity, boolean foodStock, String name) {

        super(floor, block, capacity);
        this.foodStock = foodStock;
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


    public void StockControl() {
        // Function to check food stock in canteen
        if(foodStock == true) {

            System.out.println(name + " doesn't need anything to order.");


        } else {
            System.out.println("Order food.");
        }


    } // End of the function body




} // End of the class

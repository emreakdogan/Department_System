public class Person {
    private int id;
    private String name;
    private String surname;


    public Person(int id,String name, String surname){
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);

    } // End of the constructor body

    public int getId() {
        return id;
    } // End of the getter body

    public void setId(int id) {
        this.id = id;
    } // End of the setter body

    public String getName() {
        return name;
    } // End of the getter body

    public void setName(String name) {
        this.name = name;
    } // End of the setter body

    public String getSurname() {
        return surname;
    } // End of the getter body

    public void setSurname(String surname) {
        this.surname = surname;
    } // End of the setter body
} // End of the class

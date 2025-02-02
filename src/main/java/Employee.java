//This class handles Employee object creation.
//This lets the program keep track of which employee is which,

public class Employee {

    private final String ID;
    private final String firstName;
    private final String lastName;
    private final String position;
    private boolean clockedIn;

    //Creates employee object and saves their ID, first name, last name, and position
    //Sets their clockedIn variable to false, so employees have a chance to clock in or not.
    public Employee(String ID, String firstName, String lastName, String position) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        clockedIn = false;
        System.out.println("Employee object created!");
    }

    //Method to return employee ID
    public String getID() {
        return ID;
    }

    //Set of methods to return employee names
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //Method to get employee position
    public String getPosition() {
        return position;
    }

    //Set of methods to return and set clockedIn status
    public boolean clockedIn() {
        return clockedIn;
    }

    public void clockIn() {
        clockedIn = true;
        System.out.println("Employee is now clocked in.");
    }

    public void clockOut() {
        clockedIn = false;
    }

}

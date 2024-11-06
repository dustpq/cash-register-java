import javax.swing.*;
import java.util.ArrayList;

public class loginManager {

    static ArrayList<Employee> loggedInEmployees = new ArrayList<>();

    public static boolean logIn(String id) {

        if (employeeTable.isValidID(id)) {

            System.out.println("ID is valid, proceeding with login check...");

            // Creating newEmployee to check if it exists,
            // and if it doesn't, it will be added to the list of logged in employees
            Employee newEmployee = new Employee(
                    id,
                    employeeTable.getFirstNameFromID(id),
                    employeeTable.getLastNameFromID(id),
                    employeeTable.getPositionFromID(id));

            for (Employee employee : loggedInEmployees) {

                // If the employee is already logged in
                if (employee.getID().equals(newEmployee.getID())) {

                    System.out.println("Employee is logged in.");

                    if (employee.clockedIn()) {

                        System.out.println("Employee is clocked in, proceeding to main menu...");
                        new mainMenu(employee);

                    } else {

                        System.out.println("Employee is not clocked in, proceeding to clock in menu...");
                        new clockInMenu(employee);

                    }

                    return true;
                }
            }

            // If the employee is not already logged in
            System.out.println("Employee not logged in, logging in now...");
            loggedInEmployees.add(newEmployee);

            System.out.println("Employee is not clocked in, proceeding to clock in menu...");
            new clockInMenu(newEmployee);

            return true;

        } else {
            System.out.println("ERROR: ID is not valid.");
            return false;
        }

    }

}

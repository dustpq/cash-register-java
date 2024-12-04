import java.util.ArrayList;

public class loginManager {

    static ArrayList<Employee> loggedInEmployees = new ArrayList<>();

    public static void logIn(String id) {

        if (employeeTable.isValidID(id)) {

            System.out.println("ID is valid, proceeding with login check...");

            Employee newEmployee = new Employee(
                    id,
                    employeeTable.getFirstNameFromID(id),
                    employeeTable.getLastNameFromID(id),
                    employeeTable.getPositionFromID(id));

            for (Employee employee : loggedInEmployees) {

                if (employee.getID().equals(newEmployee.getID())) {

                    System.out.println("Employee is logged in.");

                    if (employee.clockedIn()) {
                        System.out.println("Employee is clocked in, proceeding to main menu...");
                        new mainMenu(employee);
                    } else {
                        System.out.println("Employee is not clocked in, proceeding to clock in menu...");
                        new clockInMenu(employee);
                    }

                    return;
                }
            }

            System.out.println("Employee not logged in, logging in now...");
            loggedInEmployees.add(newEmployee);

            System.out.println("Employee is not clocked in, proceeding to clock in menu...");
            new clockInMenu(newEmployee);

        } else {
            System.out.println("ERROR: ID is not valid.");
        }
    }

    public static boolean isLoggedIn(String id) {
        for (Employee employee : loggedInEmployees) {
            if (employee.getID().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
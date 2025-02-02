import java.sql.*;

public class employeeTable extends DatabaseHandling{

    public boolean isValidID(String id) {

        String checkID = "SELECT id FROM employees WHERE id = ?";

        try {

            PreparedStatement pstmt = conn.prepareStatement(checkID);
            System.out.println("DB connected. Proceeding with ID validation...");

            pstmt.setString(1, id);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                System.out.println("ID: " + id + " is valid.");
                return true;
            } else {
                System.out.println("ID: " + id + " is invalid.");
                return false;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println("ERROR: Employee ID does not exist!");
            return false;

        }

    }

    public String getNameFromID(String id) {

        String getName = "SELECT first_name, last_name FROM employees WHERE id = ?";
        String employee_name = null;

        try {

            PreparedStatement pstmt = conn.prepareStatement(getName);
            System.out.println("DB connected. Proceeding with full name retrieval...");

            pstmt.setString(1, id);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                employee_name = resultSet.getString("first_name") + " " + resultSet.getString("last_name");
                return employee_name;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println("ERROR: Could not get name!");

        }

        return employee_name;

    }

    public String getFirstNameFromID(String id) {

        String getName = "SELECT first_name FROM employees WHERE id = ?";
        String employee_name = null;

        try  {

            pstmt = conn.prepareStatement(getName);
            System.out.println("DB connected. Proceeding with first name retrieval...");

            pstmt.setString(1, id);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                employee_name = resultSet.getString("first_name");
                return employee_name;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println("ERROR: Could not get first name!");

        }

        return employee_name;

    }

    public String getLastNameFromID(String id) {

        String getName = "SELECT last_name FROM employees WHERE id = ?";
        String employee_name = null;

        try {

            pstmt = conn.prepareStatement(getName);
            System.out.println("DB connected. Proceeding with last name retrieval...");

            pstmt.setString(1, id);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                employee_name = resultSet.getString("last_name");
                return employee_name;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println("ERROR: Could not get last name!");

        }

        return employee_name;

    }

    public String getPositionFromID(String id) {

        String getPosition = "SELECT position FROM employees WHERE id = ?";
        String position = null;

        try {

            pstmt = conn.prepareStatement(getPosition);
            System.out.println("DB connected. Proceeding with position retrieval...");

            pstmt.setString(1, id);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                position = resultSet.getString("position");
                return position;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println("ERROR: Could not get position!");

        }

        return position;

    }

}

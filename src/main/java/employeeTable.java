import javax.xml.transform.Result;
import java.sql.*;

public class employeeTable {

    public static boolean isValidID(String id) {

        String checkID = "SELECT id FROM employees WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(MainApp.db_url);
             PreparedStatement pstmt = conn.prepareStatement(checkID)) {

            System.out.println("Connection established. Proceeding with ID validation...");

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

    public static String getNameFromID(String id) {

        String getName = "SELECT first_name, last_name FROM employees WHERE id = ?";
        String employee_name = null;

        try (Connection conn = DriverManager.getConnection(MainApp.db_url);
             PreparedStatement pstmt = conn.prepareStatement(getName)) {

            System.out.println("Connection established. Proceeding with full name retrieval...");

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

    public static String getFirstNameFromID(String id) {

        String getName = "SELECT first_name FROM employees WHERE id = ?";
        String employee_name = null;

        try (Connection conn = DriverManager.getConnection(MainApp.db_url);
             PreparedStatement pstmt = conn.prepareStatement(getName)) {

            System.out.println("Connection established. Proceeding with first name retrieval...");

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

    public static String getLastNameFromID(String id) {

        String getName = "SELECT last_name FROM employees WHERE id = ?";
        String employee_name = null;

        try (Connection conn = DriverManager.getConnection(MainApp.db_url);
             PreparedStatement pstmt = conn.prepareStatement(getName)) {

            System.out.println("Connection established. Proceeding with last name retrieval...");

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

    public static String getPositionFromID(String id) {

        String getPosition = "SELECT position FROM employees WHERE id = ?";
        String position = null;

        try (Connection conn = DriverManager.getConnection(MainApp.db_url);
             PreparedStatement pstmt = conn.prepareStatement(getPosition)) {

            System.out.println("Connection established. Proceeding with position retrieval...");

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

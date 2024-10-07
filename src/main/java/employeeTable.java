import java.sql.*;

public class employeeTable {

    public boolean isValidID(String id) {

        String checkID = "SELECT id FROM employees WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(MainApp.db_url);
             PreparedStatement pstmt = conn.prepareStatement(checkID)) {

            System.out.println("Connection established. Proceeding with operation...");

            pstmt.setString(1, id);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            return false;

        }

    }

}

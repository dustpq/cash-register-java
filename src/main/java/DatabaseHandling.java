import java.sql.*;

public abstract class DatabaseHandling {

    protected Connection conn;
    protected PreparedStatement pstmt;

    public DatabaseHandling() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:register_database.sqlite");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR: Could not establish database connection!");
        }
    }
}
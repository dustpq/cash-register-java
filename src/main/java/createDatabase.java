import java.sql.*;

public class createDatabase {

    public createDatabase() {

        String db_url = "jdbc:sqlite:register_database.sqlite";

        System.out.println("Creating database...");
        try (Connection conn = DriverManager.getConnection(db_url)) {

            if (conn != null) {

                System.out.println("Database created.");

                String employee_table = """
                        CREATE TABLE employees (
                        id text PRIMARY KEY,
                        first_name text NOT NULL,
                        last_name text NOT NULL,
                        position text NOT NULL
                        )""";

                String inventory_table = """
                        CREATE TABLE inventory (
                        item_id text PRIMARY KEY,
                        item_name text NOT NULL,
                        price text NOT NULL,
                        stockAmount text NOT NULL,
                        lastUpdated text NOT NULL
                        )
                        """;

                String transactions_table = """
                        CREATE TABLE transactions (
                        purchase_id text PRIMARY KEY,
                        items text NOT NULL,
                        subtotal text NOT NULL,
                        total text NOT NULL,
                        date text NOT NULL
                        )
                        """;

                String testUser = """
                        INSERT INTO employees
                        (id, first_name, last_name, position)
                        VALUES
                        ('EMP000','Test','Manager','Manager')
                        """;


                Statement stmt = conn.createStatement();

                System.out.println("Creating employee table...");
                stmt.execute(employee_table);

                System.out.println("Creating inventory table...");
                stmt.execute(inventory_table);

                System.out.println("Creating transactions table...");
                stmt.execute(transactions_table);

                System.out.println("Creating test user...");
                stmt.execute(testUser);

                System.out.println("Finished successfully.");

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }

}

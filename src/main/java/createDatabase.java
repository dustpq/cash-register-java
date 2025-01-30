import java.sql.*;

public class createDatabase extends DatabaseHandling{

    public createDatabase() {

        System.out.println("Creating database...");

        try {

            System.out.println("Database created.");

            String employee_table = """
                    CREATE TABLE employees (
                    id text PRIMARY KEY,
                    first_name text NOT NULL,
                    last_name text NOT NULL,
                    position text NOT NULL
                    )""";

            String item_table = """
                    CREATE TABLE items (
                    item_id text PRIMARY KEY,
                    item_name text NOT NULL,
                    price text NOT NULL
                    )
                    """;

            String transactions_table = """
                    CREATE TABLE transactions (
                    purchase_id text PRIMARY KEY,
                    items text NOT NULL,
                    subtotal text NOT NULL,
                    total text NOT NULL,
                    date text NOT NULL,
                    time text NOT NULL
                    )
                    """;

            String testManager = """
                    INSERT INTO employees
                    (id, first_name, last_name, position)
                    VALUES
                    ('EMP000','Test','Manager','Manager')
                    """;

            String testCashier = """
                    INSERT INTO employees
                    (id, first_name, last_name, position)
                    VALUES
                    ('EMP001','Test','Cashier','Cashier')
                    """;

            System.out.println("Creating employee table...");
            pstmt = conn.prepareStatement(employee_table);
            pstmt.execute();

            System.out.println("Creating item table...");
            pstmt = conn.prepareStatement(item_table);
            pstmt.execute();

            System.out.println("Creating transactions table...");
            pstmt = conn.prepareStatement(transactions_table);
            pstmt.execute();

            System.out.println("Creating test manager...");
            pstmt = conn.prepareStatement(testManager);
            pstmt.execute();

            System.out.println("Creating test cashier...");
            pstmt = conn.prepareStatement(testCashier);
            pstmt.execute();

            System.out.println("Finished successfully.");
            System.out.println("Starting log in screen...");
            new loginScreen();

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println("ERROR: Could not create the database!");

        }

    }

}

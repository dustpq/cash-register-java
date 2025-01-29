import java.sql.*;

public class itemTable {

    public static String getItemName(String id) {

        String getName = "SELECT item_name FROM items WHERE item_id IS ?";
        String item_name = null;

        try (Connection conn = DriverManager.getConnection(MainApp.db_url);
             PreparedStatement pstmt = conn.prepareStatement(getName)) {

            System.out.println("DB connected from itemTable. Retrieving item name...");

            pstmt.setString(1, id);
            ResultSet resultSet = pstmt.executeQuery();

            if(resultSet.next()) {
                item_name = resultSet.getString("item_name");
                return item_name;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR: Could not get item name!");
        }

        return item_name;

    }

    public static double getItemPrice(String id) {

        String getPrice = "SELECT price FROM items WHERE item_id IS ?";
        double price;

        try (Connection conn = DriverManager.getConnection(MainApp.db_url);
             PreparedStatement pstmt = conn.prepareStatement(getPrice)) {

            System.out.println("DB connected from itemTable. Retrieving item price...");

            pstmt.setString(1, id);
            ResultSet resultSet = pstmt.executeQuery();

            if(resultSet.next()) {
                price = resultSet.getDouble("item_price");
                return price;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR: Could not get item price!");
        }

        System.out.println("ERROR: Could not get item price!");
        return 0;

    }

}

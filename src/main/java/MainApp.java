import java.io.File;

public class MainApp {

    static String db_url = "jdbc:sqlite:register_database.sqlite";

    public static void main(String[] args) {

        File db_File = new File("register_database.sqlite");

        if (!db_File.exists()) {
            new createDatabase();
        }

        else {
            System.out.println("Database present. Proceeding...");
            //new loginScreen();
            new loginScreenSUI();
        }

    }

}

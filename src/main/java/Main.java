import java.io.File;

public class Main {

    public static void main(String[] args) {

        File dburl = new File("register_database.sqlite");

        if (!dburl.exists()) {
            new createDatabase();
        }

        else {

        }

    }

}

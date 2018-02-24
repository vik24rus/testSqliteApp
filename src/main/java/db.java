import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    private final String driverName = "org.sqlite.JDBC";
    private final String connectionString = "jdbc:sqlite:test1.db";

    public void add(String first, String second) {
        System.out.printf("111");
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.out.println("Can't get class. No driver found");
            e.printStackTrace();
            return;
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException e) {
            System.out.println("Can't get connection. Incorrect URL");
            e.printStackTrace();
            return;
        }
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Can't close connection");
            e.printStackTrace();
            return;
        }
    }

    public void print(){

    }
}

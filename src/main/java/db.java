import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class db {
    private final String connectionString = "jdbc:sqlite:src/main/resources/test.db";
    public void add(String first, String second) {

        try (Connection connection = DriverManager.getConnection(connectionString))
        {
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO messages (author,messageText) values (?,?)");
            preparedStatement.setString( 1,first);
            preparedStatement.setString( 2,second);
            preparedStatement.executeUpdate();

        }
        catch(SQLException e)
        {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }
        //witch try and resources we don't need in this section
//        finally
//        {
//            try
//            {
//                if(connection != null)
//                    connection.close();
//            }
//            catch(SQLException e)
//            {
//                // connection close failed.
//                System.err.println(e);
//            }
//        }
    }

    public void print(){
        try (Connection connection = DriverManager.getConnection(connectionString))
        {
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement(
                    "select  * from messages");

            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                while (resultSet.next()) {
                    String author = resultSet.getString("author");
                    String text = resultSet.getString("messageText");
                    System.out.println(author + " : " + text);
                }
            }

        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
}

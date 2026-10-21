import java.sql.*;

public class db_Connection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{

        // Load and Register the driver

        Class.forName("org.postgresql.Driver");

        // Establish a Connection

        String url = "jdbc:postgresql://localhost:5432/Production";
        String user = "localhost";
        String password = "Prolim@1234567890";

        Connection conn = DriverManager.getConnection(url, user, password);

        // Create a Statement

        Statement st = conn.createStatement();

        // Execute a Query

        

        // Process the Result

        // Close the Connections

        st.close();
        conn.close();

    }
}

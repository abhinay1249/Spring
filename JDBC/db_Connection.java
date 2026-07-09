import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class db_Connection {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Load or Register the Driver

        Class.forName("net.snowflake.client.api.driver.SnowflakeDriver");
        
        // Establish a Connection

        String url = "jdbc:snowflake://dagljqb-ns91258.snowflakecomputing.com?db=PRODUCTION&schema=Hyderbad_Team&warehouse=COMPUTE_WH&role=ACCOUNTADMIN";
        String user = "abhinay";
        String password = "Kasmo@123456789";

        Connection conn = DriverManager.getConnection(url,user,password);

        // Create a Statement

        Statement statement = conn.createStatement();


        // Execute Query
        // Process the result


        // Close the Connection
        
        statement.close();
        conn.close();


    }
}

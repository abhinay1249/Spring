import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class db_Connection {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Load or Register the Driver

        Class.forName("net.snowflake.client.jdbc.SnowflakeDriver");
        
        // Establish a Connection

        String url = "jdbc:snowflake://dagljqb-ns91258.snowflakecomputing.com?db=PRODUCTION&schema=Hyderbad_Team&warehouse=COMPUTE_WH&role=ACCOUNTADMIN";
        String user = "abhinay";
        String password = "Kasmo@123456789";

        Connection conn = DriverManager.getConnection(url,user,password);

        // Create a Statement

        Statement statement = conn.createStatement();


        // Execute Query

        String query = "SELECT COUNT(*) FROM PRODUCTION.HYDERABAD_TEAM.EMPLOYEES;";
        ResultSet result = statement.executeQuery(query);
        
        // Process the result

        if(!(result.next())){
            System.out.println(" No Employee data is Found");
        }else{
            int count = result.getInt(1);
            System.out.println("The number of Employees are" + count);
        }
        

        // Close the Connection
        
        statement.close();
        conn.close();


    }
}

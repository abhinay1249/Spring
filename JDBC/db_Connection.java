import java.sql.Connection;
import java.sql.DriverManager;


public class db_Connection {
    
    public static void main(String[] args) throws Exception {
        Class.forName("net.snowflake.client.api.driver.SnowflakeDriver");
        
        String url = "https://dagljqb-ns91258.snowflakecomputing.com";
        String user = "abhinay";
        String password = "Kasmo@123456789";

        Connection conn = DriverManager.getConnection(url,user,password);


    }
}

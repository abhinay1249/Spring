import java.sql.Connection;
import java.sql.DriverManager;
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

        String query = "INSERT INTO PRODUCTION.HYDERABAD_TEAM.EMPLOYEES(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE, HIRE_DATE, SALARY, DEPARTMENT_ID) VALUES(200001,'Abhinay','Marise','abhinay@google.com','7075751249','2024-11-15',145695.00,7630)";
        
        // ResultSet result = statement.executeQuery(query);
        
        int rows = statement.executeUpdate(query);
        
        // Process the result

        // if(!(result.next())){
        //     System.out.println(" No Employee data is Found");
        // }else{
        //     int count = result.getInt(1);
        //     System.out.println("The number of Employees are" + count);
        // }

        if(rows != 0){
            System.out.println(" No Employee data is Found");
        }else{
            System.out.println("First_Name is Successfully Updated");
        }

        // Close the Connection
        
        statement.close();
        conn.close();


    }
}

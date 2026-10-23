import java.sql.*;

public class db_Connection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{

        // Load and Register the driver

        Class.forName("org.postgresql.Driver");

        // Establish a Connection

        String url = "jdbc:postgresql://localhost:5432/Production";
        String user = "postgres";
        String password = "Prolim@1234567890";

        Connection conn = DriverManager.getConnection(url, user, password);

        // Create a Statement

        Statement st = conn.createStatement();

        // Execute a Query
        
        String sqlQuery = "INSERT INTO EMPLOYEES.EMPLOYEE VALUES(1003, 'John', 'Steve', 'john@nvidia.com','Manager','2027-02-21',6281690098),(1004,'Dhruvi','Tej','dhruvi@microsoft.com','HR','2027-01-01',7676898901)";
        // String sqlQuery = "SELECT * FROM EMPLOYEES.EMPLOYEE;";
        int rows = st.executeUpdate(sqlQuery);
        // st.executeQuery(sqlQuery);

        // Process the Result

        if(rows == 0){
            System.out.println("Recheck the Sql Query");
        }else if(rows > 1){
            System.out.println(rows + " Rows Affected Successfully");
        }else{
            System.out.println(rows + " Row Affected Successfully");
        }

        // Close the Connections

        st.close();
        conn.close();

    }
}

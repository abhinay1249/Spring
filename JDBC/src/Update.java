// Establishing a Connection with Database and performing Update Operation.

import java.sql.*;

public class Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/Production";
        String user = "postgres";
        String password = "Prolim@1234567890";
        
        Connection conn = DriverManager.getConnection(url, user, password);

        Statement st = conn.createStatement();

        String sqlQuery = "UPDATE EMPLOYEES.EMPLOYEE SET FIRST_NAME = 'Smith' WHERE EMPLOYEE_ID = 1003";

        int rows = st.executeUpdate(sqlQuery);

        if(rows == 0){  
            System.out.println("SQL Query Failed");
        }else{
            System.out.println(rows + " row Affected Successfully");
        }

        st.close();
        conn.close();

    }
}
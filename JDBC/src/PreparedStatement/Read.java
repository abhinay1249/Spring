// Establish a connection with database and without hardcoding the details, perform the Read operation as inputs from the user.

package PreparedStatement;

import java.sql.*;
import java.util.*;
import utils.JDBCUtil;

public class Read {

    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scan = new Scanner(System.in);

        try {
        
            conn = JDBCUtil.getConnection();

            String sqlQuery = "SELECT * FROM EMPLOYEES.EMPLOYEE WHERE EMPLOYEE_ID = ?";

            pstmt = conn.prepareStatement(sqlQuery);

            


            

        } 
        
        catch (Exception e) {
        
        
        }




    }
    
}

// Establish a connection with database and without hardcoding the details perform the respective operation as inputs from the user.

package PreparedStatement;

import java.sql.*;
import utils.JDBCUtil;
import java.util.*;

public class Delete {
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scan = new Scanner(System.in);

        try {
            
            conn = JDBCUtil.getConnection();
            
            String sqlQuery = "DELETE FROM EMPLOYEES.EMPLOYEE WHERE EMPLOYEE_ID = ?";
            conn.prepareStatement(sqlQuery);

            System.out.println("Enter the Employee ID to be deleted: ");

            System.out.print("Enter the Employee ID: ");

            

        }
        
        catch (Exception e) {
        
        }

    }
}

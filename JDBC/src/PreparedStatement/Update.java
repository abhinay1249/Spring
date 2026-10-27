// Establish a connection with database and without hardcoding the details, perform the respective Update as inputs from the user.

package PreparedStatement;

import java.sql.*;
import java.util.Scanner;
import utils.JDBCUtil;

public class Update {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scan = new Scanner(System.in);

        try {
            
            conn = JDBCUtil.getConnection();

            String sqlQuery = "UPDATE EMPLOYEES.EMPLOYEE SET DEPARTMENT = ? WHERE EMPLOYEE_ID = ?"; 

            pstmt = conn.prepareStatement(sqlQuery);

            System.out.println("Enter Your Details to be Updated:");

            System.out.print("Enter your Department To be Updated: ");
            
            String department = scan.next();

            System.out.print("Enter you Employee ID that need to be Updated: ");

            Integer employeeId = scan.nextInt();

            pstmt.setString(1,department);
            pstmt.setInt(2, employeeId);

            int rows = pstmt.executeUpdate();

            switch(rows){
                case 0 -> System.out.println("SQL Query Failed");
                case 1 -> System.out.println(rows+" row Affected Successfully!");
                default -> System.out.println(rows+" rows Affected Successfully!");
            }

        } 
        
        catch (SQLException e) {
            e.printStackTrace();
        
        }

        catch(Exception e){
            e.printStackTrace();
        }

        finally{

            try {
                JDBCUtil.closeConnection(conn, pstmt);
                scan.close();
            } 
            
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

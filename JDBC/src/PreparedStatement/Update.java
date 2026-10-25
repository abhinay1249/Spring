// Establish a connection with database and without hardcoding the details perform the respective operation as inputs from the user.

package PreparedStatement;

import java.sql.*;
import java.util.Scanner;
import utils.JDBCUtil;

public class Update {
    
    public static void main(String[] args) {
        

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = JDBCUtil.getConnection();

            String sqlQuery = "UPDATE EMPLOYEES.EMPLOYEE SET DEPARTMENT = ? WHERE EMPLOYEE_ID = ?"; 

            pstmt = conn.prepareStatement(sqlQuery);

            System.out.println("Enter Your Details to be Updated:");

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter your Department To be Updated: ");
            
            String department = scan.next();

            System.out.print("Enter you Employee ID that need to be Updated: ");

            Integer employeeId = scan.nextInt();

            pstmt.setString(1,department);
            pstmt.setInt(2, employeeId);





        } 
        
        catch (SQLException e) {
            e.printStackTrace();
        
        }

        catch(Exception e){
            e.printStackTrace();
        }

        finally{

            try {
                


            } 
            
            catch (Exception e) {
                e.printStackTrace();
            }
        }




    }

}

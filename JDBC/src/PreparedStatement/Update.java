// Establish a connection with database and without hardcoding the details perform the respective operation as inputs from the user.

package PreparedStatement;

import java.sql.*;
import utils.JDBCUtil;

public class Update {
    
    public static void main(String[] args) {
        

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = JDBCUtil.getConnection();

            String sqlQuery = "UPDATE EMPLOYEES.EMPLOYEE SET DEPARTMENT = ? WHERE EMPLOYEE_ID = ?"; 

            pstmt = conn.prepareStatement(sqlQuery);







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

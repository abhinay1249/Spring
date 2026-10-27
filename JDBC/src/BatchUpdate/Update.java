// Establish a connection with database and perform multiple Updates upon once connecting to the database 

package BatchUpdate;

import java.sql.*;
import utils.JDBCUtil;

public class Update {

    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            conn = JDBCUtil.getConnection();

            String sqlQuery = "UPDATE EMPLOYEES.EMPLOYEE SET LAST_NAME = ? WHERE EMPLOYEE_ID = ?";
            pstmt = conn.prepareStatement(sqlQuery);

            pstmt.setString(1,"M");
            pstmt.setInt(2,1001);
            pstmt.addBatch();

            pstmt.setString(1,"M");
            pstmt.setInt(2,1002);
            pstmt.addBatch();
            
            pstmt.setString(1,"T");
            pstmt.setInt(2,1003);
            pstmt.addBatch();

            pstmt.executeBatch();

            System.out.println("The neccesary Updates are performed in the Database!");
            
        } 

        catch(SQLException e){
            e.printStackTrace();
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        finally{
            
            try {
                JDBCUtil.closeConnection(conn, pstmt);    
            } 
            
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

// Establish a connection with database and perform multiple Deletes upon once connecting to the database.

package BatchUpdate;

import java.sql.*;
import utils.JDBCUtil;

public class Delete {
    
    public static void main(String[] args) {
    
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = JDBCUtil.getConnection();

            String sqlQuery = "DELETE FROM EMPLOYEES.EMPLOYEE WHERE EMPLOYEE_ID = ?";
            pstmt = conn.prepareStatement(sqlQuery);

            pstmt.setInt(1,1008);
            pstmt.addBatch();

            pstmt.setInt(1,1007);
            pstmt.addBatch();

            pstmt.executeBatch();

            System.out.println("The neccesary Deletes are performed in the Database!");

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
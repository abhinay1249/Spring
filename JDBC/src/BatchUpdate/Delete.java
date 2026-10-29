// Establish a connection with database and perform multiple Deletes upon once connecting to the database.

package BatchUpdate;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.JDBCUtil;

public class Delete {
    
    public static void main(String[] args) {
    
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = JDBCUtil.getConnection();

            String sqlQuery = "DELETE FROM EMPLOYEES.EMPLOYEE WHERE EMPLOYEE_ID = ?";
            pstmt = conn.preparedStatement(sqlQuery);




        } 

        catch(SQLException e){
            e.printStackTrace();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
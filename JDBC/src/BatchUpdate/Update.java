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

            String sqlQuery = "UPDATE EMPLOYEES.EMPLOYEE SET = WHERE EMPLOYEE_ID = ";
            pstmt = conn.prepareStatement(sqlQuery);

            pstmt.set(1,);
            pstmt.setInt(2,);
            pstmt.addBatch();

            pstmt.set(1,);
            pstmt.setInt(2,);
            pstmt.addBatch();
            
            pstmt.set(1,);
            pstmt.setInt(2,);
            pstmt.addBatch();

            pstmt.executeBatch();

            
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }


    }
    
}

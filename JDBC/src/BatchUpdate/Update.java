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

            String sqlQuery = "UPDATE EMPLOYEES.EMPLOYEE SET ";

            pstmt = conn.prepareStatement(sqlQuery);

            
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }


    }
    
}

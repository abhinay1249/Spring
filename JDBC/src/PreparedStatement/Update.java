// Establish a connection with database and without hardcoding the details perform the respective operation as inputs from the user.

package PreparedStatement;

import src.JDBCUtil;
import java.sql.*;

public class Update {
    
    public static void main(String[] args) {
        

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = JDBCUtil.getConnection();



        } 
        
        catch (Exception e) {
        
        }




    }

}

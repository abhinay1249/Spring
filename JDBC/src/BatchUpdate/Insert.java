// Establish a connection with database and perform multiple Inserts upon once connecting to the database.

package BatchUpdate;

import java.sql.*;
import utils.JDBCUtil;

public class Insert {
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = JDBCUtil.getConnection();

            String sqlQuery = "INSERT INTO EMPLOYEES.EMPLOYEE VALUES(?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sqlQuery);

            pstmt.setInt(1,1006);
            pstmt.setString(2,"Pranav");
            pstmt.setString(3,"Sangichetty");
            pstmt.setString(4,"pranav@ltm.com");
            pstmt.setString(5,"Data Scientist");
            pstmt.setDate(6, Date.valueOf("2026-01-10"));
            pstmt.setLong(7,9381918380L);
            pstmt.addBatch();

            pstmt.setInt(1,1007);
            pstmt.setString(2,"Sandeep");
            pstmt.setString(3,"G");
            pstmt.setString(4,"sandeep@ctrls.com");
            pstmt.setString(5,"Python Developer");
            pstmt.setDate(6, Date.valueOf("2026-10-10"));
            pstmt.setLong(7,7032195391L);
            pstmt.addBatch();

            pstmt.setInt(1,1008);
            pstmt.setString(2,"Ram");
            pstmt.setString(3,"R");
            pstmt.setString(4,"ram@vxi.com");
            pstmt.setString(5,"Salesforce Consultant");
            pstmt.setDate(6, Date.valueOf("2023-04-19"));
            pstmt.setLong(7,6290453891L);
            pstmt.addBatch();
            
            pstmt.executeBatch();

            System.out.println("The neccesary Inserts are performed in the Database!");
        
        }
        
        catch (SQLException e){
            e.printStackTrace();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
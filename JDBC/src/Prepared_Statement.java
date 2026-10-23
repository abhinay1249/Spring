
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Establish a connection with database and without hardcoding the details perform the respective inputs from the user.

public class Prepared_Statement {
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pst = null;

        try {

            conn = JDBCUtil.getConnection();

            String sql = "INSERT INTO EMPLOYEES.EMPLOYEE VALUES(?,?,?,?,?,?,?)";

            conn.prepareStatement(sql);








        } 
        
        catch (SQLException e) {
            e.printStackTrace();
        }

        catch (Exception e){
            e.printStackTrace();
        }

        




    }
}
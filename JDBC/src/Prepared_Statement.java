
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Establish a connection with database and without hardcoding the details perform the respective inputs from the user.

public class Prepared_Statement {
    public static void main(String[] args) {
        
        Connection con = null;
        Statement st = null;
        PreparedStatement pst = null;

        try {

            con = JDBCUtil.getConnection();

            st = con.();






        } 
        
        catch (SQLException e) {
            e.printStackTrace();
        }

        catch (Exception e){
            e.printStackTrace();
        }

        




    }
}
// Create a Class where this will be base reference and include the static methods in it such that it can be invoked by other classes.

import java.sql.*;

public class JDBCUtil {

    static {
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }

    public static Connection getConnection() throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/Production";
        String user = "postgres";
        String password = "Prolim@1234567890";

        return DriverManager.getConnection(url, user, password);

    }
    
}

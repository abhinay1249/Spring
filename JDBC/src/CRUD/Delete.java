
import java.sql.*;

// Establishing a Connection with Database and performing Delete Operation.

public class Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/Production";
        String user = "postgres";
        String password = "Prolim@1234567890";

        Connection conn = DriverManager.getConnection(url, user, password);

        Statement st = conn.createStatement();

        String sqlQuery = "DELETE FROM EMPLOYEES.EMPLOYEE WHERE EMPLOYEE_ID = 1003";
        int rows = st.executeUpdate(sqlQuery);

        switch(rows) {

            case 0 -> System.out.println("SQL Query Failed");

            case 1 -> System.out.println(rows + " row Affected Successfully");

            default -> System.out.println(rows + " rows Affected Successfully");

        }

        st.close();
        conn.close();

    }
}
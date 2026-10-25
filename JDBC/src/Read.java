// Establishing a Connection with Database and performing Read Operation.

import java.sql.*;

public class Read {

    public static void main(String[] args)  throws ClassNotFoundException, SQLException{
        
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/Production";
        String user = "postgres";
        String password = "Prolim@1234567890";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement st = con.createStatement();

        String sql = "SELECT * FROM EMPLOYEES.EMPLOYEE";
        
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            System.out.println(rs.getInt("EMPLOYEE_ID")+" "+rs.getString("FIRST_NAME")+" "+rs.getString("LAST_NAME")+" "+rs.getString("EMAIL_ID")+" "+rs.getString("DEPARTMENT")+" "+rs.getDate("HIRE_DATE")+" "+rs.getLong("PHONE_NUMBER"));
        }

        st.close();
        con.close();

    }
}
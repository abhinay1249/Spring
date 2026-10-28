// Establishing a Connection with Database and Utilizing Singele Execute Query to Perfrom CRUD Operations

import java.sql.*;

public class Consolidated {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // Load or Register the Driver

            Class.forName("org.postgresql.Driver");

        // Establish a Connection

            String url = "jdbc:postgresql://localhost:5432/Production";
            String user = "postgres";
            String password = "Prolim@1234567890";

            Connection con = DriverManager.getConnection(url, user, password);

        Statement st = con.createStatement();

        String sqlQuery = "SELECT * FROM EMPLOYEES.EMPLOYEE";

        boolean status = st.execute(sqlQuery);

        if(status){

            ResultSet res = st.getResultSet();
            
            while(res.next()){
                System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getString(5)+" "+res.getDate(6)+" "+res.getLong(7));
            }
            
        }else{
            
            int rows = st.getUpdateCount();

            switch(rows){
                case 0 -> System.out.println("SQL Query Failed");
                case 1 -> System.out.println(rows + " row Affected Succesfully!");
                default -> System.out.println(rows + " rows Affected Successfully!");
            }

        }

        st.close();
        con.close();

    }
}
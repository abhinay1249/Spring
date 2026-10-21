// Establish a Connection with the database without ducking the exceptions rather handle them and perform usage of Utils.

import java.sql.*;

public class db_Connection {
    
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try {
        
            Class.forName("org.postgresql.Driver");

            conn = JDBCUtil.getConnection();

            st = conn.createStatement();

            
            String sqlQuery = "SELECT * FROM EMPLOYEES.EMPLOYEE";

            ResultSet res = st.executeQuery(sqlQuery);

            while(res.next()){
                System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getString(5)+" "+res.getDate(6)+" "+res.getLong(7));
            }

        }

        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        finally {
            
            try{
                JDBCUtil.closeConnection(conn, st);
            }catch(SQLException e){
                e.printStackTrace();
            }
           
        }
    }

}
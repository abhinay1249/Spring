// Establish a connection with database and without hardcoding the details perform the respective inputs from the user.

import java.sql.*;
import java.util.Scanner;

public class Prepared_Statement {
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement pst = null;

        try {

            conn = JDBCUtil.getConnection();

            String sql = "INSERT INTO EMPLOYEES.EMPLOYEE(Employee_Id, First_Name, Last_Name, Email_Id, Department, Hire_Date, Phone_Number) VALUES(?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);

            System.out.println("Enter Employee Details:");

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Employee Id: ");

            Integer employee_id = scan.nextInt();

            System.out.print("Enter First Name: ");

            String first_name = scan.next();

            System.out.print("Enter Last Name: ");

            String last_name = scan.next();
            
            System.out.print("Enter Email Id: ");

            String  email_id= scan.next();
            
            System.out.print("Enter Department: ");

            String department = scan.next();
            
            System.out.print("Enter Hire Date: ");

            String hire_date = scan.next();
            
            System.out.print("Enter Phone Number: ");

            Long phone_number = scan.nextLong();

            pst.setInt(1, employee_id);
            pst.setString(2, first_name);
            pst.setString(3, last_name);
            pst.setString(4, email_id);
            pst.setString(5, department);
            pst.setDate(6, Date.valueOf(hire_date));
            pst.setLong(7, phone_number);

            int rows = pst.executeUpdate();

            switch(rows){
                case 0 -> System.out.println("SQL Query Failed!");
                case 1 -> System.out.println(rows +" row Affected Successfully!");
                default -> System.out.println(rows + " rows Affected Successfully!");
            }

        } 
        
        catch (SQLException e) {
            e.printStackTrace();
        }

        catch (Exception e){
            e.printStackTrace();
        }

        finally {

            try {
                JDBCUtil.closeConnection(conn, pst);    
            } 
            
            catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
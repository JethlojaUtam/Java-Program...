//Java program in static qaury with create table...

import java.sql.*;

public class Create
{
    public static void main(String[] args)
    {
        Connection con;
        PreparedStatement pst;
        Statement st;
        try
        {
            //Step 01-SQL Connect
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            System.out.println("DB Connected!!!");
            
            //Step 02-Static create table quary
            st=con.createStatement();
            pst=con.prepareStatement("create table employee(emp_id int,emp_name varchar(20),emp_salary int(5),emp_desig varchar(20),emp_department varchar(30))");
            pst.execute();
            
            System.out.println("Table Created!!!");
        }
        catch(Exception e)
        {
            System.out.println("Error!!!"+e);
        }
    }
}
//Java program in static qaury with delete...

import java.sql.*;

import java.util.Scanner;

public class Delete
{
    public static void main(String[] args)
    {
        Connection con;
        PreparedStatement pst;
        Statement st;
        try
        {
            //Step 01-SQL Connect with delete record
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            System.out.println("DB Connected!!!");
            
            //Step 02-Static delete quary
            st=con.createStatement();
            pst=con.prepareStatement("delete from employee where emp_salary=?");
            System.out.println("Enter the employee salary:");
            
            //Step 04-Scanner Class with user input
            Scanner sc=new Scanner(System.in);
            int salary=sc.nextInt();
            pst.setInt(1, salary);
            
            int ans=pst.executeUpdate();
            System.out.println(ans+" Record Deleted");
        }
        catch(Exception e)
        {
            System.out.println("Error!!!"+e);
        }
    }
}
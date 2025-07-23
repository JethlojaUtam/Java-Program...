//Java program in static qaury with select...

import java.sql.*;

import java.util.Scanner;

public class Select
{
    public static void main(String[] args)
    {
        Connection con;
        PreparedStatement pst;
        Statement st;
        ResultSet rs;
        try
        {
            //Step 01-SQL Connect with select record
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            System.out.println("DB Connected!!!");

            //Step 02-Static delete quary
            st=con.createStatement();
            pst=con.prepareStatement("select * from employee where emp_salary=?");
            
            //Step 04-Scanner Class with user input
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the employee salary:");
            int salary=sc.nextInt();
            pst.setInt(1, salary);
            rs=pst.executeQuery();
            
            System.out.println("Record Selected");
            
            //Step 03-While loop in data records
            while(rs.next())
            {
                System.out.println("Employee id:"+rs.getInt("emp_id"));
                System.out.println("Employee name:"+rs.getString("emp_name"));
                System.out.println("Employee salary:"+rs.getInt("emp_salary"));
                System.out.println("Employee desig:"+rs.getString("emp_desig"));
                System.out.println("Employee department:"+rs.getString("emp_department"));
                
                System.out.println("Record Selected!!!");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error!!!"+e);
        }
    }
}
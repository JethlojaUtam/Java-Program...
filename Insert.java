//Java program in static qaury with insert...

import java.sql.*;

import java.util.Scanner;

public class Insert
{
    public static void main(String[] args)
    {
        Connection con;
        PreparedStatement pst;
        Statement st;
        try
        {
            //Step 01-SQL Connect with insert record
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            System.out.println("DB Connected!!!");
            
            //Step 02-Static insert quary
            st=con.createStatement();
            pst=con.prepareStatement("insert into employee values(?,?,?,?,?)");
            System.out.println("How many insert record?:");
            
            //Step 03-Scanner Class with user input
            Scanner sc;
            sc = new Scanner(System.in);
            int user=sc.nextInt();
            
            //Step 04-For loop in records
            int i;
            for(i=1;i<=user;i++)
            {
                System.out.println("Enter the employee id:");
                int id=sc.nextInt();
                System.out.println("Enter the employee name:");
                String name=sc.next();
                System.out.println("Enter the employee salary:");
                int salary=sc.nextInt();
                System.out.println("Enter the employee desig:");
                String desig=sc.next();
                System.out.println("Enter the employee department:");
                String department=sc.next();
                pst.setInt(1, id);
                pst.setString(2, name);
                pst.setInt(3, salary);
                pst.setString(4, desig);
                pst.setString(5, department);
                
                int ans=pst.executeUpdate();
                System.out.println(ans+" Record Inserted!!!");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error!!!"+e);
        }
    }
}
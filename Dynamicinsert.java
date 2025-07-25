//Java program in dynamic qaury with insert...

import java.sql.*;

import java.util.Scanner;

public class Dynamicinsert 
{  
    public static void main(String[] args)
    {   
        Connection con;
        PreparedStatement pst;
        try
        {
            //Step 01-SQL Connect with insert record
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            
            //Step 02-Dynamic insert quary
            pst=con.prepareStatement("insert into student values(?,?)");
            System.out.println("DB Connect..");
            
            //Step 03-Scanner Class
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Rollno.: ");
            int roll=sc.nextInt();
            System.out.println("Enter the Name: ");
            String name=sc.next();
            
            //Step 04-Validation in error time
            pst.setInt(1, roll);
            pst.setString(2, name);
            int ans=pst.executeUpdate();
            System.out.println(ans+" Record inserted");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Error.."+e);
        }
    }
}

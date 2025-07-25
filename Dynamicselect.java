//Java program in dynamic qaury with select...

import java.sql.*;

import java.util.Scanner;

public class Dynamicselect 
{
    public static void main(String[] args)
    {
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        try
        {
            //Step 01-SQL Connect with insert record
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            
            //Step 02-Scanner Class
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Rollno: ");
            int roll=sc.nextInt();
            
            //Step 03-Dynamic select quary
            pst=con.prepareStatement("select * from student where roll>1");
            pst.setInt(1, roll);
            rs=pst.executeQuery();
            
            //Step 04-Record Data
            while(rs.next())
            {
                System.out.println("Rollno: "+rs.getInt(1));
                System.out.println("Name: "+rs.getString(2));
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Error.."+e);
        }
    }
}

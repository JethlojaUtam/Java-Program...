//Java program in dynamic qaury with delete...

import java.sql.*;

import java.util.*;

public class Dynamicdelete 
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
            
            //Step 02-Scanner Class
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Rollno: ");
            int roll=sc.nextInt();
            
            //Step 03-Dynamic delete quary
            pst=con.prepareStatement("delete from student where roll=?");
            pst.setInt(1, roll);
            int delete=pst.executeUpdate();
            
            //Step 04-if..else.. Condition
            if(delete>0)
            {
                System.out.println(delete+" Record Deleted");
            }
            else
            {
                System.out.println("Not Record Deleted");
            }
            con.close();
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println("Error.."+e);
        }
    }
}

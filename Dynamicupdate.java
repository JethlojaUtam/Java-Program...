//Java program in dynamic qaury with update...

import java.sql.*;

import java.util.Scanner;

public class Dynamicupdate 
{
    public static void main(String[] args)
    {
        try
        {
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
            Statement st;
            
            //Step 01-SQL Connect with update record
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            System.out.println("DB Connected!!!");
            
            //Step 02-Dynamic update Quary
            pst=con.prepareStatement("update employee set Name=? where id=?");
            
            //Step 03-Scanner Class
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the id:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the New Name:");
            String name=sc.nextLine();
            pst.setString(1, name);
            pst.setInt(2, id);
            
            int ans=pst.executeUpdate();
            System.out.println(ans+" Record Updated Successfully!!!");
        }
        catch(Exception e)
        {
            System.out.println("Error.."+e);
        }
    }
}

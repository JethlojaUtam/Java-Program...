//Java program in dynamic qaury with update...

import java.sql.*;

import java.util.Scanner;

public class Update 
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
            pst=con.prepareStatement("update employee set emp_name = ?, emp_salary = ?, emp_desig = ?, emp_department = ? where emp_id = ?");
            
            //Step 03-Scanner Class with user input
            Scanner sc=new Scanner(System.in);
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
            pst.setString(1, name);
            pst.setInt(2, salary);
            pst.setString(3, desig);
            pst.setString(4, department);
            pst.setInt(5, id);
            
            int ans=pst.executeUpdate();
            System.out.println(ans+" Record Updated");
            
            pst.close();
            con.close();
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println("Error.."+e);
        }
    }
}

//Java project in static quary with select...

import java.sql.*;

import java.util.Scanner;

public class Staticselect 
{
    public static void main(String[] args)
    {
        Connection con;
        ResultSetMetaData rsm;
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        int roll;
        String name;
        try
        {
            //Step 01-JDBC Driver connect
            Class.forName("com.mysql.jdbc.Driver");
            //Step 01.1-MYSQL connect
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            System.out.println("DB Connect..");
            
            //Step 02-Static select quary
            pst=con.prepareStatement("select * from student where roll>1");
            st=con.createStatement();
            rs=st.executeQuery("select * from student");
            
            //Step 03
            while(rs.next())
            {
                roll=rs.getInt(1);
                name=rs.getString(2);
                System.out.println("Rollno.: "+roll);
                System.out.println("Name: "+name);
            }
            con.close();          
            }
        catch(Exception e)
        {
            System.out.println("Error.."+e);
        }
    }
}
//Java program in a write file and read file...

import java.io.*;

public class File 
{
    public static void main(String[] args)
    {
        try
        {
            //Write the file
            FileWriter fw=new FileWriter("New_Test.txt");
            fw.write("I m studying in Atmiya University");
            fw.close();
            System.out.println("File write is successfully");
            //Reading the file
            FileReader fr=new FileReader("New_Test.txt");
            {
                int i;
                while((i=fr.read())!=-1)
                {
                    System.out.print((char)i);
                }
            }
            System.out.println();
            System.out.println("\nFile read is successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("\nSuccess!!!");
    }
}

/*
run time output:
File write is successfully
I m studying in Atmiya University

File read is successfully

Success!!!
*/
//Java program in a copy file...

import java.io.*;

public class Filecopy 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fin=new FileInputStream("New_Test.txt");
        FileOutputStream fout=new FileOutputStream("Old_Test.txt");
        int i=0;
        while((i=fin.read())!=-1)
        {
            fout.write((byte)i);
        }
        System.out.println("File is copied!!!");
        fin.close();
        fout.close();
    }
}

/*
run time output:
File is copied!!!
*/
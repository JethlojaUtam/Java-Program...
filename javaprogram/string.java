/*
Program 09
Write a program to do the following using in-built methods in the string class of java.
a.Find the 3rd character in the string "Atmiya University" 
b.Find the index of character ‘o’ in string "Java Programming".
c.Convert the string "Enjoy Holiday" to uppercase.
d.Replace character 'H' with 'n' in the string "Hello… Hi..”.
*/

public class string 
{   
    public static void main(String[] args)
    {
        String str1 = "Atmiya University";
        System.out.println("This string is: "+str1);
        
        String str2 = "Atmiya University";
        char find = str2.charAt(2);
        System.out.println("The 3rd character is: "+find);
        
        String str3 = "Java Programming";
        int find1 = str3.indexOf("o");
        System.out.println("The index of character ‘o’ in string: "+find1);
        
        String str4 = "Enjoy Holiday";
        String find2 = str4.toUpperCase();
        System.out.println("Enjoy Holiday is uppercase: "+find2);
        
        String str5 = "Hello... Hi...";
        String find3 = str5.replace("H", "n");
        System.out.println("Replace character 'H' with 'n' in the string: "+find3);
    }
}

/*
Program 09
Write a program to do the following using in-built methods in the string class of java.
a.Find the 3rd character in the string "Atmiya University" 
b.Find the index of character ‘o’ in string "Java Programming".
c.Convert the string "Enjoy Holiday" to uppercase.
d.Replace character 'H' with 'n' in the string "Hello… Hi..”.
*/

public class in_built_string
{
    public static void main (String args[])
    {
        String str = "Atmiya University";
        System.out.println("This String is: "+str);

        String str1 = "Atmiya University";
        char find = str1.charAt(2);
        System.out.println("The 3rd Character of this sting is: "+find);
            
        String str2 = "Java Programming";
        int index = str2.indexOf('o');
        System.out.println("This String are Find a Character 'o' is: "+index);

        String str3 = "Enjoy Holiday";
        String upper = str3.toUpperCase();
        System.out.println("This String are Converted into Uppercase Latter: "+upper);

        String str4 = "Hello... Hi...";
        String replace = str4.replace('H','n');
        System.out.println("This String are Replace in: "+replace);
    }
}

/*
run:
This String is: Atmiya University
The 3rd Character of this sting is: m
This String are Find a Character 'o' is: 7
This String are Converted into Uppercase Latter: ENJOY HOLIDAY
This String are Replace in: nello... ni...
*/
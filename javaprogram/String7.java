/*
Program 07 
Write a program that finds the length of the string “Java Programming”. 
And also display a sub-string formed by the last five characters of the string. ( use String class)
 */

class String7
{
    public static void main(String[] args)
    {
        String str1 = "Java Programming";
        System.out.println("This String is: "+str1);
        
        int len=str1.length();
        System.out.println("length is: "+len);
        
        String utam=str1.substring(len-5);
        System.out.println("Last 5 element is: "+utam);
    }
}

/*run:
This String is: Java Programming
length is: 16
Last 5 element is: mming
*/
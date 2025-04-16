import MathPack.MathDemo;
public class Main
{
    public static void main(String[] args)
    {
        MathDemo m1=new MathDemo();
        int sum=m1.add(10, 5);
        int sub=m1.sub(2, 1);
        System.out.println("Addition is: "+sum);
        System.out.println("Substraction is: "+sub);
    }
}
    
/*run:
Addition is: 15
Substraction is: 1
*/

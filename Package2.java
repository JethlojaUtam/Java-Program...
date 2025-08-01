//Second package create
package Package2;	//new package create
import Package1.Package1;	//above file join
class Package2
{
public static void main(String[] args)
{
Package1 p1=new Package1();
p1.setData(5,6);
p1.display();
}
}

//Output run time
//javac -d . Package2.java	(package in command)
//java Package2.Package2
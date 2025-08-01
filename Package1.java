//How to create Package
package Package1;	//new package create
public class Package1
{
private int x;
private int y;
public void setData(int p, int q)
{
x=p;
y=q;
}
public void display()
{
System.out.println(x);
System.out.println(y);
}
}

//Output run time
//javac -d . Package1.java	(package in command)
/*
Program 06
Create a Shape class as the abstract class with abstract method draw( ), its implementation is provided by the Rectangle & Circle classes. 
Create a reference of Shape class and if you create the instance of Rectangle class, draw() method of Rectangle class will be invoked. 
And same for Circle class.
(Dynamic Method Dispatch)
*/

abstract class shape 
{
    abstract void draw();   
}
class Ractangle extends shape
{
    void draw()
    {
        System.out.println("This is Ractangle CLass...");
    }
}
class Circle extends shape
{
    void draw()
    {
        System.out.println("This is Circle Class...");
    }
}
class Shape
{
    public static void main(String[] args)
    {
        shape s1;
        
        s1=new Ractangle();
        s1.draw();
        
        s1=new Circle();
        s1.draw();
    }
}

/*run:
This is Ractangle CLass...
This is Circle Class...
*/
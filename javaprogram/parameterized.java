/*
Program 05
In above classes define parameterized constructor to initialize instance variable. 
Create two objects and demonstrate.
*/

class parameterized 
{
    int roll;
    String name;
    
    public parameterized(int roll, String name)
    {
        this.roll=roll;
        this.name=name;
    }
    
    void display()
    {
        System.out.println("Roll No. is: "+roll);
        System.out.println("Name is: "+name);
    }
    
    public static void main(String[] args)
    {
        parameterized p1=new parameterized(1,"Utam");
        p1.display();
        
        System.out.println();
        
        parameterized p2=new parameterized(2,"Niketan");
        p2.display();
    }
}

/*run:
Roll No. is: 1
Name is: Utam

Roll No. is: 2
Name is: Niketan
*/
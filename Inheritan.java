//Java program in constructor with hierarchical inheritance...

class Person2
{
    String name;
    Person2(String name)
    {
        this.name=name;
    }
}
class Student1 extends Person2
{
    int rollno;
    String division;
    Student1(String name, int rollno, String division)
    {
        super(name);
        this.rollno=rollno;
        this.division=division;
        System.out.println();
    }
    void display()
    {
        System.out.println("Student name:"+name);
        System.out.println("Student rollno:"+rollno);
        System.out.println("Student division:"+division);
    }
}   
class Internal extends Student1
{
    int cia1,cia2,assingment;
    Internal(String name, int rollno, String division, int cia1, int cia2, int assingment)
    {
        super(name,rollno,division);
        this.cia1=cia1;
        this.cia2=cia2;
        this.assingment=assingment;
    }
    void display()
    {
        super.display();
        System.out.println("Student cia1:"+cia1);
        System.out.println("Student cia2:"+cia2);
        System.out.println("Student assingment:"+assingment);
    }
    void countMark()
    {
        System.out.println("Student total internal mark:"+(cia1+cia2+assingment));
    }
}
class External extends Internal
{
    int mark;
    External(String name, int rollno, String division, int cia1, int cia2, int assingment, int mark) 
    {
        super(name, rollno, division, cia1, cia2, assingment);
        this.mark=mark;
    }
    void display()
    {
        super.display();
        System.out.println("Student mark:"+mark);
    }
    void result()
    {
        System.out.println("Student total mark:"+(mark+cia1+cia2+assingment));
    }
}
public class Inheritan
{
    public static void main(String[] args)
    {
        Student s1=new Student("Niketan",11,"y1");
        s1.display();
        Internal i1=new Internal("Adarsh",13,"y2",20,28,20);
        i1.display();
        i1.countMark();
        External e1=new External("Utam",12,"y3",22,27,20,30);
        e1.display();
        e1.result();
    }
}

/*
run time output:
Name is:Niketan
Rollno is:11
Course is:y1

Student name:Adarsh
Student rollno:13
Student division:y2
Student cia1:20
Student cia2:28
Student assingment:20
Student total internal mark:68

Student name:Utam
Student rollno:12
Student division:y3
Student cia1:22
Student cia2:27
Student assingment:20
Student mark:30
Student total mark:99
*/
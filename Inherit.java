//Java program in contructor with hierarchical inheritance...

class Person
{
    String Name;
    Person(String Name)
    {
        this.Name=Name;
    }
}
class Student extends Person
{
    int Rollno;
    String Course;
    Student(String Name, int Rollno, String Course)
    {
        super(Name);
        this.Rollno=Rollno;
        this.Course=Course;
    }
    void display()
    {
        System.out.println("Name is:"+Name);
        System.out.println("Rollno is:"+Rollno);
        System.out.println("Course is:"+Course);
    }
}
class Graduate extends Student
{
    String Branch;
    Graduate(String Name, int Rollno, String Course, String Branch)
    {
        super(Name, Rollno, Course);
        this.Branch=Branch;
    }
    void display()
    {
        super.display();
        System.out.println("Branch is:"+Branch);
        System.out.println();
    }
}
class PostGraduate extends Student
{
    String Branch,Grade;
    PostGraduate(String Name, int Rollno, String Course, String Branch, String Grade)
    {
        super(Name, Rollno, Course);
        this.Branch=Branch;
        this.Grade=Grade;
    }
    void display()
    {
        super.display();
        System.out.println("Post Branch is:"+Branch);
        System.out.println("Grade is:"+Grade);
        System.out.println();
    }
}        
class Teacher extends Person
{
    String Qualification, Designation;
    Teacher(String Name, String Qualification, String Designation)
    {
        super(Name);
        this.Qualification=Qualification;
        this.Designation=Designation;
    }
    void display()
    {
        System.out.println("Teacher name is:"+Name);
        System.out.println("Qualification is:"+Qualification);
        System.out.println("Designation is:"+Designation);
    }
    void setQualification(String Qualification)
    {
        this.Qualification=Qualification;
    }
    void promote(String Designation)
    {
        this.Designation=Designation;   
    }
}
public class Inherit 
{
    public static void main(String[] args)
    {
        Graduate g1=new Graduate("Dr. Utam",1,"Java","B.sc");
        g1.display();
        PostGraduate p1=new PostGraduate("Dr. Niketan",2,"Mathematics","M.sc","A");
        p1.display();
        Teacher t1=new Teacher("Dr. Adarsh","P.hd","Mathematics");
        t1.display();
        t1.setQualification("P.hd 1");
        t1.promote("A+");
        t1.display();
    }
}

/*
run:
Name is:Dr. Utam
Rollno is:1
Course is:Java
Branch is:B.sc

Name is:Dr. Niketan
Rollno is:2
Course is:Mathematics
Post Branch is:M.sc
Grade is:A

Teacher name is:Dr. Adarsh
Qualification is:P.hd
Designation is:Mathematics
Teacher name is:Dr. Adarsh
Qualification is:P.hd 1
Designation is:A+
*/
/*
Program 04
Define a class University having instance variable uname, ucity and tot_stud. 
Define getUni() method to initialize instance variable. 
Define derived class Department having instance variable deptno and deptname. 
Define getDept() method to initialize instance variable. 
Also define display() method to display all information. 
Create two objects and demonstrate.
 */

class uni 
{
    String uname;
    String ucity;
    int tot_stud;
    
    void getUni(String uname, String ucity, int tot_stud)
    {
        this.uname=uname;
        this.ucity=ucity;
        this.tot_stud=tot_stud;
    }
}
class Deparment extends uni
{
    int deptno;
    String deptname;
    
    void getDept(int deptno, String deptname)
    {
        this.deptno=deptno;
        this.deptname=deptname;
    }
    void display()
    {
        System.out.println("Name of student: "+uname);
        System.out.println("City of university: "+ucity);
        System.out.println("No of student: "+tot_stud);
        System.out.println("No of department: "+deptno);
        System.out.println("Name of department: "+deptname);
    }
}
class University
{
    public static void main(String[] args)
    {
        Deparment d1=new Deparment();
        d1.getUni("Utam University","Morbi",50);
        d1.getDept(1,"Mathematics");
        d1.display();
        
        System.out.println();
        
        Deparment d2=new Deparment();
        d2.getUni("Adarsh University","Rajkot",25);
        d2.getDept(2,"Physics");
        d2.display();
    }
}

/*run:
Name of student: Utam University
City of university: Morbi
No of student: 50
No of department: 1
Name of department: Mathematics

Name of student: Adarsh University
City of university: Rajkot
No of student: 25
No of department: 2
Name of department: Physics
*/
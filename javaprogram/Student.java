/*
Program 02
Define a class named Student having data member’s name, age, gender (m/f) and various overloaded constructors for accepting the 
details of student and display method to display information of student.
*/

class Student
{
    String name;
    int age;
    String gender;

    public Student(String name,int age,String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void disp()
    {
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student Gender: "+gender);
    }
    public static void main(String args[])
    {
        Student s1 = new Student("Utam",21,"M");
        s1.disp();
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*run:
Student Name: Utam
Student Age: 21
Student Gender: M
*/
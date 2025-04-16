/*
Program 10
Declare a class called Author having author_name as private data member.Extend author class to have two sub classes 
called Book_Publication & Paper_Publication. Each of these classes have private member called title. Show usage of dynamic method dispatch 
(dynamic polymorphism) to display book or paper publications of a given author. 
*/ 

class Author1
{
    private String author_name;

    public Author1(String author_name)
    {
        this.author_name = author_name;
    }
    public void disp()
    {
        System.out.println("Author Name is: "+author_name);
    }

}
class Book_Publication extends Author1
{
    private String title;

    public Book_Publication(String author_name,String title)
    {
        super(author_name);
        this.title = title;
    }
    public void disp()
    {
        super.disp();
        System.out.println("Book_Publication Title is: "+title);
    }
}

class Paper_Publication extends Author1
{
    private String title;

    public Paper_Publication(String author_name,String title)
    {
        super(author_name);
        this.title = title;
    }
    public void disp()
    {
        super.disp();
        System.out.println("Paper_Publication Title is: "+title);
    }    
}

public class Author
{
    public static void main (String args[])
    {
        Author1 ref;
        ref = new Paper_Publication("XYZ","Divya-bhaskar");
        ref.disp();

        ref = new Book_Publication("MNO", "Gujarat Samachar");
        ref.disp();   
    }
}

/*
run:
Author Name is: XYZ
Paper_Publication Title is: Divya-bhaskar
Author Name is: MNO
Book_Publication Title is: Gujarat Samachar
*/
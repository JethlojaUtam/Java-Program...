/*
Program 19
Create a user-defined interface &quot;Clickable&quot; with a method &quot;click.&quot; 
Implement this interface in classes like &quot;Button&quot; and &quot;Link.&quot; 
Show how these classes use the &quot;click&quot; method.
*/

interface Click {

    public void click();
}

class Button implements Click
{

    public void click() 
    {
        System.out.println("Button clicked.");
    }
}

class Link implements Click
{

    public void click() 
    {
        System.out.println("Link clicked.");
    }
}

public class Clickable 
{

    public static void main(String[] args) {
        Button button = new Button();
        Link link = new Link();

        button.click();
        link.click();
    }
}

/*
run:
Button clicked...
Link clicked...
*/
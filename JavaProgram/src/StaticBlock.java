/*
Program 15
Create a Java class that includes a static block. Display a message within the static block and explain when and how it is executed.
*/

class StaticBlocks 
{
    static 
    {
        System.out.println("Static block is executed when the class is loaded into memory.");
    }
}

public class StaticBlock
{
    public static void main(String[] args) 
    {
        StaticBlock sb = new StaticBlock();
    }
}

/*
run:
Static block is executed when the class is loaded into memory.
*/
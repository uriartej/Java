import java.io.*;
import java.util.*;

public class FileOutput2{    
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner info = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = info.nextLine();
        System.out.println("What is your favorite color ?");
        String color = info.nextLine();
        System.out.println("What are your three hobies?");
        String hobies = info.nextLine();
        PrintStream output = new PrintStream(new File ("AllAboutYou.txt"));
        output.println("Name = " + name);
        output.println("Color = " + color);
        output.println("Hobies = " + hobies);
        
    }
}

    
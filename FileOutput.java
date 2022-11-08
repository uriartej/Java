import java.io.*;
public class FileOutput{    
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintStream output = new PrintStream(new File ("AllAboutMe.txt"));
        output.println("Juan");
        output.println("Color: Blue");
        output.println("Hobbies: Gym, Study, Work");
        

    }
}

    
import java.util.*;
import java.io.*;
public class Hamlet0{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("E:/Hello Java/Hamlet.txt"));
        while(input.hasNextLine()){
            String text = input.nextLine();
            System.out.println(text.toUpperCase());
        }
    }
}
            
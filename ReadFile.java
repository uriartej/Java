import java.util.*; // for scanner
import java.io.*;// for file
public class ReadFile
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        File input =  new File("E:/data.txt");
      
        Scanner scan = new Scanner(input);
        
        int count = 0; //initializing counter variable
        while(scan.hasNext())
        {
         String word = scan.next();   
            
         count++; //incrementing the counter variable   
            
        }
        System.out.println("Total tokens: " + count);
        
    }
}
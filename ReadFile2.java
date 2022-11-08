import java.util.*; // for scanner
import java.io.*;// for file
public class ReadFile2
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        File input =  new File("E:/Hello Java/data.txt");
      
        Scanner scan = new Scanner(input);
        
        int token=0;
        
        int count = 0; //initializing counter variable
        while(scan.hasNext())
        {
         int a = scan.nextInt();
         double b = scan.nextDouble();
         String c = scan.next();
         int d = scan.nextInt();
         double e = scan.nextDouble();
         System.out.println(a + " " + b + " " + c + " " + d + " " + e);

        }
    }
}
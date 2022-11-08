import java.util.*; // for scanner
import java.io.*;// for file
public class AlteredHamlet2
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner input = new Scanner (new File("E:/hamlet.txt"));
               
        int count = 0; //initializing counter variable
        
        int token = 0;
        
        int andCount = 0;
        while(input.hasNextLine())
        {
         String sentence = input.nextLine();   
         
         count++; // counter for lines
         
         Scanner linedata = new Scanner(sentence);
   
         while(linedata.hasNext()){           
        String word = linedata.next();
        
        if (word.toLowerCase().equals ("and")){
         
            andCount++;
         
            break;
      
        }   
    }  
    }
    
    System.out.println("Total lines that contain \" and\" = " + andCount);
         
}
}

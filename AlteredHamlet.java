 import java.util.*; // for scanner
import java.io.*;// for file
public class AlteredHamlet
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner input = new Scanner (new File("E:/hamlet.txt"));
               
        int count = 0; //initializing counter variable
        
        int andCount = 0;
        while(input.hasNext())
        {
         String word = input.next();   
         
         if(word.toLowerCase().equals("and")){
            
         andCount++; //incrementing the counter variable   
            
        }
        count++;
    }
        
        System.out.println("Words count: " + count + ",total \"and\" = " +andCount);
        
    }
}


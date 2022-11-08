/* Juan Uriarte
 * Feb 5, 2019
 * CS-21
*/
import java.util.*;
import java.io.*;
public class Final{
    public static void main (String[] args)throws FileNotFoundException{
        Scanner UserInput = new Scanner(System.in);
        Scanner input = new Scanner(new File("E:/bowlingscores.txt"));
        
        int [] bowler_id = new int [25];
        String [] full_name = new String [25];
        int [] score = new int [25];
        
        int i = 0;
        while (i < 25){
            score[i] = input.nextInt();
            bowler_id[i] = input.nextInt();
            full_name[i] = input.nextLine();
            i++;
    }
    
    printRoster(bowler_id, full_name);
    System.out.println("The person with the lowest score is ");
    printLowest(full_name, bowler_id, score);
    System.out.println("The person with the highest score is ");
    printHighest(full_name, bowler_id, score);
    
}
public static void printLowest(String[] full_name, int [] bowler_id, int [] score){
    int index = 0;
    int max = 0; 
    for (int i = 0; i < score.length; i++){
        if (max < score[i]){   
        }
    }
   
    System.out.println("Name: " + full_name[index] + " " + "ID: " + bowler_id[index] + " " + "Score: " + score[index]);
    
    
}
public static void printHighest(String[] full_name, int [] bowler_id, int [] score){
    int index = 0;
    int max = 0;

    for (int i = 0; i < score.length; i++){
        if (max < score[i]){
            index = i;
            max = score[i];
        }
        
    }
    System.out.println("Name:" + full_name[index] + " " + "ID: " + bowler_id[index] + " " + "Score: " + score[index]);    
}
public static void printRoster(int [] bowler_id, String [] full_name){    
    for (int i = 0; i < bowler_id.length; i++){
        int index = 0;
        int max = 0;
        
        System.out.println(i + (":  ") + bowler_id[i] + full_name [i]); 
        
        
    }
}
}
    
    
       // System.out.printf ("%87d",bowler_id[i]);
        
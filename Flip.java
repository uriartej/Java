import java.util.*;
import java.io.*;
public class Flip{
     public static void main(String[] args)throws FileNotFoundException{
        Scanner input = new Scanner(new File("Sample.txt"));
        Scanner UserInput = new Scanner(System.in);
        
        System.out.println("How much data?");
        int size = UserInput.nextInt();
        
        
        int[] age = new int[size];//three different arrays
        double[] gpa = new double [size];
        String[] name = new String [size];
        
        int i = 0;
        while(i<size){
            name[i] = input.next();
            age[i] = input.nextInt();
            gpa [i] = input.nextDouble();
            i++;
     }
    
     printArrays(age, gpa, name);// print array method
    
     System.out.println("The oldest is: ");
     oldest(age, name);//print oldest method
     
}
public static void oldest(int[] age, String name[]){
      int index = 0; 
      int max = 0;
    
      for (int i = 0; i < age.length; i++){
         if(max<age[i]){
            index = i;
            max = age[i];
}
}
      System.out.println(name[index] + " " + age[index]);
}
public static void printArrays(int[] age, double[] gpa, String[] name){
        for (int i = 0; i < age.length; i++){
            System.out.println(name[i] + " " + age[i] + " " +gpa[i]);
}
}
} 

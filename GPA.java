import java.util.*;
import java.io.*;
public class GPA{
    public static void main(String[] args)throws FileNotFoundException{
        Scanner input = new Scanner (new File("Sample.txt"));
        Scanner UserInput = new Scanner(System.in);
        
        System.out.println("How much data would you like to input?");
        int size = UserInput.nextInt();
        
        int [] age = new int[size];
        double [] gpa = new double[size];
        String [] name = new String[size];
        
        int i = 0;
        while (i < size){
            name[i] = input.next();
            age[i] = input.nextInt();
            gpa[i] = input.nextDouble();
            i++;
        }
        
        printArray (gpa, name, age);
        System.out.println("The lowest GPA is ");
        lowestGPA (gpa,name);
    }
    public static void lowestGPA(double [] gpa, String[] name){
        int index = 0;
        int min = 0;
        for (int i = 0; i < gpa.length; i++){
            if (min < gpa [i]){
            index = i;
                        
        }
    }
        System.out.println(name[index] + " " + gpa[index]);
    }
    public static void printArray(double [] gpa, String [] name, int [] age){
        for (int i = 0; i < gpa.length; i++){
            System.out.println( name[i] + " " + age [i] + " " + gpa [i]);
        }
    }
}
            
 /* public static void youngest(int [] age, String [] name){
        int index = 0;
        int min = 0;
        for (int i = 0; i < age.length; i++){
            if (min < age [i]) {
                index = i;                
            }
        }
        System.out.println(name [index] + " " + age [index]); */
        
        
import java.util.*;
public class AverageWeight{
    static int Size = 5;
    public static void main(String[]args){
       Scanner input = new Scanner(System.in); 
       String [] name = new String[Size];
       double [] weight = new double[Size];
       System.out.println("Hi, enter your info");
       double sum = 0.0;
       for(int i = 0; i < weight.length; i++)
       {System.out.println("What is your name? ");
        name[i] = input.next();   
        System.out.println("What is your weight? ");
        weight[i] = input.nextDouble();
        sum += weight[i];           
       }
       System.out.println("Average weight: " + (sum/Size));
       System.out.println();
       for (int i = 0; i < Size; i++)
       {
         System.out.println(name[i] + "       " + weight[i]);  
        }
    }
}
 
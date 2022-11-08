import java.util.*;
public class Examine{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("How many numbers would you like to enter?");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++)
        {System.out.print("Enter a number");
            sum = sum + input.nextInt();
        }
        System.out.println("Sum Total = " + sum);
        System.out.println("Average = " + (sum/number));
    }
}
        
    
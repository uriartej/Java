import java.util.*;
public class Examine2{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("How many numbers would you like to enter?");
        int number = input.nextInt();
        double sum = 0.0;
        int negatives = 0;
        for (int i = 1; i <= number; i++)
        {System.out.print("#" + i + ":");
            double next = input.nextDouble();
            if (next < 0)
            {negatives ++;
            }
            sum = sum + next;
        }
        System.out.println();
        System.out.println("Average = " + (sum/number));
        System.out.println("# of negatives = " + negatives);
    }
}
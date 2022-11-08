import java.util.*;
public class SentinelVal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number (-1 to quit)? :");
        int number = input.nextInt();
        while (number != -1)
        {
            sum = sum + number;
            System.out.println("Enter a number (-1 to quit)? :");
            number = input.nextInt();
        }
        System.out.println("sum = " +sum);
    }
}

        
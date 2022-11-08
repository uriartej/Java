import java.util.*;
public class Examine3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int times = input.nextInt();
        int max = 0;
        for (int i = 0; i <= times; i++)
        {System.out.print("Enter number: ");
            int num = input.nextInt();
            max = Math.max(num,max);
        }
        System.out.println("Largest number is entered" + max);
    }
}
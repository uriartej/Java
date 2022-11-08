import java.util.*;
public class Dice{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number between 1 and 6");
        int randomNumber = input.nextInt();
        Random r = new Random();
        int b = 1;
        
        while(b != randomNumber)
        {
            b = r.nextInt(6) + 1;
            System.out.println("Result: " + b);
        }
    }
}
        
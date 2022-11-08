import java.util.*;
public class Dice2{
    public static void main(String[] args){
        Random r = new Random();
        int dice1 = 0;
        int dice2 = 0;
        int result = 7;
        int count = 0;
        while((dice1 + dice2) != result){
        {
            dice1 = r.nextInt(6) + 1;
            dice2 = r.nextInt(6) + 1;
            System.out.println("The total is " + (dice1 + dice2));
            count++;
           
        }
        System.out.println("The total amount of times is  " + count);
    }
}
}
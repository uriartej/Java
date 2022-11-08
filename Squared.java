import java.util.*;
public class Squared{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        printinfo();
    }
    public static void printinfo(){
        Scanner input = new Scanner(System.in);
        System.out.println ("Insert info");
        for (int i = 1; i < 6; i ++){
            System.out.print ("Number " + i + ": ");
            int number = input.nextInt();
            System.out.println (number * 2);
        }
    }
}
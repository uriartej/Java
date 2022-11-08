import java.util.*;
public class Equality{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a job?");
        String answer = input.next();
        if (answer.equals("yes") || answer.equals("YES"))
        {
            System.out.println("\"You are the breadwinner!\"");
        }
        else if (answer.equals("no")){
            System.out.println("\"Keep searching,you will find one!\"");
        }
    }
}
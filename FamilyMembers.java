import java.util.*;
public class FamilyMembers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many family members do you have?");
        int number = input.nextInt();
        if (number < 2){
            System.out.println("You're single huh?");
        }
        else if (number >= 2 && number <=4){
            System.out.println("That's pretty normal!");
        }
        else if (number >= 5 && number <=7){
            System.out.println("You have a big family");
        }
        else if (number == 8 || number == 9 || number == 10){
            System.out.println("WOW, can I join your family?");
        }
    }
}
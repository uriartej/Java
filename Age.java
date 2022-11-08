import java.util.*;
public class Age{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("What is your age?");
        int age = input.nextInt();
        if (age < 16){
            System.out.println(name + " you are too young to drive!");
        }
        else{ 
            System.out.println(name + " you are old enough to drive!");
            System.out.println("Are you male or female? Enter M or F.");
            char gender = input.next().toUpperCase().charAt(0);
            if (gender == 'M'){
                System.out.println("Vote");
            }
            else if (gender == 'F'){
                System.out.println("Go vote");
            }
        }
    }
}
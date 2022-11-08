import java.util.*;
public class UserInfo{
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
    }
    public static void printInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println ("Insert info");
        for(int i = 1; i <= 3; i ++)
        {System.out.println("Full name: ");
            String fname = input.nextLine();
            System.out.println("Age: ");
            int age = input.nextInt();
            System.out.println("GPA: ");
            double gpa = input.nextDouble();
            input.nextLine();
            System.out.println("Major: ");
            String major = input.nextLine();
            System.out.println("Individual " + i + ": " + fname + " " + age + " " + gpa + " " + major);
        }
    }
}
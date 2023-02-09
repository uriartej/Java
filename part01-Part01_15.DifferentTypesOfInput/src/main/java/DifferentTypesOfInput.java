import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string: ");
        String message = scan.nextLine();
        System.out.println("Give an integer: ");
        Integer num1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        Double num2 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        Boolean statement = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + message);
        System.out.println("You gave the integer " + num1);
        System.out.println("You gave the double " + num2);
        System.out.println("You gave the boolean " + statement);

    }
}

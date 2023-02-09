
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tries = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0 && num < 0) {
                sum = num;
            }
            tries++;
            sum += num;
        }
        System.out.println("Number of numbers: " + tries);
        System.out.println("Sum of the numbers: " + sum);
    }
}

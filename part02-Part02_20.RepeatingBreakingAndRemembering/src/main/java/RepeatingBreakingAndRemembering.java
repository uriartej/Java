
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double total = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else {
                System.out.println(num);
                sum += num;
                total++;
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            average = sum / total;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + (int) total);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

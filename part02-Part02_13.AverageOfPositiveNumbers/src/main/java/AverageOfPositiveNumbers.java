
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double tries = 0;
        double average = 0;
        while (true) {
            double numberFromUser = Double.valueOf(scanner.nextLine());

            if (numberFromUser < 0) {
                continue;
            }
            if (numberFromUser > 0) {
                tries++;
            } else {
                System.out.println("Cannot calculate the average");
                break;
            }

            sum += numberFromUser;
        }
        average = sum / tries;
        System.out.println(average);

    }
}

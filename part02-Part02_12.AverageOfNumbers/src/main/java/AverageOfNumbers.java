
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tries = 0;
        double sum = 0;
        double average = 0;
        while (true){
            System.out.println("Give a number:");
            double num = Double.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }
            if (num > 0 && num < 0){
                sum = num;
            }
            tries++;
            sum += num;
        }
        average = sum / tries;
        System.out.println("Average of the numbers: " + average);
    }
}

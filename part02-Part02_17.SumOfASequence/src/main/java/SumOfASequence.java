
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        int value = 0;
        int i = 0;
        while (i <= num){
            value += i;
            i++;
        }
        System.out.println("The sum is " + value);
    }
}

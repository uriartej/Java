
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());

        if (num < 0) {
            int total = num * -1;
            System.out.println(total);
        } else {
            System.out.println(num);
        }
    }
}

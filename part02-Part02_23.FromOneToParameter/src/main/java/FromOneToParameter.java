
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
        System.out.println();
        printUntilNumber(8);
    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}

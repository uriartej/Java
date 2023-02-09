
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
        System.out.println("");
        printFromNumberToOne(2);

    }

    public static void printFromNumberToOne(int number) {
        int j = 1;
        for (int i = number; i >= j; i--) {
            System.out.println(i + "");

        }
    }
}

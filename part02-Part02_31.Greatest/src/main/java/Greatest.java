
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int high = 0;
        if (number1 > number2 && number1 > number3) {
            high = number1;
        } else if (number2 > number1 && number2 > number3) {
            high = number2;
        } else {
            high = number3;
        }
        return high;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}

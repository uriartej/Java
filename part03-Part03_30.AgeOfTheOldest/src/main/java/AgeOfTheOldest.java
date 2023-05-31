
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = Integer.MIN_VALUE;
        while (true){ 
            String userInput = scanner.nextLine();
            if(userInput.isEmpty()){
                break;
            }
            String[] parts = userInput.split(",");
            int age = Integer.parseInt(parts[1]);
            if(age > maxAge){
                maxAge = age;
            }
        }
        System.out.println("Age of the oldest: " + maxAge);
    }
}


import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = Integer.MIN_VALUE;
        String oldestName = "";
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            String[] parts = input.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            if(age > maxAge){
                maxAge = age;
                oldestName = name;
            }
        }
            System.out.println("Name of the oldest: " + oldestName);
    }
}

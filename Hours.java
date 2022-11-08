import java.util.*;
import java.io.*;
public class Hours{
    public static void main(String[] args)throws FileNotFoundException{
        Scanner input = new Scanner(new File("E:/Hello Java/Hours.txt"));
        total(input);
    }
    public static void total(Scanner input){
        while (input.hasNext()){
            String name = input.next();
            double sum = 0.0;
            while (input.hasNextDouble()){
                sum += input.nextDouble();
          }
          System.out.println("Total hours worked by " + name + "=" + sum);
        }
    }
}
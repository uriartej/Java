import java.util.*;
public class Maxsentinel{
public static void main(String[] args){
Scanner input = new Scanner (System.in);
System.out.println("Please enter a number (-1 to quit): ");
int num = input.nextInt();
int max = 0;
while(num !=-1)
{ System.out.print("Please enter a number (-1 to quit): ");
num = input.nextInt();
max = Math.max(num, max);
}
System.out.println("Largest number is entered " + max);
}
}
import java.util.*;
public class Factor{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number");
    int number = input.nextInt();
    int factor = 1;
    while(factor <= number)
    {
        if(number%factor==0)
        {
        System.out.println(factor + " ");
        }
        factor++;
}
}
}    
        
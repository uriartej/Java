import java.util.*;
public class Factor2{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number");
while(!input.hasNextInt())
{   
    System.out.println("Invalid. Enter again.");
    input.next();
    
    
    
}
int factor = 1;
int number = input.nextInt();

    while(factor <= number)
    {
        if(number%factor==0)
        {
        System.out.println("" + factor + " ");
        }
        factor++;
}
}
}    
        
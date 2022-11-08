import java.util.*;
public class StringIndex{
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println ("Please put your full name here");
        String name = console.nextLine();
        
        for(int i = 0; i < name.length(); i ++)
        {System.out.println(i + ":" + name.charAt(i));
        }
    }
}
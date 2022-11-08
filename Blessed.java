import java.util.*;
public class Blessed{
public static void main(String[] args){
   Scanner input = new Scanner (System.in);
   System.out.println("How many siblings do you have?");
   int siblings = input.nextInt();
   if (blessed(siblings)){
       System.out.println("\"You are \"extremely\" Blessed!\"");
    }
    else{
        System.out.println("\"You are Blessed!\"");
    }
}
   public static boolean blessed(int a){
        if (a > 0){
            return true;
    }
   return false;
}
}      

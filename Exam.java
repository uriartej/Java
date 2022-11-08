import java.util.*;

public class Exam{
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String username = input.nextLine().toUpperCase();
        System.out.println("How many scores do you have?");
        int numscores = input.nextInt();
        double sum = 0.0;
        System.out.println("WELCOME \"" + username + "!\"");
for(int i = 1; i <= numscores ; i++){
            System.out.println("Enter test scores: ");
            double next = input.nextDouble(); 
            sum += next;
}
        double Average = sum/numscores;
        System.out.printf("Average = %.2f\n", Average);
        double Grade = sum/numscores;
if (Grade >= 90){
            System.out.println(username + ",your grade is a A.");
}
else if (Grade >= 80){
           System.out.println(username + ",your grade is a B.");
}
else if (Grade >= 70){
            System.out.println(username + ",your grade is a C.");
}
else if (Grade >= 60){
            System.out.println(username + ",your grade is a D.");
}
else  {
            System.out.println(username + ",your grade is a F.");
}
}
}
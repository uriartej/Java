import java.util.*;
public class Search{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert sentence");
        String text = input.nextLine();
        System.out.println("Enter a character to search for");
        char a = input.next().charAt(0);
        int found = findChar(text, a);
        System.out.println("Found at: " + found);
    }
    public static int findChar(String text, char a){
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == a)
            {
                return i;
            }
        }
        return -1;
    }
}
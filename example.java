import java.util.*;
public class example{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] list= new int[5];
        for (int i = 0; i < list.length; i++){
           list[i] = 2 * i + 1;
           System.out.println(" e is " + Arrays.toString(list));
        }
    }
}
public class BirthYear{
    public static void main (String[]args){
    System.out.println ("age = " + CalculateAge(2019, 1995) + "years old!");
}
public static int CalculateAge(int currentyear, int birthyear){
    int age= (currentyear - birthyear);
    return age;
}
}

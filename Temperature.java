public class Temperature{
    public static void main(String[] args){
        for (int fahrenheit = 0; fahrenheit <= 500; fahrenheit ++){
            double celsius = (fahrenheit - 32.0) / 1.00;
            System.out.printf("%-5d%7.2f\n", fahrenheit, celsius);
        }
    }
}
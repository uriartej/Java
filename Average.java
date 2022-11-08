public class Average{
public static void main (String[] args)
{System.out.println("Total Average: " + CalculateAverage(90, 88, 77, 66, 100));
}
public static double CalculateAverage(int a, int b, int c, int d, int e)
{double total = a + b + c + d + e;
 double average = total / 5;
 return average;
}
}


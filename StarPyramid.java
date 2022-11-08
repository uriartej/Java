public class StarPyramid{
public static void main (String[] args)
{ for (int a = 0; a < 6; a++)
    {for (int j=6; j > a; j--){
      System.out.print(" ");
  }
  for (int i=0; i < 2 * a-1; i++){
      System.out.print("*");
    }
   System.out.println();
}
}
}
      
import java.util.*;
public class ChangeUp{
 public static Scanner input=new Scanner(System.in);
 public static Random r=new Random();
 public static final int Size=6; 
 public static void main(String[] args){
  int[] array=new int[Size];   
  changeOne(array);
  System.out.println();
  printArray(array);
 }
 public static void changeOne(int[] array){
  for(int i=0;i<Size;i++){
   System.out.println("Enter number: ");
   int val=input.nextInt();
   int random=r.nextInt(Size);
   array[random]=val;
  }
 }
 public static void printArray(int[] array){
  System.out.println("Array contents: ");
  for(int z: array){
   System.out.println(z);   
  }
 }
}
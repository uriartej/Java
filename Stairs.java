public class Stairs{
 public static int STEPS=1;   
 public static void main(String[] args){
  Body();   
 }
 public static void Body(){ 
  for(int b=STEPS;b>=1;b--){ 
  for(int h=1;h<=(5*b);h++){ //Head
   System.out.print(" "); 
  }
  System.out.print("  O  ******");
  for(int x=1;x<=5*STEPS-b*5;x++){ //Top of the stairs
   System.out.print(" ");
  }
  System.out.println("*");
  for(int s=1;s<=(5*b);s++){ //Body
   System.out.print(" "); 
  }
  System.out.print(" /|\\ *");
  for(int y=1;y<=5*(STEPS+1)-b*5;y++){ //Middle of the stairs
   System.out.print(" ");
  }
  System.out.println("*");
  for(int f=1;f<=(5*b);f++){ //Feet
  System.out.print(" "); 
  }
  System.out.print(" / \\ *");
  
  for(int z=1;z<=5*(STEPS+1)-b*5;z++){ //Bottom of the stairs
   System.out.print(" ");
  }
  System.out.println("*");
  }
  for(int e=1;e<=5*(STEPS+2)+1;e++){
   System.out.print("*");    
  }
  System.out.println("*");
 }
}


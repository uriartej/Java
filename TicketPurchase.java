public class TicketPurchase{
double price1=162.03;
double price2=99.36;
double price3=21.02;
double price4=436.36;

public static void main (String[] args)
{reciept();
}
public static void reciept()
{double price1= 162.03;
 double price2= 99.36;
 double price3= 21.02;
 double price4= 436.36;
 double subtotal = (price1 + price2+ price3 + price4);
 double tax = subtotal * 0.08;
 System.out.println("Ticket 1 : " + price1 + "\n" + price2 + "\n" + price3 + "\n" + price4);
 System.out.println("Subtotal: " + subtotal);
 System.out.println("Tax: " + tax);
 System.out.println("Totalcost: " + (subtotal + tax));                               
}
}
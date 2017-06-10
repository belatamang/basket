import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;


class Basket
{

   public static void main (String[] args)
   {
	

	   ArrayList<Item> Cart = new ArrayList<Item>();
		Item item;
	      String itemName;
	      double itemPrice;
	      int quantity;
	      Scanner scan = new Scanner(System.in);
		 
   double totalPrice = 0.0;
	double sum = 0.0;
     
      String keepShopping = "y";

      do
      {
    	  System.out.print ("Enter the name of the item: ");
  	     itemName = scan.nextLine();
  	     System.out.print ("Enter the unit price: ");
  	     itemPrice = scan.nextDouble();
  	     System.out.print ("Enter the quantity: ");
     quantity=scan.nextInt();
  	
  	   
  	   item =new Item(itemName,itemPrice,quantity);	
  	     Cart.add(item);
			
			for (int i = 0; i < Cart.size(); i++)
			{
				Item itm = Cart.get(i);
				System.out.println(itm);
			}

		
			System.out.print ("You want to continue? Y/N ");
      scan.nextLine();
         keepShopping = scan.nextLine();
      }while (keepShopping.equals("y"));
			
		scan.close();	
			for (int i = 0; i < Cart.size() ; i++)
			{
				Item itm = Cart.get(i);
				System.out.println(itm);
				totalPrice = itm.getQuantity() * itm.getPrice();
				sum += totalPrice;
			}
			
			NumberFormat fmt = NumberFormat.getCurrencyInstance();
			
			System.out.println("The total price is: " + fmt.format(sum));

   }


}

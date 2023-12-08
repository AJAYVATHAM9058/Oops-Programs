/* Write a Java program to create a class called "Inventory" with a
 *  collection of products and methods to add and remove products, and
 *   to check for low inventory. */

import java.util.ArrayList;

public class main8 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> Product1 = new ArrayList<Product>();
		
		
		Product pr1 = new Product("Laptop",125);
		Product pr2 = new Product("LED ",25);
		Product pr3 = new Product("Geyser",15);
		Product pr4 = new Product("Yamaha Bike",36);
		
		Inventory inventory = new Inventory();
		inventory.addProducts(pr1);
		inventory.addProducts(pr2);
		inventory.addProducts(pr3);
		inventory.addProducts(pr4);
		
		Product1 = inventory.getInventory();
		System.out.println("Product Details are : ");
		
		for(Product pr : Product1) {
			System.out.println(pr.getName()+"  quantity :  "+pr.getQuantity());
		}
		
		System.out.println("\n");
		inventory.checkLowInventory();
	}

}

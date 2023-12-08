import java.util.ArrayList;

public class Inventory {

	private ArrayList<Product> products;
	public Inventory() {
		products = new ArrayList<Product>();
	}
	public void addProducts(Product product) {
		products.add(product);
	}
	public void removeProducts(Product product) {
		products.remove(product);
	}
	
	public ArrayList<Product> getInventory(){
		return products;
	}
	
	public void checkLowInventory() {
		for(Product pr : products) {
			if(pr.getQuantity()<=100) {
				System.out.println(pr.getName()+" is running on low inventory. current quantity is  "+pr.getQuantity());
			}
		}
	}
}

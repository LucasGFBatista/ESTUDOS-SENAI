package entidade;

public class Product {
	public String name;
	public double price;
	public int quantity;

	/* Mehods asked on the ativity */
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void returnProducts(int quantity) {
		this.quantity -= quantity;
	}

@Override
public String toString() {
	return "Product \nName: " + name + 
			"\nPrice: " + String.format("%.2f", price)+ 
			"\nQuantity: " + quantity + 
			"\nTotal Value InStock: R$"	+ String.format("%.2f",totalValueInStock());
}







}

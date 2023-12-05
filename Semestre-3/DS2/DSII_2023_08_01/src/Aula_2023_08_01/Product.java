package Aula_2023_08_01;
import java.text.DecimalFormat;

public class Product {
	private String name;
	private double price;
	private int quantity;

	 private static final DecimalFormat df = new DecimalFormat("0.00");
	
	/* getter and setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;

	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/* methods asked in the activity */
	public double totalValueInStock() {
		double result = quantity * price;
		
		
		return df.format(result);;
	}

	public void addProduct(int newQuantity) {
		quantity += newQuantity;
	}

	public void removeProduct(int newQuantity) {
		quantity -= newQuantity;
	}

}
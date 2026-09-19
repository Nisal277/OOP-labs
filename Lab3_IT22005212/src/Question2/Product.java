package Question2;

public class Product {
	
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	public void setproductId(int productId) {
		this.productId = productId;
	}
	
	public int getproductId() {
		return productId;
	}
	
	public void setproductName(String productName) {
		this.productName = productName;
	}
	
	public String getproductName() {
		return productName;
	}
	
	public void setprice(double price) {
		
		if(price > 0) {
			this.price = price;
		}else {
			System.out.println("Price should be greater than 0");
		}
		
	}
	
	public double getprice() {
		return price;
	}
	
	public void setquantity(int quantity) {
		if(quantity < 0) {
			System.out.println("Quantity should not be a negative value");
		}else {
			this.quantity = quantity;
		}
	}
	
	public double getquantity() {
		return quantity;
	}
	
	public void calculateTotalValue() {
		double total = price * quantity;
		System.out.println("Total value:" + total);
	}
	
	public void displayDetails() {
		System.out.println("productID:" + productId);
		System.out.println("product Name:" + productName);
		System.out.println("product price:" + price);
		System.out.println("product quantity:" + quantity);
	}
	

}

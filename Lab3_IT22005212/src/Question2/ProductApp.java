package Question2;

import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
		
		// take user inputs
		System.out.println("Enter product ID:");
		int id = sc.nextInt();
		p1.setproductId(id);
		sc.nextLine();
		
		System.out.println("Enter product Name:");
		String name = sc.nextLine();
		p1.setproductName(name);
		
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		p1.setprice(price);
		
		System.out.println("Enter product quantity:");
		int qty = sc.nextInt();
		p1.setquantity(qty);
		
		p1.displayDetails();
		
		p1.calculateTotalValue();
		
		sc.close();

	}

}

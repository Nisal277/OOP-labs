package Question1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingsAccount s1 = new SavingsAccount();
		
		//user inputs
		System.out.println("Enter account number:");
		int accnum = sc.nextInt();
		s1.setaccountNumber(accnum);
		sc.nextLine();
		
		System.out.println("Enter account holder name:");
		String name = sc.nextLine();
		s1.setaccountHolder(name);
		
		System.out.println("Enter initial deposit:");
		double initialdeposit = sc.nextDouble();
		s1.deposit(initialdeposit);
		
		System.out.println("Enter deposit amount:");
		double deposit = sc.nextDouble();
		s1.deposit(deposit);
		
		System.out.println("Enter withdrawal amount:");
		double withdraw = sc.nextDouble();
		s1.withdraw(withdraw);
		System.out.println("\t");
		
		//final output
		s1.displayAccountDetails();
		
		sc.close();		

	}

}

package Question1;


public class SavingsAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getaccountNumber() {
		return accountNumber;
	}
	
	public void setaccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public String getaccountHolder() {
		return accountHolder;
	}
	
	
	
	public double getbalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(balance >= 0) {
			balance = balance + amount;
			System.out.println("Deposited amount:" + amount + " New Balance:" + balance);
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double amount) {
		if(balance >= 0) {
			balance = balance - amount;
			System.out.println("Withdrawn:" + amount + " New Balamce:" + balance);
		}else {
			System.out.println("Invalid amount");
		}
	}

	public void displayAccountDetails() {
		System.out.println("Final account details:");
		System.out.println("Account number:" + accountNumber);
		System.out.println("Account holder:" + accountHolder);
		System.out.println("Balance:" + balance);
	}
}

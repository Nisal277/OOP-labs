package question1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//user inputs
		System.out.println("Enter employee type:");
		int type = sc.nextInt();
		
		System.out.println("Enter basic salary:");
		double salary = sc.nextDouble();
		
		System.out.println("Enter overtime hours:");
		double hours = sc.nextDouble();
		
		//assign ot rate and calculate total salary
		double totalSalary;
		if(type == 1) {
			totalSalary = salary + (hours * 1000);
			System.out.println("Total salary:" + totalSalary);
		}
		else if(type == 2){
			totalSalary = salary + (hours * 1500);
			System.out.println("Total salary:" + totalSalary);
		}
		else if(type == 3){
			totalSalary = salary + (hours * 1700);
			System.out.println("Total salary: " + totalSalary);
		}
		
		sc.close();
		

	}

}

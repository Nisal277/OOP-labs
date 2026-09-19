package Question3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		
		//user inputs
		System.out.println("Enter empoyee ID:");
		int id = sc.nextInt();
		e1.setempId(id);
		sc.nextLine();
		
		System.out.println("Enter empoyee name:");
		String name = sc.nextLine();
		e1.setempName(name);
		
		System.out.println("Enter basic salary:");
		double salary = sc.nextDouble();
		e1.setsalary(salary);
		
		System.out.println("Enter performance rating:");
		int rating = sc.nextInt();
		e1.setrating(rating);
		
		e1.displaydetails();
		double bonus = e1.calculateBonus();
		e1.calculateTotalSalary(bonus);
		
		sc.close();

	}

}

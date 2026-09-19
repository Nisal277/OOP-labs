package Question3;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	private int rating;
	
	public void setempId(int empId) {
		this.empId = empId;
	}
	
	public int getempId() {
		return empId;
	}
	
	public void setempName(String empName) {
		this.empName = empName;
	}
	
	public String getempName() {
		return empName;
	}
	
	public void setsalary(double salary) {
		this.salary = salary;
	}
	
	public double getsalary() {
		return salary;
	}
	
	public void setrating(int rating) {
		this.rating = rating;
	}
	
	public int getrating() {
		return rating;
	}
	
	public double calculateBonus() {
		double bonus = 0;
		if(rating == 1) {
			bonus = 0;
			System.out.println("Bonus:" + bonus);
			
		}
		else if(rating == 2) {
			bonus = salary * 5 / 100;
			System.out.println("Bonus:" + bonus);
			
		}
		else if(rating == 3) {
			bonus = salary * 10 / 100;
			System.out.println("Bonus:" + bonus);
			
		}
		else if(rating == 4) {
			bonus = salary * 15 / 100;
			System.out.println("Bonus:" + bonus);
			
		}
		else if(rating == 5) {
			bonus = salary * 20 / 100;
			System.out.println("Bonus:" + bonus);
			
		}
		
		return bonus;
	}
	
	public void calculateTotalSalary(double bonus) {
		double totalSalary = salary + bonus;
		System.out.println("Total Salary:" + totalSalary);
	} 
	
	public void displaydetails() {
		System.out.println("Employee details:");
		System.out.println("Employee ID:" + empId);
		System.out.println("Name:" + empName);
		System.out.println("Basic salary:" + salary);
		System.out.println("Performance rating:" + rating);
		
	}


}

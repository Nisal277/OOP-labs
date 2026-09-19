package question3;

public class Driver {
	private int driverID;
	private String driverName;
	private double baseSalary;
	private int performanceScore;
	
	public Driver(int driverID , String driverName) {
		this.driverID = driverID;
		this.driverName = driverName;
	}
	
	public Driver(int driverID , String driverName , double baseSalary) {
		this.driverID = driverID;
		this.driverName = driverName;
		this.baseSalary = baseSalary;
	}
	
	public Driver(int driverID , String driverName , double baseSalary , int performanceScore) {
		this.driverID = driverID;
		this.driverName = driverName;
		this.baseSalary = baseSalary;
		this.performanceScore = performanceScore;
	}
	
	public void setdriverID(int driverID) {
		this.driverID = driverID;
	}
	
	public int getdriverID() {
		return driverID;
	}
	
	public void setBaseSalary(double baseSalary) {
	    this.baseSalary = baseSalary;
	}
	
	public void setperformanceScore(int performanceScore) {
		if( performanceScore <=5 && performanceScore >=1) {
			this.performanceScore = performanceScore;
		}else {
			this.performanceScore = 1;
		}
		
	}
	
	public int getperformanceScore() {
		return performanceScore;
	}
	
	public double calculateBonus() {
		double bonus = 0;
		
		if(performanceScore == 1) {
			bonus = 0;
		}
		
		else if(performanceScore == 2) {
			bonus = baseSalary * 10 / 100;
		}
		
		else if(performanceScore == 3) {
			bonus = baseSalary * 15 / 100;
		}
		
		else if(performanceScore == 4) {
			bonus = baseSalary * 20 / 100;
		}
		
		else if(performanceScore == 5) {
			bonus = baseSalary * 25 / 100;
		}
		
		return bonus;
	}
	
	public double calculateBonus(int customScore) {
		double bonus = 0;
		
		if(customScore == 1) {
			bonus = 0;
		}
		
		else if(customScore == 2) {
			bonus = baseSalary * 10 / 100;
		}
		
		else if(customScore == 3) {
			bonus = baseSalary * 15 / 100;
		}
		
		else if(customScore == 4) {
			bonus = baseSalary * 20 / 100;
		}
		
		else if(customScore == 5) {
			bonus = baseSalary * 25 / 100;
		}
		
		return bonus;
	}
	
	public double calculateTotalSalary() {
		double bonus = calculateBonus();
		double totalSalary = baseSalary + bonus;
		return totalSalary;
	}
	
	public void printDeatils() {
		System.out.println("Driver ID:" + driverID);
		System.out.println("Name:" + driverName);
		System.out.println("Base Salary:" + baseSalary);
		System.out.println("Performance Score:" + performanceScore);
		
		double bonus = calculateBonus();
		double totalSalary = calculateTotalSalary();
		
		System.out.println("Bonus:" + bonus);
		System.out.println("Total Salary:" + totalSalary);
		
	}
	
	public void printDeatils(int customScore) {
		System.out.println("Driver ID:" + driverID);
		System.out.println("Name:" + driverName);
		System.out.println("Base Salary:" + baseSalary);
		
		
		double bonus = calculateBonus(customScore);
		double totalSalary = baseSalary + bonus;
		
		System.out.println("Bonus:" + bonus);
		System.out.println("Total Salary with custom rating "+ customScore +": " + totalSalary);
		
		
	}
	
	

}

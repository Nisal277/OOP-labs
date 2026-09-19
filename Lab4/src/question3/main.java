package question3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Driver 1
		Driver d1 = new Driver(123 , "Nimal");
		d1.setBaseSalary(2000);
        d1.setperformanceScore(3);
		d1.printDeatils();
		System.out.println("\t");
		
		
		//Driver 2
		Driver d2 = new Driver(456 , "Saman" , 5000);
		d2.setperformanceScore(2);
		d2.printDeatils();
		System.out.println("\t");
		
		//Driver 3
		Driver d3 = new Driver(789 , "Kamal" , 10000 , 4);
		d3.printDeatils();
		System.out.println("\t");
		
		//Driver 4
		Driver d4 = new Driver(56566 , "Amara" , 5000);
		d4.printDeatils(4);
		

	}

}

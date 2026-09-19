package question4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get seconds from user
        System.out.print("Enter number of seconds: ");
        int totalSeconds = sc.nextInt();
        
        // Calculate hours
        int hours = totalSeconds / 3600;
        
        // Calculate remaining seconds after hours
        int remainingSeconds = totalSeconds % 3600;
        
        // Calculate minutes
        int minutes = remainingSeconds / 60;
        
        // Calculate remaining seconds after minutes
        int seconds = remainingSeconds % 60;
        
        // Display result
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        
        
        sc.close();


	}

}

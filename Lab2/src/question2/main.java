package question2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[5];
		int value = numbers[0];
		int sum = 0;
		
		//user inputs
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Enter number:");
			numbers[i] = sc.nextInt();
		}
		
		//find largest value
		for(int i = 0 ; i < 5 ; i++) {
			if(numbers[i] > value) {
				value = numbers[i];
			}
		}
		
		//find sum
		for(int i = 0 ; i < 5 ; i++) {
			sum = sum + numbers[i];
		}
		
		//print largest value and sum
		System.out.println("Largest value:" + value);
		System.out.println("Sum:" + sum);
		
		
		

	}

}

package question5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = new String[5];
		
		//get user inputs
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Enter word:");
			words[i] = sc.nextLine();
		}
		
		//find and display longest word
		String longest = words[0];
		for(int i = 0 ; i < 5 ; i++) {
			if(words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		System.out.println("Longest word: " + longest);
		
		//total characters in all words
		int totalCharacters = 0;
		for(int i = 0 ; i < 5 ; i++) {
			totalCharacters = totalCharacters + words[i].length();
		}
		System.out.println("Total number of characters: " + totalCharacters);
		
		//display word with even numbers
		for(int i = 0 ; i < 5 ; i++) {
			if(words[i].length() % 2 == 0) {
				System.out.println(words[i]);
			}
		}
		
		sc.close();
		
		
		}

	}



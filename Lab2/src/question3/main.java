package question3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//get user input
		System.out.println("Enter sentence:");
		String sentence = sc.nextLine();
		
		//split sentence to words
		String[] words = sentence.split("\\s+");
		
		//find number of words
		System.out.println("Number of words:" + words.length);
		
		//find longest word length
		int longestLength = 0;
		
		for(int i = 0; i < words.length; i++) {

            if(words[i].length() > longestLength) {
                longestLength = words[i].length();
            }
            
        }
		
		 // Display all longest words
        System.out.print("Longest words): [");

        boolean first = true;

        for(int i = 0; i < words.length; i++) {

            if(words[i].length() == longestLength) {

                if(!first) {
                    System.out.print(", ");
                }

                System.out.print(words[i]);

                first = false;
            }
        }

        System.out.println("]");
        
     //Reverse the sentence
        String reversedSentence =
                new StringBuilder(sentence).reverse().toString();

        System.out.println("Reversed sentence: " + reversedSentence);

        
       sc.close(); 

	}

}

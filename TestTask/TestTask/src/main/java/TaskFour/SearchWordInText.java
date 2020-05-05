package TaskFour;

import java.util.Scanner;

public class SearchWordInText {
	/**Create a program that counts how many times
	 *  a word is used in the text (case insensitive).
	 *  Text and word are entered manually.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input text\n");
		String txt = in.nextLine();
		System.out.print("Input search word\n");
		String word = in.nextLine();
	       int quantity=0;
			for (int i = 0; i < txt.length(); i++) {
	    	 	  int inn=0;  		  	    	  
	    	   for (int j = 0; j < word.length(); j++) {
	    		  if(i+j>=txt.length()) {
	    			  break;
	    		  }
				  if(word.charAt(j) == txt.charAt(i+j)) {
					inn++;
				  }
				  if(inn == word.length()) {
							quantity++;
							inn++;
				  }										
			   }					
			}
			System.out.print("Quantity of repetitions = " + quantity+"\n");
	       
		 }				

	}



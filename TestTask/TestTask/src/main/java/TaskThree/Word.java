package TaskThree;

import java.util.Scanner;

public class Word {
	/**Create a program that will:
	 *	count the number of words in a sentence
	 *	display them in sorted form
	 *	capitalize the first letter of each word.
	 *	The offer is entered manually. (Separator space (“”)). 
	 */
	public static void main(String[] args) {
		String[] mas = new String[100];
		Scanner in = new Scanner(System.in);
		System.out.print("Please input text separating words with a space\n");
		String str = in.nextLine();

		mas = str.split(" ");
		System.out.print("Quantity words = " + mas.length+"\n");
		for (int j = 0; j < mas.length; j++) {

			mas[j] = mas[j].substring(0, 1).toUpperCase() + mas[j].substring(1);
			System.out.println(mas[j]);
		}
		

	}

}

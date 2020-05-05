package TaskFive;

import java.util.Scanner;

public class Polindrom {
	/**Create a program that, in a sequence from 0 to N,
	 *	finds all palindrome numbers (the mirror value is 
	 *	equal to the original). 
	 *	The length of the sequence N is entered 
	 *	manually and should not exceed 100.
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 11;
		try {
			number = in.nextInt();
			if (number > 100) {
				System.out.println("Please run program and input int " + "value 0 < X >= 100");
				return;
			}
		} catch (Exception InputMismatchException) {
			System.out.println("Please run program and input int " + "value 0 < X >= 100");
			return;
		}

		for (int i = 10; i <= number; i++) {
			String str = Integer.toString(i);
			char char0 = str.charAt(0);
			char char1 = str.charAt(1);

			if (char0 - '0' == char1 - '0') {
				System.out.println(i);
			}

		}

	}

}

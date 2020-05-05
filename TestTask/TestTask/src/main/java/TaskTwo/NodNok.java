package TaskTwo;

import java.util.Scanner;

public class NodNok {
	/**Create a program that will calculate and display 
	 *	the NOC (the smallest common multiple) and 
	 *	the GCD (the largest common divisor) 
	 *	of two integers entered by the user.
	 *	If the user incorrectly enters at least one 
	 *	of the numbers, then report an error.
	 */
	public static int numberFirst;
	public static int numberSecond;
	public static int nod;

	public NodNok() {
		nod = 0;
		numberFirst = 0;
		numberSecond = 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input  two value integer\n");

		try {
			numberFirst = in.nextInt();
			numberSecond = in.nextInt();
		} catch (Exception InputMismatchException) {
			System.out.print("Please run program and input int value\n");
			return;
		}
		int nod = 0;
		for (int j = 1; j <= compare(numberFirst, numberSecond); j++) {
			if (numberFirst % j == 0 & numberSecond % j == 0) {
				nod = j;
			}

		}
		System.out.println("NOD = " + nod);
		int nok = numberFirst / nod * numberSecond;
		System.out.println("NOK = " + nok);

	}

	public static int compare(int a, int b) {
		int result;
		if (a > b) {
			result = a;
		} else {
			result = b;
		}
		return result;

	}
}

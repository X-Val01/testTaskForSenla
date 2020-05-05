package TaskOne;

import java.util.Scanner;

public class Numbers {
	/**Create a program that will report whether 
	 *  the integer entered by the user is even or odd, 
	 *  prime or compound. If the user does not enter an integer, 
	 *  then inform him about the error. 
	 */
	public static void main(String[] args) {
		int number=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Input number");

			try {
				number = in.nextInt();
				
			} catch (Exception InputMismatchException) {
				System.out.print("Please run program and input int value\n");
				return;
			}
		

		if (number % 2 == 0) {
			System.out.print("the number is even\n");
		} else {
			System.out.print("the number is not even\n");
		}
		if (number == 2 || number == 3 || number == 5 || number == 7) {
			System.out.print("number is simple\n");
		}
		if(number == 4) {
			System.out.print("number is compound\n");
		}
		if (number > 7) {
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
				System.out.print("number is simple\n");
			} else {
				System.out.print("number is compound\n");
			}

		}

	}

}

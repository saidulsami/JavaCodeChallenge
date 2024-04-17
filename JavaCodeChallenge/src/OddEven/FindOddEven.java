package OddEven;

import java.util.Scanner;

public class FindOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		String input = sc.nextLine();
		sc.close();
		findOddEvenNumbers(input);

	}

	public static void findOddEvenNumbers(String input) {

		System.out.println("Odd numbers:  ");

		for (int i = 0; i < input.length(); i++) {
			int digit = Character.getNumericValue(input.charAt(i));
			if (digit % 2 != 0) {
				System.out.println(digit + " ");
			}

		}

		System.out.println("\nEven numbers: ");

		for (int i = 0; i < input.length(); i++) {
			int digit = Character.getNumericValue(input.charAt(i));
			if (digit % 2 == 0) {
				System.out.println(digit + " ");
			}

		}
	}
}

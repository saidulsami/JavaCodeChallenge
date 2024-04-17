package Palindrome;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");

		String input1 = sc.next();
		String reverseinput1 = reverseString(input1);

		if (input1.equals(reverseinput1)) {

			System.out.println("this is a polindrome");

		} else {

			System.out.println("this is not a polindrome");

		}

	}

	public static String reverseString(String str) {
		StringBuffer sami = new StringBuffer(str);
		return sami.reverse().toString();
	}

}

package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number/character: ");

		String input1 = sc.next();
		String processInput1 = reverseString(input1);

		System.out.println("reversed number is :" + processInput1);

		sc.close();
	}

	// below is one method1234
	
	/*
	 * public static String reverseString(String str) {
	 * 
	 * StringBuilder reversed = new StringBuilder();
	 * 
	 * for (int i = str.length() -1; i>=0; i--) { reversed.append(str.charAt(i)); }
	 * 
	 * return reversed.toString(); }
	 */

	public static String reverseString(String str) {
		StringBuffer Sami = new StringBuffer(str); // I used string buffer object
		return Sami.reverse().toString();
	}

}

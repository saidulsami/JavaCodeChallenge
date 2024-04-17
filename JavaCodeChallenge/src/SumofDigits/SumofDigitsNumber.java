package SumofDigits;

import java.util.Scanner;

public class SumofDigitsNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your number:  ");
		String input1=sc.next();
		int sum = sumofDigits(input1);
		System.out.println("The sum of digits in " + input1 + " is " + sum);
		
		sc.close();
	}
	
	public static int sumofDigits(String input) {
		
		int sum = 0;
		for (int i=0; i<input.length();i++) {
			int digit = Character.getNumericValue(input.charAt(i));
			sum +=digit;
		}
		return sum;
			
			
			
		}	
		
		
		
	}
	
	


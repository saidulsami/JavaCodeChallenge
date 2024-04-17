package CountNumber;

import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("enter a string");
		String input1 = sc.nextLine();
		System.out.println("Enter the charecter to count");
		char targetchar = sc.next().charAt(0);
		sc.close();
		
		int count = 0;
		 for (int i =0;i<input1.length();i++) {
			 if (input1.charAt(i)==targetchar) {
				 
				 count++;
				 
			 }
		 }
		
		System.out.println("number of occurences of "  +targetchar + " 'in the input string: " +count);
	}

}

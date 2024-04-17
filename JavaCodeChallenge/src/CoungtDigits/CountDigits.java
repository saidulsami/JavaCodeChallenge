package CoungtDigits;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number or text here");
	    String input1 = sc.nextLine();
	    
	    int digitCount = countDigits(input1);
	    System.out.println("the total number of digits in  " +input1 + " " + "is "  +digitCount);
	    
	    sc.close();
	    
	}
	
	public static int countDigits(String input1) {
		
		StringBuffer sami = new StringBuffer(input1);
		int count =0;
		for (int i=0; i<sami.length();i++) {
			if (Character.isDigit(sami.charAt(i))) {
				
				count++;
				
			}
			
			
			
		}
		
		
		return count;

	}

}

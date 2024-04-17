package findLargestNumber;

import java.util.Scanner;

public class FindLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int input1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int input2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int input3 = sc.nextInt();
		
		if(input1>input2 && input1>input3) {
			
			System.out.println(input1 + "  one is the largest number");
		}
		else if (input2>input3 && input2>input1) {
			
			System.out.println(input2+  "  is the largest number");
			
		}
		else {
			System.out.println(input3 +"  is the largest number");
		}
		

	}

}

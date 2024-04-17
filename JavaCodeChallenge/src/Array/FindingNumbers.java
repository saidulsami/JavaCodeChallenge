package Array;

import java.util.Scanner;

public class FindingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] number = {1,2,3,4,5,3,2,5,6,7,8,12};
		 Scanner sc = new Scanner (System.in);
		 System.out.println("enter a number");
		 
		 int targetnumber = sc.nextInt();
		 
		 int count = countOccurrences(number,targetnumber);
		 
		 
		System.out.println("the number " +targetnumber + " appears " +count +" times in the array");
	}

	public static int countOccurrences(int[] number, int targetnumber) {
		 int count2=0;
		 for (int num : number ) {
			 if (num == targetnumber) {
				 count2++;
			 }
		 }
		
		// TODO Auto-generated method stub
		return count2;
	}

}

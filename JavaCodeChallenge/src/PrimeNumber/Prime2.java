package PrimeNumber;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		sc.close();
		int count = 0;

		if (num > 1) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					count++;

				}
			}
			if (count == 2) {

				System.out.println("Prime number");
			} else {

				System.out.println("not prime number");
			}

		} else {
			System.out.println("ivalid input, enter number greate than 1");
		}
	}
}

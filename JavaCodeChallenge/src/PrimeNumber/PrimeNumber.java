package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = sc.nextInt();
		sc.close();

		if (input <= 1) {
			System.out.println(input + "is not prime number");

		} else {

			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(input); i++) {

				if (input % i == 0) {

					isPrime = false;
					break;

				}
			}
				if (isPrime) {

					System.out.println(input + " is a prime number. ");

				} else {
					System.out.println(input + "is not a prime number.");
				}

			}
		}

	}



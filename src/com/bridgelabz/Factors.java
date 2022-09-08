/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;

/**
 * @author PAVITHRA C
 *
 */
public class Factors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:-");
		int number = scanner.nextInt();
		boolean isPrime = true;

		for (int i = 1; i < number / 2; i++) {
			if (number % 2 == 0) {
				isPrime = false;
				break;
			}
			if (isPrime == true)
				System.out.println(number + " is prime");
			else
				System.out.println(number + " is not a prime");

	}

}
}

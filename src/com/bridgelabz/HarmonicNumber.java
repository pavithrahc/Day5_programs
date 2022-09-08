/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;
/**
 * @author PAVITHRA C
 *
 */
public class HarmonicNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the harmonic number you want to find:-");
		int number1 = scanner.nextInt();

		double result = 0;
		double number = 0;

		for (int i = 1; i <= number1; i++) {
			number = number + ((double) 1 / i);
			result = number;
		}
		System.out.println("The value of Harmonic no. " + number1 + " is:- " + result);

	}

}

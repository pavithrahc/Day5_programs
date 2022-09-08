/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;
/**
 * @author PAVITHRA C
 *
 */
public class FindQuotientAndRemainder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Dividend number:-");
		int dividend = scanner.nextInt();

		System.out.print("Enter Divisor number:-");
		int divisor = scanner.nextInt();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("The Quotient is = " + quotient);
		System.out.println("The Remainder is = " + remainder);

	}

}

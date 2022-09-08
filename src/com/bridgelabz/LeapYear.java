/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;

/**
 * @author PAVITHRA C
 *
 */
public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Four Digit Year:-");
		int year = scanner.nextInt();

		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
			System.out.println("Lear Year");
		else
			System.out.println("Not leap Year");

	}

}

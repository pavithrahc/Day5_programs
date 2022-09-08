/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;

/**
 * @author PAVITHRA C
 *
 */
public class CheckEvenAndOddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the integer Number:-");
		int number = scanner.nextInt();

		if (number % 2 == 0)
			System.out.println(number + " :is Even Number ");
		else
			System.out.println(number + " :is Odd Number ");

	}


	}



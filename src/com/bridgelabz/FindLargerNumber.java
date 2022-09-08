/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;
/**
 * @author PAVITHRA C
 *
 */
public class FindLargerNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number:-");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter Second Number:-");
		int secondNumber = scanner.nextInt();

		System.out.print("Enter Third Number:-");
		int thirdNumber = scanner.nextInt();

		if (firstNumber >= secondNumber && firstNumber >= thirdNumber)
			System.out.println("First Number is Greater");
		else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)
			System.out.println("Second Number is Greater");
		else
			System.out.println("Third Number is Greater");
	}

	}



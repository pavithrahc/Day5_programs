/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;
/**
 * @author PAVITHRA C
 *
 */
public class SwappingTheNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number:-");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter Second Number:- ");
		int secondNumber = scanner.nextInt();

		System.out.println(" Before Swapping ");
		System.out.println("First Number:= " + firstNumber + " Second Number:= " + secondNumber);

		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;

		System.out.println(" After Swapping");
		System.out.println("First Number:= " + firstNumber + " Second Number= " + secondNumber);

	}

}

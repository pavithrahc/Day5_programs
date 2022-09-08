/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;

/**
 * @author PAVITHRA C
 *
 */
public class CheckingVowelOrConsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Alphabet Character :- ");

		char alphabet = scanner.next().charAt(0);

		if ('A' == alphabet || 'E' == alphabet || 'I' == alphabet || 'O' == alphabet || 'U' == alphabet
				|| 'a' == alphabet || 'e' == alphabet || 'i' == alphabet || 'o' == alphabet || 'u' == alphabet)
			System.out.println("Alphabet Is Vowels..");
		else
			System.out.println("Alphabet Is Consonunts..");

	}

}

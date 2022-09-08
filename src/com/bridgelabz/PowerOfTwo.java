/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;
/**
 * @author PAVITHRA C
 *
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter The Power Number of Two:-");
		int power = scanner.nextInt();
		int mul = 1;

		if (power >= 0 && power <= 31) {

			for (int i = 1; i <= power; i++) {
				mul = mul * 2;
				System.out.println(" 2 ^ " + " i :=" + mul);
			}

		} else {
			System.out.println("Value of number should be less than 31");
		}
	}

}

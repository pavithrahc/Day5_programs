/**
 * 
 */
package com.bridgelabz;
import java.util.Random;

/**
 * @author PAVITHRA C
 *
 */
public class HeadOrTails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int number = random.nextInt(2);

		if (number == 1)
			System.out.println("Heads..");
		else
			System.out.println("Tails..");
	}

	}



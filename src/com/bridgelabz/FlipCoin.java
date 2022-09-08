/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;

/**
 * @author PAVITHRA C
 *
 */
public class FlipCoin {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heads = 0;
		int tails = 0;
		int count = 1;
		double random=2;
		
		System.out.println("Enter the number:");
		Scanner n = new Scanner(System.in);
		int flips=n.nextInt();
		
		while(count <= flips) {
			random = Math.random();
			System.out.println(count+" "+random);
		
		if (random<0.5) {
			heads++;
			System.out.println("Heads");
		}
		else {
			tails++;
			System.out.println("Tails");
		}
		count++;
	      System.out.println("Number of Heads: " + heads);
	      System.out.println("Number of Tails: " + tails);
	      
	      double headpercent = (double)heads/flips*100;
	      double tailpercent = (double)heads/tails*100;
	      
	      System.out.println("percentage of heads:"+ headpercent );
	      System.out.println("percentage of tails:"+ tailpercent );
	      
	      
		}
		}
}

/*
 * Task 7- Write a program to print pattern
 * 
 */

package javabasics;

public class PrintPattern {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i >= j)
					System.out.print("*");
			}
			System.out.println("");
		}

	}
}

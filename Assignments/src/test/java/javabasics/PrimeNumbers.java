/*
 *  Task 6- Write a program to print all prime numbers from 1-1000
 */

package javabasics;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {

		primeNumbers(1, 1000);

	}

	private static void primeNumbers(int start, int end) {

		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for (int i = start; i <= end; i++) {
			int counter = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0)
					counter++;
			}
			if (counter < 2)
				primeNumbers.add(i);

		}
		
		System.out.println("Prime Numbers are :"+primeNumbers);
	}
}

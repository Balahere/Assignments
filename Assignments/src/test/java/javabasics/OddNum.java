/*
 * Task 5- Write a program to print all odd numbers from 1-50
 */

package javabasics;

import java.util.ArrayList;

public class OddNum {

	public static void main(String[] args) {

		Odd(1, 50);

	}

	private static void Odd(int startRange, int endRange) {

		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		
		for (int i= startRange; i<=endRange; i++) {
			if(i%2 != 0)
			{
				oddNumbers.add(i);
			}
		}
		System.out.println("Odd numbers are "+oddNumbers);

	}
}

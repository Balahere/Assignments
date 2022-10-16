/*
 * Task 4- Write a program to print all even numbers from 1-200
 */

package javabasics;

import java.util.ArrayList;

public class EvenNum {

	public static void main(String[] args) {

		even(1, 200);

	}

	private static void even(int startRange, int endRange) {

		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		
		for (int i= startRange; i<=endRange; i++) {
			if(i%2 == 0)
			{
			evenNumbers.add(i);
			}
		}
		System.out.println("Even numbers are "+evenNumbers);

	}
}

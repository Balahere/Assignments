/*
 * Task 9- Write a program which will break the current execution if it find number 85 * 
 */

package javabasics;

public class BreakUsageStrings {

	public static void main(String[] args) {
		int inputs[] = { 12,34,66,85,900 };

		for (int input : inputs) {
			System.out.println("The current input is: " + input);
			if (input == 85) {
				System.out.println("match found : breaking the loop");
				break;
			}
		}

	}
}

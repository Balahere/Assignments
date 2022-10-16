/*
 * Task 9- Write a program which will break the current execution if it find number 85 * 
 */

package javabasics;

public class BreakUsage {

	public static void main(String[] args) {
		String inputs[] = {"Java","JavaScript","Selenium","Python","Mukesh"};

		for (String input : inputs) {
			System.out.println("The current input is: " + input);
			if (input.equalsIgnoreCase("Selenium")) {
				System.out.println("match found : breaking the loop");
				break;
			}
		}

	}
}

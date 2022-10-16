/*
 * Task 8- Write a program to print below students marks who have scored above 80
 */

package javabasics;

public class FilterResults {

	public static void main(String[] args) {
	
		int marks[] = {78,12,89,55,35};
		
		for (int mark : marks)
		{
			if (mark > 80)
			{
				System.out.println("Student marks more than 80 found and score is: "+mark);
			}
		}

	}

}

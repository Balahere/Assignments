/*
 * Task 2-  Write a program to print the sum of below 5 numbers.
 * 10,90.78,111,8989,7876
 */

package javabasics;

public class Sum {

	
	
	public static void main(String[] args) {

		Object numbers[] = { 10, 90.78, 111, 8989, 7876 };
		sum(numbers);

	}

	private static void sum(Object[] numbers) {
		double resultSum=0.0;
		for (Object number : numbers) {
			if (number.toString().contains("."))
				resultSum += Double.parseDouble((number.toString()));
			else
			    resultSum +=Integer.parseInt(number.toString());
		}
		
		System.out.println("Sum is :"+resultSum);

	}

}

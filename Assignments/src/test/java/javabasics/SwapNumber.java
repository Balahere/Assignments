/*
 * Task 1 – Write a program to swap two number. For example a=10 and b=20 output should be a=20 and b=10
 */

package javabasics;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
	
			int num1,num2;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first interger:");
			num1 = scan.nextInt();
			System.out.println("Enter second integer:");
			num2 = scan.nextInt();
			swap(num1, num2);

		}

	private static void swap(int num1, int num2) {
		// TODO Auto-generated method stub
		num1 =  num1+ num2;
		num2 =  num1 - num2;
		num1 =  num1 - num2;
		System.out.println("first integer num1 value now is :  "+num1);
		System.out.println("second integer num2 value now is : "+num2);
	}

}

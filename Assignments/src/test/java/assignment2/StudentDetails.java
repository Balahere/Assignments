package assignment2;

import java.util.Scanner;

public class StudentDetails {

	String name;
	String email;
	String phone;
	String address;
	String status;
	static Scanner scan;
	static Student stu;
	static Student[] students;

	public static void main(String[] args) {
		StudentDetails std = new StudentDetails();
		stu = new Student();
		scan = new Scanner(System.in);
		System.out.println("Please enter the number of students");
		int totalStudents = scan.nextInt();
		students = new Student[totalStudents];
		for (int i = 0; i < totalStudents; i++) {
			students[i] = std.enterStudentDetails();
		}

		System.out.println("Enter the student deatils you are looking for");
		std.getStudentDetails(scan.nextInt());
	}

	private void getStudentDetails(int i) {
		System.out.println(students[i - 1].getName());
		System.out.println(students[i - 1].getEmail());
		System.out.println(students[i - 1].getPhone());
		System.out.println(students[i - 1].getAddress());
		System.out.println(students[i - 1].getStatus());

	}

	private Student enterStudentDetails() {
		System.out.println("Please enter the name");
		name = scan.next();
		System.out.println("Please enter the email");
		email = scan.next();
		System.out.println("Please enter the phone number");
		phone = scan.next();
		System.out.println("Please enter the address");
		address = scan.next();
		System.out.println("Please enter the status");
		status = scan.next();
		return stu.setStudentDetails(name, email, phone, address, status);

	}

}

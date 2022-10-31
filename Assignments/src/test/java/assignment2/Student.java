/*
 * Task 3 – Create a program which will store students information and print the output.
 * Program should ask how many students information you want to store. For each students it should ask name, email, phone, address, status
 * Once all entries are done, program should ask which user information you want to fetch and should print the same.
 * Note- Use scanner class for dynamic students
 */

package assignment2;

public class Student {
	
	private String name;
	private String email;
	private String phone;
	private String address;
	private String status;
	
	/*public Student(String nameIn, String emailIn, String phoneIn, String addressIn, String statusIn )
	{
		this.name = nameIn;
		this.email= emailIn;
		this.phone = phoneIn;
		this.address = addressIn;
		this.status = statusIn;
	}*/
	
	public Student setStudentDetails(String nameIn, String emailIn, String phoneIn, String addressIn, String statusIn )
	{
		this.name = nameIn;
		this.email= emailIn;
		this.phone = phoneIn;
		this.address = addressIn;
		this.status = statusIn;
		return this;
	}

	 public String getName() {
		    return name;
	}
	 
	 public String getPhone() {
		    return phone;
	}
	
	 public String getEmail() {
		    return email;
	}
	
	 public String getAddress() {
		    return address;
	}
	 public String getStatus() {
		    return status;
	}
	
	
}

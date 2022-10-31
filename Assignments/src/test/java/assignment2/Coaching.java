/*
 * Task 1- Create a class name as “Trainer” which will have 4 fields name, department ,  email, id. Trainer can teach Selenium, DevOps, Web Development.
Note- use method, constructor 

Trainer details are 
Trainer 1 – “Mukesh” ,”Testing”,mukesh@gmail.com, 1
Trainer 2 – “Hitesh” ,”Dev”,mukesh@gmail.com, 2
Trainer 1 – “Mukesh” ,”DevOps”,mukesh@gmail.com, 3

Trainer 1 can teach Selenium, Trainer 2 can teach Web Development, Trainer 3 can teach DevOps.

Task 2- Extension of task 1 – Store all trainer information in Array.
 * 
 */

package assignment2;

public class Coaching {

	public static void main(String[] args) {

		Trainer t1 = new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1);
		Trainer t2 = new Trainer("Hitesh", "Dev", "hitesh@gmail.com", 2);
		Trainer t3 = new Trainer("Mukesh", "Devops", "mukesh@gmail.com", 3);

		Trainer trainerArray[] = { t1, t2, t3 };
		
		}

}

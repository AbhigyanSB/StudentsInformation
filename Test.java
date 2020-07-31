
package sarmabaruaabhigyan_OOP_01;

public class Test {
	
	//Main method
	public static void main(String[] args) {
		
		//Creating a Students object for each age groups Child, Teenager, Young Adult and Adult
		
		Student s1 = new Student("Alex", "Male", 27);	//using three-argument constructor
		s1.display();	//calling the display method
		System.out.println();	//space to distinguish between the information of two different students
		
		Student s2 = new Student("Linda", "Chen", "Female", 22);	//using four-argument constructor
		s2.display();	//calling the display method
		System.out.println();	//space to distinguish between the information of two different students
		
		Student s3 = new Student("Max", "Gayle", "Male", 11);	//using four-argument constructor
		s3.display();	//calling the display method
		System.out.println();	//space to distinguish between the information of two different students
		
		Student s4 = new Student("Jenny", "Female", 17);	//using three-argument constructor
		s4.display();	//calling the display method
		System.out.println();	//space to distinguish between the information of two different students

	}

}

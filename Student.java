
package sarmabaruaabhigyan_OOP_01;

public class Student {
	
	//Creating the private fields for the four attributes first name, last name, gender and age
	private String FirstName;
	private String LastName;
	private String Gender;
	private int Age;
	
	//Generating four-argument constructors for the four attributes first name, last name, gender and age
	public Student(String firstName, String lastName, String gender, int age) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Gender = gender;
		Age = age;
	}

	//Generating three-argument constructors for the attributes and considering the last name to be an empty String
	public Student(String firstName, String gender, int age) {
		super();
		FirstName = firstName;
		LastName = "";	//considering the last name to be an empty string
		Gender = gender;
		Age = age;
	}
		
	//Conditions of the class method to return the age group of the students
	public String ageGroup(int age) {
	
		if (age<=12) {
			return "Child";		//returns the age group as a child if the age is less than 12
		}
	
		else if (13<=age && age<=19) {
			return "Teenager";		//returns the age group as a teenager if the age is greater than 13 and less than 19
		}
		else if (20<=age && age<=25) {
			return "Young Adult";		//returns the age group as a young adult if the age is greater than 20 and less than 25
		}
		else {
			return "Adult";		//returns the age group as a adult, if none of the conditions are satisfied
		}
		
	}

	//invoking the display method to display the output against four students
	public void display() {
		
		//displaying the first name, last name, gender, age and age group against the different students
		System.out.println("First Name: "+this.FirstName);
		System.out.println("Last Name: "+this.LastName);
		System.out.println("Gender: "+this.Gender);
		System.out.println("Age: "+this.Age);
		System.out.println("Age Group: "+this.ageGroup(this.Age));
		
	}

}
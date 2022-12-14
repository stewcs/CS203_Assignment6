/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This is the customer utility class.
 * Due: 12/9/22
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Daniel Xu
*/

public class Customer {

	String name = "";
	int age = 0;

	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Customer(String name, int age){
		this.name = name;
		this.age = age;
	}

	// copy constructor
	/**
	 * 
	 * @param C
	 */
	public Customer(Customer C) {
		this.name = C.name;
		this.age = C.age;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}



}

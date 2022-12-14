/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This is the beverage class. It is the superclass for Coffee, Alcohol, and Smoothie. 
 * 				It provides common methods and utility for a drink object.
 * Due: 12/07/22
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Daniel Xu
*/





public abstract class Beverage {

	String bevName;
	Type type;
	Size size;
	final double BASE_PRICE = 2.0;
	final double SIZE_PRICE = 1.0;
	double totalPrice = 0;

	/**
	 * 
	 * @param bevName
	 * @param type
	 * @param size
	 */
	public Beverage(String bevName, Type type, Size size) {
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	/**
	 * 
	 * @param bevName
	 * @param size
	 */
	public Beverage(String bevName, Size size) {
		this.bevName = bevName;
		this.size = size;
	}

	// Calculates a new price by adding the size price to the base price.
	/**
	 * 
	 * @return totalPrice 
	 */
	double addSizePrice() {

		switch(size) {

		case SMALL: totalPrice = SIZE_PRICE + BASE_PRICE;
		break;
		case MEDIUM: totalPrice = (SIZE_PRICE * 2) + BASE_PRICE;
		break;
		case LARGE: totalPrice = (SIZE_PRICE * 3) + BASE_PRICE;
		break;
		default:
			; 	
		}
		return totalPrice;
	}

	// Calculates the beverage price
	abstract double calcPrice();

	
	// Checks if this Beverage equals to anotherBev
	/**
	 * 
	 * @param anotherBev
	 * @return boolean
	 */
	public boolean equals(Beverage anotherBev) {
		if (bevName.equals(anotherBev.getBevName()) && this.type == anotherBev.getType() && this.size == anotherBev.getSize()) { 
			return true;
		}
		return false;
	}


	// Gets the base price
	/**
	 * 
	 * @return BASE_PRICE
	 */
	public double getBasePrice() {
		return BASE_PRICE;
	}

	// Gets the name of the beverage
	/** 
	 * 
	 * @return bevName
	 */
	public String getBevName() {
		return bevName;
	}

	// Gets the size of the beverage
	/**
	 * 
	 * @return size
	 */
	public Size getSize() {
		return size;
	}

	// Gets beverage type
	/**
	 * 
	 * @return type
	 */
	public Type getType() {
		 return this.type;
	}
	
	// Represents a Beverage object in String with the format of bevName,size
	@Override
	public String toString() {
		return "Beverage [bevName=" + bevName + ", size=" + size + "]";
	}



}

/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This is the smoothie class, a subclass of beverage. It defines the smoothie drink and provides utility.
 * Due: 12/08/22
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Daniel Xu
*/

public class Smoothie extends Beverage {

	double fruit = 0;
	boolean protein;
	double totalPrice = 0;
	final double FRUIT_PRICE = 0.50;
	final double PROTEIN_PRICE = 1.50;

	/**
	 * 
	 * @param bevName
	 * @param size
	 * @param fruit
	 * @param protein
	 */
	public Smoothie(String bevName, Size size, double fruit, boolean protein) {
		super(bevName, Type.SMOOTHIE, size);
		this.fruit = fruit;
		this.protein = protein;
	}

	@Override
	/**
	 ** @return totalPrice
	 */
	double calcPrice() {
		totalPrice = 0;
		
		// Calculate fruit and protein costs
		if(fruit > 0)
			totalPrice += fruit * FRUIT_PRICE;
		if(protein)
			totalPrice += PROTEIN_PRICE;
		

		// Base Price or Size Price
		switch(size) {

		case SMALL: totalPrice += (BASE_PRICE);
		break;
		case MEDIUM: totalPrice += ((SIZE_PRICE * 1) + BASE_PRICE);
		break;
		case LARGE: totalPrice += ((SIZE_PRICE * 2) + BASE_PRICE);
		break;
		default:
			; 	
		}
		
		return totalPrice;
	}
	
	// check if protein is added
	/**
	 * 
	 * @return protein
	 */
	public boolean getAddProtein() {
		return protein;
		
	}
	
	// return num of fruit
	/**
	 * 
	 * @return fruit
	 */
	public double getNumOfFruits() {
		return fruit;
	}
	
	public String toString() {
		return "Smoothie [name=" + bevName + ", size=" + size + ", fruit count=" + fruit + "protein added=" + protein + ", totalPrice=" + totalPrice
				+ "]";
	}

}

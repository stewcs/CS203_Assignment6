/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This is the coffee class, a subclass of beverage. It defines the coffee drink and provides utility.
 * Due: 12/08/22
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Daniel Xu
*/


public class Coffee extends Beverage {

	boolean extraShot;
	boolean extraSyrup;
	double totalPrice = 0;
	final double EXTRA_SHOT_PRICE = 0.50;
	final double EXTRA_SYRUP_PRICE = 0.50;


	/**
	 * 
	 * @param bevName
	 * @param size
	 * @param extraShot
	 * @param extraSyrup
	 */
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;

	}
	/**
	 * @return totalPrice
	 */
	@Override
	double calcPrice() {
		totalPrice = 0;

		// Check for coffee addition's
		if (extraShot == true)
			totalPrice += EXTRA_SHOT_PRICE;
		if (extraSyrup == true)
			totalPrice += EXTRA_SYRUP_PRICE;
		
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

	// Indicates whether or not extra shot is added
	/**
	 * 
	 * @return extraShot
	 */
	public boolean getExtraShot() {
		return extraShot;

	}

	// Indicates whether or not extra syrup is added
	/**
	 * 
	 * @return extraSyrup
	 */
	public boolean getExtraSyrup() {
		return extraSyrup;

	}


	@Override
	public String toString() {

		return "Coffee [bevName=" + bevName + ", size=" + size + ","
				+ "extraShot=" + extraShot + ", extraSyrup=" + extraSyrup + ", totalPrice=" + calcPrice() + "]";

	}

	// Checks if this Beverage equals another coffee
	/**
	 * 
	 * @param c
	 * @return boolean
	 */
	public boolean equals(Coffee c) {
		if (super.equals(c)
				&& this.extraShot == c.getExtraShot() 
				&& this.extraSyrup == c.getExtraSyrup()) {
			return true;
			
		}

		return false;

	}

}

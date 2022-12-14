/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This is the alcohol class, a subclass of beverage. It defines the alcohol drink and provides utility.
 * Due: 12/08/22
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Daniel Xu
*/

public class Alcohol extends Beverage {

	boolean weekend;
	double totalPrice = 0;
	final double WEEKEND_COST = 0.60;

	public Alcohol(String bevName, Size size, boolean weekend) {
		super(bevName, Type.ALCOHOL, size);
		this.weekend = weekend;

	}

	@Override
	// Calculates the price of the alcohol
	/**
	 * @return totalPrice
	 */
	double calcPrice() {
		totalPrice = 0;
		// Calculate weekend costs
		if (weekend == true)
			totalPrice += WEEKEND_COST;
		
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

	// Checks if this Beverage equals to anotherBev
	/**
	 * 
	 * @param a
	 * @return boolean
	 */
	public boolean equals(Alcohol a) {
		 if (super.equals(a) && weekend == a.isWeekend()) {
             return true;
     }
		return false;

	}

	
	@Override
	public String toString() {
		return "Alcohol [name=" + bevName + ", size=" + size + ", weekend=" + weekend + ", totalPrice=" + totalPrice
				+ "]";
	}

	
	// Checks if is weekend.
	/**
	 * 
	 * @return weekend
	 */
	public boolean isWeekend() {
		return weekend;
	}

}

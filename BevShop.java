/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This is the Bevshop class. This class processes orders and other utility like sales.
 * Due: 12/11/22
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Daniel Xu
*/


import java.util.ArrayList;

public class BevShop implements BevShopInterface{

	int numOfAlcoholInOrder;
	int currentOrderIndex;
	ArrayList<Order> orders; 

	@Override 
	/**
	 * @param time | the current time
	 * @return boolean | true if time is valid, false if time is invalid
	 */
	// Checks if the time is valid (between 8 and 23 )
	public boolean isValidTime(int time) {
		if (time >= MIN_TIME && time <= MAX_TIME) {
			System.out.println("Current time is valid.");
			return true;
		}
		System.out.println("Error! Current time invalid.");
		return false;
	}

	@Override
	/**
	 * @return MAX_FRUIT
	 */
	// returns the max amount of fruits 
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}

	@Override
	/**
	 * @return MIN_AGE_FOR_ALCOHOL
	 */
	// returns the constant value for the Maximum age for offering Alcohol drink
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	/**
	 * @param numOfFruits
	 * @return boolean
	 */
	// returns true if the passed parameter exceeds the Maximum FRUIT allowed
	public boolean isMaxFruit(int numOfFruits) {
		if (numOfFruits > MAX_FRUIT) {
			System.out.println("Maximum number of fruits reached!");
			return true;
			}
		System.out.println("You can have more fruit.");
		return false;
	}

	@Override
	/**
	 ** @return MAX_ORDER_FOR_ALCOHOL
	 */
	// returns constant maximum number of alcohol beverages/per order offered by the beverage shop
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	/**
	 * @return boolean
	 */
	// checks if the number of alcohol beverages for the current order has reached the maximum
	public boolean isEligibleForMore() {
		if (numOfAlcoholInOrder < MAX_ORDER_FOR_ALCOHOL) {
			System.out.println("You have reached max alcohol allowed.");
			return true;
			}
		System.out.println("You can have more alcohol.");
		return false;
	}

	@Override
	/** 
	 * @return numofAlcoholInOrder | returns the number of alcohol drinks for the current order
	 */
	// returns the number of alcohol drinks for the current order
	public int getNumOfAlcoholDrink() {
		return numOfAlcoholInOrder;
	}

	@Override
	/**
	 * @param age | the age to be checked
	 * @return boolean | true if age is valid, false if age is invalid (for alcohol)
	 */
	// check the valid age for the alcohol drink
	public boolean isValidAge(int age) {
		if (age >=  MIN_AGE_FOR_ALCOHOL) {
			System.out.println("You are old enough for alcohol.");
			return true;
			}
		System.out.println("You are not old enough for alcohol.");
		return false;
	}

	@Override
	/**
	 * @param time
	 * @param day
	 * @param customerName
	 * @param customerAge
	 */
	// Creates a new order , NO BEVERAGE is added to the order yet
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		Customer customer = new Customer(customerName, customerAge);
		Order newOrder = new Order(time, day, customer);
		orders.add(newOrder);
		currentOrderIndex = orders.indexOf(newOrder);
		numOfAlcoholInOrder = 0;

	}

	@Override
	/**
	 * @param bevName
	 * @param size
	 * @param extraShot
	 * @param extraSyrup
	 */
	// process the Coffee order for the current order by adding it to the current order
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		System.out.println("Processing coffee order.");
		orders.get(currentOrderIndex).addNewBeverage(bevName, size, extraShot, extraSyrup);

	}

	@Override
	/**
	 * @param bevName
	 * @param size
	 */
	// process the Alcohol order for the current order by adding it to the current order
	public void processAlcoholOrder(String bevName, Size size) {
		System.out.println("Processing alcohol order.");
		orders.get(currentOrderIndex).addNewBeverage(bevName, size);
		numOfAlcoholInOrder++;

	}

	@Override
	/**
	 * @param bevName
	 * @param size
	 * @param numOfFruits
	 * @param addProtein
	 */
	// process the Smoothie order for the current order by adding it to the current order
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		System.out.println("Processing smoothie order.");
		orders.get(currentOrderIndex).addNewBeverage(bevName, size, numOfFruits, addProtein);

	}

	@Override
	/**
	 * @param orderNo | the order to be located
	 * @return i 
	 * @return -1
	 */
	// locate an order based on the order number
	public int findOrder(int orderNo) {
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getOrderNo() == orderNo) {
				return i;
			}
		}

		return -1;
	}

	@Override
	/**
	 * @param orderNo | the order to be found
	 * @return total | the order's total value
	 */
	// locates an order in the list of orders and returns the total value on the order.
	public double totalOrderPrice(int orderNo) {
		double total = 0;

		for (Order o : orders) {
			if (o.getOrderNo() == orderNo) {
				for (Beverage b : o.getBeverages()) {
					total += b.calcPrice();
				}
			}
		}
		return total;
	}

	@Override
	/**
	 * @return total | the total sale of all the orders
	 */
	// Calculates the total sale of all the orders for this beverage shop
	public double totalMonthlySale() {
		double total = 0;

		for (Order o : orders) {
			for (Beverage b : o.getBeverages()) {
				total += b.calcPrice();
			}
		}

		return total;
	}

	@Override
	/**
	 * @return int | the total number of orders within the month
	 */
	// returns total numbers of orders within the month
	public int totalNumOfMonthlyOrders() {
		 return orders.size();
	}

	@Override
	/**
	 * @return Order | the current order in the index
	 */
	// returns the current Order located in the index in the list of orders.
	public Order getCurrentOrder() {
		  return orders.get(currentOrderIndex);
	}

	@Override
	/**
	 * @param index | the specified index
	 * @return Order | the order at the specified index
	 */
	// returns Order in the list of orders at the index Notes: this method returns the shallow copy of the order
	public Order getOrderAtIndex(int index) {
		 return orders.get(index);
	}

	@Override
	// sorts the orders within this bevShop using the Selection sort algorithm
	// In what way am I sorting the orders though?
	public void sortOrders() {
		
//		for(int i = 0; i < orders.size()-1; i++) {
//			int sort = 0;
//			for(int j = i + 1; j <= orders.size(); j++) {
//				if(orders.get(j) < orders.get(sort))
//					sort = j;
//			}
//		}
			

	}

}

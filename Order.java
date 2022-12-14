/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This is the order class. This class enables you to create orders.
 * Due: 12/10/22
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Daniel Xu
*/

import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Object>{

	int orderNumber = 0;
	int orderTime = 0;
	Day orderDay;
	Customer customer;
	private ArrayList<Beverage> beverages;

	/**
	 * 
	 * @param orderTime
	 * @param orderDay
	 * @param customer
	 */
	public Order(int orderTime, Day orderDay, Customer customer) {
		this.orderNumber = getOrderNo();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = customer;
		beverages = new ArrayList<>();
	}

	/**
	 * 
	 * @return rand | random order number
	 */
	// Automatically generate order number
	public int generateOrder() {
		int rand = 10000 + new Random().nextInt(80000);
		return rand;

	}
	/**
	 ** @return orderNumber
	 */
	//returns the order number
	public int getOrderNo() {
		return orderNumber;
	}
	/**
	 ** @return orderTime
	 */
	// returns the order time
	public int getOrderTime() {
		return orderTime;
	}
	
	/**
	 ** @return orderDay
	 */
	// returns the order day
	public Day getOrderDay() {
		return orderDay;
	}
	
	/**
	 * 
	 * @return Customer
	 */
	public Customer getCustomer() {
		return new Customer(customer);
	}
	
	@Override
	/**
	 * 
	 * @param o another order
	 * @return 0 
	 * @return 1
	 * @return -1
	 */
	public int compareTo(Order o) {
		if (orderNumber == o.getOrderNo()) {
            return 0;
    }
    else if (orderNumber > o.getOrderNo()) {
            return 1;
    }
    else {
            return -1;
    }
	}

	@Override
	/**
	 * returns the beverage listed in the itemNo of the order, for example if
	 * itemNo is 0 this method will return the first beverage in the order
	 * Note: this method returns the shallow copy of the Beverage
	 * 
	 * @return the beverage listed in the itemNo of the order or null if there
	 *         is no item in the order
	 * 
	 */
	public Beverage getBeverage(int itemNo) {
		return beverages.get(itemNo);
	}

	@Override
	/**
	 * adds coffee order to this order
	 * @param bevName beverage name
	 * @param size beverage size of type SIZE
	 * @param extraShot true if the coffee beverage has extra shot , false otherwise
	 * @param extraSyrup true if the coffee beverage has extra syrup , false otherwise
	 */
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		Coffee c = new Coffee(bevName, size, extraShot, extraSyrup);
		beverages.add(c);
		System.out.println("Coffee '" + bevName + "' added. Size: " + size + ". Extra shot: " + extraShot + ". Extra syrup: " + extraSyrup + ".");

	}

	@Override
	/**
	 * adds alcohol order to this order
	 * @param bevName beverage name
	 * @param size beverage size
	 */ 
	public void addNewBeverage(String bevName, Size size) {
		boolean isWeekend = false;

		if (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY) 
			isWeekend = true;


		Alcohol a = new Alcohol(bevName, size, isWeekend);
		beverages.add(a);
		System.out.println("Alcohol '" + bevName + "' added. Size: " + size + ".");

	}

	@Override
	/**
	 * Adds the Smoothie beverage to this order
	 * @param bevName beverage name
	 * @param size beverage size
	 * @param numOfFruits number of fruits added 
	 * @param addProtein true if protein is added, false otherwise
	 */
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {

		Smoothie s = new Smoothie(bevName, size, numOfFruits, addProtein);
		beverages.add(s);
		System.out.println("Smoothie '" + bevName + "' added. Size: " + size + ". Fruit count: " + numOfFruits + ". Protein: " + addProtein + ".");
	}

	@Override
	/**
	 * Calculates and returns the total amount for this order
	 * @return total amount for this order
	 */
	public double calcOrderTotal() {
		double orderTotal = 0;

		
		for (int i = 0; i < beverages.size(); i++)
			orderTotal += beverages.get(i).calcPrice();
			

		return orderTotal;
	}

	@Override
	/**
	 * returns the number of beverages of same type in an order
	 * @param type the type of the beverage
	 * @return number of beverages of type type in this order
	 */
	public int findNumOfBeveType(Type type) {
		int num = 0;

		for (Beverage b : beverages) 
			if (b.getType() == type) 
				num++;

		return num;
	}

	@Override
	/**
	 * 
	 * @return true if the day is a weekend day (Saturday or Sunday)
	 */
	public boolean isWeekend() {
		if (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY) {
			return true;
		}
		return false;
	}

	@Override
	/**
	 * @return String
	 */
	// String representation of the order, Includes order number, time , day, customer name and age and the list of beverages
	public String toString() {
		return "Order [orderNumber =" + orderNumber + ", orderTime =" + orderTime + ", orderDay =" + orderDay
				+ ", customer =" + customer + ", beverages =" + beverages + ", getCustomer() =" + getCustomer() + "]";
	}

	/**
	 *  returns the total number of items in this order
	 *  @return total items in order
	 */
	public int getTotalItems() {
		return beverages.size();
	}

	
	
	  public ArrayList<Beverage> getBeverages() {
          return beverages;
  }

	@Override
	public int compareTo(Object o) {
		
		return 0;
	}

	
}



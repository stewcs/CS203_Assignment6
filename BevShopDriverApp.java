import java.util.Scanner;

public class BevShopDriverApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		Order orderOne, orderTwo;
	
		System.out.println("Starting a new order");
		System.out.println("Press Enter to continue.");
		input.nextLine();
		
		
		orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		System.out.println("Order time: " + orderOne.getOrderTime());
		System.out.println("Order day: " + orderOne.getOrderDay());
		System.out.println("Customer information [Name and Age]: " + orderOne.getCustomer().getName() + " " + orderOne.getCustomer().getAge());
		System.out.println("Press Enter to continue.");
		input.nextLine();
	
		System.out.println("Adding a coffee to the order.");
		System.out.println("Press Enter to continue.");
		input.nextLine();
		orderOne.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		System.out.println("Current order total: " + orderOne.calcOrderTotal());
		input.nextLine();
		
		System.out.println("Adding an alcohol to the order.");
		System.out.println("Press Enter to continue.");
		input.nextLine();
		orderOne.addNewBeverage("Mohito", Size.SMALL);
		System.out.println("Current order total: " + orderOne.calcOrderTotal());
		input.nextLine();
		
		System.out.println("Adding a smoothie to the order.");
		System.out.println("Press Enter to continue.");
		input.nextLine();
		orderOne.addNewBeverage("Detox", Size.MEDIUM, 1, false);			
		System.out.println("Current order total: " + orderOne.calcOrderTotal());
		input.nextLine();

		
		System.out.println("Programmer name: Daniel Xu");
			
		System.exit(0);
		
		
		
		
		
		
		
		
	}

}

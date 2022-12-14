import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTestStudent {

	Order o1, o2, o3;
	
	@BeforeEach
	void setUp() throws Exception {
		o1 = new Order(1, Day.MONDAY, new Customer("Stewie", 22));
		o2 = new Order(3, Day.TUESDAY, new Customer("Tarik", 22));
		o3 = new Order(5, Day.SUNDAY, new Customer("Andreas", 21));
		Coffee c1 = new Coffee("regular Coffee", Size.SMALL, false, false);
		Smoothie s1 = new Smoothie("Strawberry", Size.MEDIUM, 1, false);
		Alcohol a1 = new Alcohol("Mystery", Size.LARGE, true);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testgetOrderNo() {
		o1 = new Order(1, Day.MONDAY, new Customer("Stewie", 22));
		assertEquals(0, o1.getOrderNo());
	}
	
	@Test
	void testgetOrderTime() {
		o1 = new Order(1, Day.MONDAY, new Customer("Stewie", 22));
		assertEquals(1, o1.getOrderTime());
		o2 = new Order(3, Day.TUESDAY, new Customer("Tarik", 22));
		assertEquals(3, o2.getOrderTime());
	}
	
	@Test
	void testgetOrderDay() {
		o1 = new Order(1, Day.MONDAY, new Customer("Stewie", 22));
		assertEquals(Day.MONDAY, o1.getOrderDay());
	}
	
	@Test
	void testAddNewBeverage() {
		assertTrue(o1.getTotalItems() == 0);
		o1.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		assertTrue(o1.getBeverage(0).getType().equals(Type.COFFEE));
		o1.addNewBeverage("Mystery", Size.LARGE);
		assertTrue(o1.getBeverage(1).getType().equals(Type.ALCOHOL));
		o1.addNewBeverage("Strawberry", Size.MEDIUM, 1, false);
		assertTrue(o1.getBeverage(2).getType().equals(Type.SMOOTHIE));
		assertTrue(o1.getTotalItems() == 3);
	}
	
	

}

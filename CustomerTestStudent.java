import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for the Customer Class
 * 
 * @author Daniel Xu
 * @version 12/11/2022
 *
 */


class CustomerTestStudent {

	@BeforeEach
	void setUp() throws Exception {
		Customer a = new Customer("Stewie", 24);
		Customer b = new Customer("Tarik", 23);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetName() {
		Customer a = new Customer("Stewie", 24);
		assertEquals("Stewie", a.getName());
		Customer b = new Customer("Tarik", 23);
		assertEquals("Tarik", b.getName());
	}

	@Test
	void testGetAge() {
		Customer a = new Customer("Stewie", 24);
		assertEquals(24, a.getAge());
		Customer b = new Customer("Tarik", 23);
		assertEquals(23, b.getAge());
	}

	@Test
	void testToString() {
		Customer a = new Customer("Stewie", 24);
		assertEquals("Customer [name=Stewie, age=24]", a.toString());
	}

}

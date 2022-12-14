import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for the Beverage Class
 * 
 * @author Daniel Xu
 * @version 12/11/2022
 *
 */


class BevShopTestStudent extends BevShop{

	Order o1;
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testgetMaxFruits() {
		int maxFruitTestVar = getMaxNumOfFruits();
		assertEquals(MAX_FRUIT, maxFruitTestVar);
	}
	
	@Test
	void testgetMinAgeForAlcohol() {
		int ageTestVar = getMinAgeForAlcohol();
		assertEquals(MIN_AGE_FOR_ALCOHOL, ageTestVar);
	}
	
	@Test
	void testgetMaxOrderForAlcohol() {
		int maxTestVar = getMaxOrderForAlcohol();
		assertEquals(MAX_ORDER_FOR_ALCOHOL, maxTestVar);
	}
	
	@Test
	void testgetNumOfAlcoholDrink() {
		assertEquals(0, getNumOfAlcoholDrink());
	}
	
	@Test
	void testisValidAge() {
		assertEquals(true, isValidAge(24));
	}

}

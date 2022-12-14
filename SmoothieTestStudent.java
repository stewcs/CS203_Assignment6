import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for the Smoothie Class
 * 
 * @author Daniel Xu
 * @version 12/11/2022
 *
 */


class SmoothieTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	Smoothie a = new Smoothie("Strawberry", Size.MEDIUM, 1, false); // medium smoothie with 1 fruit and no protein
	Smoothie b = new Smoothie("Fruit", Size.LARGE, 2, true); // fruit smoothie with everything
	Smoothie c = new Smoothie("banana", Size.SMALL, 2, false); // small banana smoothie with 2 fruits and no protein
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcPrice() {
		Smoothie a = new Smoothie("Strawberry", Size.MEDIUM, 1, false);
		assertEquals(3.50, a.calcPrice());
		Smoothie b = new Smoothie("Fruit", Size.LARGE, 2, true);
		assertEquals(6.50, b.calcPrice());
		Smoothie c = new Smoothie("banana", Size.SMALL, 2, false);
		assertEquals(3.00, c.calcPrice());
				
	}

	@Test
	void testGetSize() {
		Smoothie b = new Smoothie("Fruit", Size.LARGE, 2, true);
		assertEquals(Size.LARGE, b.getSize());
	}

	@Test
	void testGetType() {
		Smoothie c = new Smoothie("banana", Size.SMALL, 2, false);
		assertEquals(Type.SMOOTHIE, c.getType());
	}
	
	@Test
	void testGetAddProtein() {
		Smoothie a = new Smoothie("Strawberry", Size.MEDIUM, 1, false);
		assertEquals(false, a.getAddProtein());
		Smoothie b = new Smoothie("Fruit", Size.LARGE, 2, true);
		assertEquals(true, b.getAddProtein());
	}
	
	@Test
	void testGetNumOfFruits() {
		Smoothie b = new Smoothie("Fruit", Size.LARGE, 2, true);
		assertEquals(2, b.getNumOfFruits());
	}
	
	@Test
	void testtoString() {
		Smoothie a = new Smoothie("Strawberry", Size.MEDIUM, 1, false);
		assertEquals("Smoothie [name=Strawberry, size=MEDIUM, fruit count=1.0protein added=false, totalPrice=0.0]", a.toString());
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for the Alcohol Class
 * 
 * @author Daniel Xu
 * @version 12/11/2022
 *
 */

class AlcoholTestStudent {

	@BeforeEach
	void setUp() throws Exception {
		Alcohol a = new Alcohol("Mezcal", Size.SMALL, false); // small alcohol with weekend false
		Alcohol b = new Alcohol("Vodka", Size.MEDIUM, true); // medium alcohol with weekend true
		Alcohol c = new Alcohol("Mystery", Size.LARGE, true); // large alcohol with weekend true
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcPrice() {
		Alcohol a = new Alcohol("Mezcal", Size.SMALL, false);
		assertEquals(2.0, a.calcPrice());
	}

	@Test
	void testToString() {
		Alcohol b = new Alcohol("Vodka", Size.MEDIUM, true);
		assertEquals("Alcohol [name=Vodka, size=MEDIUM, weekend=true, totalPrice=0.0]", b.toString());
	}

	@Test
	void testIsWeekend() {
		Alcohol a = new Alcohol("Mezcal", Size.SMALL, false);
		assertEquals(false, a.isWeekend());
		Alcohol c = new Alcohol("Mystery", Size.LARGE, true);
		assertEquals(true, c.isWeekend());
	}

	@Test
	void testGetSize() {
		Alcohol c = new Alcohol("Mystery", Size.LARGE, true);
		assertEquals(Size.LARGE, c.getSize());
	}

	@Test
	void testGetType() {
		Alcohol c = new Alcohol("Mystery", Size.LARGE, true);
		assertEquals(Type.ALCOHOL, c.getType());
	}

}

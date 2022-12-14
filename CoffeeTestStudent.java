import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * JUnit Test Case for the Coffee Class
 * 
 * @author Daniel Xu
 * @version 12/11/2022
 *
 */




class CoffeeTestStudent {

	@BeforeEach
	void setUp() throws Exception {
		Coffee a = new Coffee("regular Coffee", Size.SMALL, false, false);
		Coffee b = new Coffee("large Coffee", Size.LARGE, false, false);
		Coffee c = new Coffee("a bit of everything", Size.MEDIUM, true, true);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcPrice() {
		Coffee a = new Coffee("regular Coffee", Size.SMALL, false, false); // Small Coffee plain
		Coffee b = new Coffee("large Coffee", Size.LARGE, false, false); // Large Coffee Plain
		Coffee c = new Coffee("a bit of everything", Size.MEDIUM, true, true);	// Medium Coffee with shot and syrup
		assertEquals(2.0, a.calcPrice());
		assertEquals(4.0, b.calcPrice());
		assertEquals(4.0, c.calcPrice());
	}

	@Test
	void testToString() {
		Coffee b = new Coffee("large Coffee", Size.LARGE, false, false);
		assertEquals("Coffee [bevName=large Coffee, size=LARGE,extraShot=false, extraSyrup=false, totalPrice=4.0]", b.toString());
		
	}

	@Test
	void testGetExtraShot() {
		Coffee c = new Coffee("a bit of everything", Size.MEDIUM, true, true);
		assertEquals(true, c.getExtraShot());
	}

	@Test
	void testGetExtraSyrup() {
		Coffee a = new Coffee("regular Coffee", Size.SMALL, false, false);
		assertEquals(false, a.getExtraSyrup());
		Coffee c = new Coffee("a bit of everything", Size.MEDIUM, true, true);
		assertEquals(true, c.getExtraSyrup());
	}

	@Test
	void testGetSize() {
		Coffee b = new Coffee("large Coffee", Size.LARGE, false, false);
		assertEquals(Size.LARGE, b.getSize());
		Coffee c = new Coffee("a bit of everything", Size.MEDIUM, true, true);
		assertEquals(Size.MEDIUM, c.getSize());
	}

	@Test
	void testGetType() {
		Coffee a = new Coffee("regular Coffee", Size.SMALL, false, false);
		assertEquals(Type.COFFEE, a.getType());
	}

}

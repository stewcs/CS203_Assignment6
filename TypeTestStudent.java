import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for the Type Enum
 * 
 * @author Daniel Xu
 * @version 12/11/2022
 *
 */

class TypeTestStudent {

	@BeforeEach
	void setUp() throws Exception {
		Type t1 = Type.COFFEE;
		Type t2 = Type.SMOOTHIE;
		Type t3 = Type.ALCOHOL;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Type t1 = Type.COFFEE;
		assertEquals(Type.COFFEE, t1);
		Type t2 = Type.SMOOTHIE;
		assertEquals(Type.SMOOTHIE, t2);
		Type t3 = Type.ALCOHOL;
		assertEquals(Type.ALCOHOL, t3);
	}

}

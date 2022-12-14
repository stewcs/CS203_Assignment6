import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for the Size Enum
 * 
 * @author Daniel Xu
 * @version 12/11/2022
 *
 */

class SizeTestStudent {

	@BeforeEach
	void setUp() throws Exception {
		Size s1 = Size.SMALL;
		Size s2 = Size.MEDIUM;
		Size s3 = Size.LARGE;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Size s1 = Size.SMALL;
		assertEquals(Size.SMALL, s1);
		Size s2 = Size.MEDIUM;
		assertEquals(Size.MEDIUM, s2);
		Size s3 = Size.LARGE;
		assertEquals(Size.LARGE, s3);
	}

}

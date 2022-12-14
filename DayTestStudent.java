import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * JUnit Test Case for the Day Enum
 * 
 * @author Daniel Xu
 * @version 12/11/2022
 *
 */


class DayTestStudent {

	@BeforeEach
	void setUp() throws Exception {
		Day lastDay = Day.FRIDAY;
		Day middle = Day.WEDNESDAY;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Day lastDay = Day.FRIDAY;
		assertEquals(Day.FRIDAY, lastDay);
		Day middle = Day.WEDNESDAY;
		assertEquals(Day.WEDNESDAY, middle);
	}

}

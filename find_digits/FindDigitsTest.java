package find_digits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindDigitsTest {

	@Test
	void findDigitsTest01() 
	{
		int results = FindDigits.findDigits(12);
		assertEquals(2,results);
	}
	@Test
	void findDigitsTest02() 
	{
		int results = FindDigits.findDigits(1012);
		assertEquals(3,results);
	}

}

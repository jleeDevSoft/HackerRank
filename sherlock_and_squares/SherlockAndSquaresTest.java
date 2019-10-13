package sherlock_and_squares;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SherlockAndSquaresTest {

	@Test
	void squaresV2Test01() 
	{
		int results = SherlockAndSquares.squaresV2(3,9);
		assertEquals(2,results);
	}
	@Test
	void squaresV2Test02() 
	{
		int results = SherlockAndSquares.squaresV2(17,24);
		assertEquals(0,results);
	}
	@Test
	void squaresV2Test03() 
	{
		int results = SherlockAndSquares.squaresV2(4,12);
		assertEquals(2,results);
	}

}

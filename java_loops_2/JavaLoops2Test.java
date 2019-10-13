package java_loops_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class JavaLoops2Test {

	@Test
	void javaLoops2TestCase01() 
	{
		int [] actual = new int[]{2,6,14,30,62,126,254,510,1022,2046};
		int []result = new int[10];
		JavaLoops2 jl = new JavaLoops2();
		result = jl.javaLoops2(0,2,10);
		assertArrayEquals(actual,result);
	}
	@Test
	void javaLoops2TestCase02() 
	{
		int [] actual = new int[]{8,14,26,50,98};
		int []result = new int[5];
		JavaLoops2 jl = new JavaLoops2();
		result = jl.javaLoops2(5,3,5);
		assertArrayEquals(actual,result);
	}

} 

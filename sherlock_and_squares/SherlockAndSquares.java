package sherlock_and_squares;

public class SherlockAndSquares 
{
	
	// in squaresV1, we are taking the square root of every number in the range of int a to int b
	// if int a = 1 and int b = 10,000. We have to loop 10,000 times.
	public static int squaresV1(int a, int b)
	{
		int totalSquares = 0;
		double squaredNum;
		for(int i=a; i<=b; i++)
		{
			squaredNum = Math.sqrt(i);
			if((squaredNum - (int)squaredNum) == 0)
			{
				totalSquares++;
			}
		}
		return totalSquares;
	}
	// in squaresV2, we are looking at the range of of the square root of int a to square root of int b
	// if int a = 1 and int b = 10,000. The range will be 1 to 100, so loop 100 times.
	// we can loop through and find the count the number of whole numbers in the range of square roots.
	// but we can see that a pattern occurs where the total = (int)sqrtB-(int)sqrtA
	// see logic for more info.......
	public static int squaresV2(int a, int b)
	{
	        double sqrtA = Math.sqrt(a);
	        double sqrtB = Math.sqrt(b);
	        
	        int total = (int)sqrtB - (int)sqrtA;
	        if(sqrtA - (int)sqrtA == 0)
	        {
	        	total++;
	        }
	        return total;
		
	}
	public static void main(String[] args)
	{
		// manual tests...
		
	}
}

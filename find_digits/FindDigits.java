package find_digits;

public class FindDigits 
{
	public static int findDigits(int num)
	{
		// convert num to string
		String strNum = String.valueOf(num);
		int totalDigits = 0;
		
		int currentNum;
		for(int i=0; i<strNum.length(); i++)
		{
			// convert current char to int, 
			//if int == 0 or number is not evenly divisible by the int, do nothing and move on
			currentNum = Character.getNumericValue(strNum.charAt(i));
			if(currentNum == 0 || num%currentNum != 0)
			{
				continue;
			}
			// increment totalDigits counter by 1 if number is evenly divisible by the current int.
			else
			{
				totalDigits++;
			}
		}
		return totalDigits;
	}
}

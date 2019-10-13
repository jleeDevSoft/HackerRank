package java_loops_2;

public class JavaLoops2 
{
	public int[] javaLoops2(int a, int b, int n)
	{
		int total = 0;
		int []values = new int[n];
		for(int i=0; i<n; i++)
		{
			if(i == 0)
			{
				total = a+((int)Math.pow(2, i)*b);
				values[i] = total;
			}
			else
			{
				total = total+((int)Math.pow(2, i)*b);
				values[i] = total;
			}
		}
		return values;
	}
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4};
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
}

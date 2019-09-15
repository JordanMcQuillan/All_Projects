
public class SumOddRange {  
	
	public static void main(String[] args) {
		 int test = sumOdd(3,30);//this class takes 2 numbers
		 System.out.print(+test);
	 }

	public static boolean isOdd (int number)
	{
		if( number <=0)
		{
			return false;
		}
		else if (number % 2 == 0) //checks if number is even
		{
			return false;
		}
		else
		{
			return true; //returns odd
		}
	}
	
	public static int sumOdd (int start, int end)
	{	
		int sum = 0;
		if (end >= start && start > 0 && end > 0)
		{
		for (int i = start; i<=end; i++ ) // loop through start and end number
		{
			if (isOdd(i)) //if odd
			{
				sum += i; //add all of the odd numbers in the loop together
				
			}
		}
		return sum;
		}
		else
		{
			return -1;
		}
			
	}
}

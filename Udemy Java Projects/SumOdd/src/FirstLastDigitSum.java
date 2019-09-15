
public class FirstLastDigitSum {
	
	public static void main(String[] args) {
		 int test = sumFirstAndLastDigit(9);//this class takes 2 numbers
		 System.out.print(+test);
	 }
	
	public static int sumFirstAndLastDigit(int number)
	
	{
		if(number >= 0 && number >=10)
		{
		int lastdigit = number % 10; //divides the number by 10 and provides the remainder, the remainder is the last number
		int firstdigit = number; //sets first digit to the complete number
		while (firstdigit >= 10) { //a 2 digit number will always be greater than 10
		    firstdigit /= 10;//divide by 10 to get the actual first digit
		}
		return firstdigit + lastdigit; //add the two together
		}	
		else
		{
			return -1; //minus numbers
		}
		
		
		
	}

}

package frequently_asked;

public class NumberOfEvenAndOdd 
{

	public static void main(String[] args)
	{
		int num=123456;
		int even=0;
		int odd=0;
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			if(rem%2==0)
 			{
				even++;
			}
			else{
			
				odd++;
			}  
			
		}
		
		System.out.println("Number of even : " + even);
		System.out.println("Number of odd :  " + odd);

	}

}

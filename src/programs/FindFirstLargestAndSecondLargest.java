 package programs;

public class FindFirstLargestAndSecondLargest
{
	public static void main(String[] args)
	{
		int[] inputArray={34,67,98,900,600,4};
		int firstLargestNum=0;
		int secondLargestNum=0;
		for (int i = 0; i < inputArray.length; i++)
		{
			if(firstLargestNum<inputArray[i])
			{
				
				secondLargestNum=firstLargestNum;
				firstLargestNum=inputArray[i];
			}
			else if (secondLargestNum<inputArray[i])
			{
				secondLargestNum=inputArray[i];
			}
			
		}
		System.out.println("First Largest is " + firstLargestNum + "\n" + "Second Largest is " +  secondLargestNum );
	}
	

}

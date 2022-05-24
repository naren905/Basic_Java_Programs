 package frequently_asked;

public class SecondHighestNum 
{
 
	public static void main(String[] args) 
	{
		int [] array={2,4,6,8,10,12,10,14,18};
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				secondLargest=largest;
				largest=array[i];
			}
			else if(array[i]>secondLargest)
			{
				secondLargest=array[i];
			}
		}
		System.out.println(secondLargest);
		

	}

}

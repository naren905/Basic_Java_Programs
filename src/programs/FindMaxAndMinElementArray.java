  package programs;

public class FindMaxAndMinElementArray
{
	public static void main(String[] args)
	{
		int[] inputArray={2,7,54,67,25,89,567,900};
		int maxNumber=inputArray[0];
		int minNumber=inputArray[0];
		for (int i = 0; i < inputArray.length; i++)
		{
			if(maxNumber<inputArray[i])
			{
				maxNumber=inputArray[i];
			}else if(minNumber>inputArray[i])
			{
				minNumber=inputArray[i];
			}
		}
		System.out.println("Max Number "+ maxNumber + "  min Number  " + minNumber );
		}
	}

	

	

 
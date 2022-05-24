 package programs;

public class FindCommonElementFrom2Arrays
{
	public static void main(String[] args)
	{
		int[] array1={1,54,76,90,65,45,34};
		int[] array2={1,23,76,11,90,41,65,43};
		for (int i = 0; i < array1.length; i++)
		{
		for (int j = 0; j < array2.length; j++)
		{
			if(array1[i]==array2[j])
			{
				System.out.println(array1[i]);
			}
		}	
		}
		
	}

}

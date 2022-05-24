package programs;

public class NumberSeries1
{
	public static void main(String[] args)
	{
		int row=4;
		int count=1;
		for (int i = 1; i <= row; i++)
		{
			for(int j=1;j<=count;j++)
			{
				System.out.print(i);
			}
			count++;
			System.out.println();
		}
	}

}

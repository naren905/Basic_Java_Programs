package narendra_practice_programes;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		int prime = sc.nextInt();
		//int prime=7;
		
		for (int i = 0; i < prime; i++) 
		{
			
			int count=0;
			for (int j = 1; j <=i; j++)  
			{
				
				if (i%j==0)
				{ 
					 count++;
				}
			}		
			if (count==2) 
			{
				System.out.println( i +" is a prime number");
			}			
		}
	}
}

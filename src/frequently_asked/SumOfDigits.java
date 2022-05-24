 package frequently_asked;

import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		
		//Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		int num=1234;
		int sum=0;
		
		while(num>0)
		{
		    int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum of digits is : " + sum);
	}

}

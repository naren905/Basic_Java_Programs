package practice_2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//int prime = sc.nextInt();
		
		int prime=7;
		int count=0;
		for(int i=1;i<=prime;i++)
		{
			if(prime%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(prime + " is a prime number");
		}
		else
			System.out.println(prime + " is not a prime number");

	}

}

package frequently_asked;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}

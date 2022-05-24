package narendra_practice_programes;

import java.util.Scanner;

public class NumberPolindrome 
{

	public static void main(String[] args) 
	{
		
		method2();
		//method1();

	}
	
	public static void method1()
	{
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		
		String str=String.valueOf(a);
		String sb=new StringBuffer(str).reverse().toString();
		int b=Integer.valueOf(sb);
		
		if (a==b) 
		{
			System.out.println(a+" is a polindrome");
		}else 
		{
			System.out.println(a+" is not a polindrome");
		}
	}
	public static void method2() 
	{
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		
		int temp=a;
		int b=0;
		
		while (temp>0) 
		{
			
			int rem = temp%10;
			b=b*10+rem;
			temp=temp/10;			
		}
		if (a==b) 
		{
			System.out.println(a+" is a polindrome");
		}else 
		{
			System.out.println(a+" is not a polindrome");
		}
		
	}

}

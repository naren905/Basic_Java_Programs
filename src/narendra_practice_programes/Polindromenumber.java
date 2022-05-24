package narendra_practice_programes;

import java.util.Scanner;

public class Polindromenumber {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		int a=123321;
		int temp=a;
		int b=0;
		while(temp>0)
		{
			int rem=temp%10;
			b=b*10+rem;
			temp=temp/10;
		}
		if(a==b)
		{
			System.out.println(a + "  is a polindrome");
		}
		else
		{
			System.out.println(a +"is not a polindrome");
		}
		
		
	}

}

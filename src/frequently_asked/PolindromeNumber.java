package frequently_asked;

import java.util.Scanner;

public class PolindromeNumber {
    
	public static void main(String[] args){
		
		//Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
				
		int num=123321;
		int rev=0;
		int temp=num;
		
		while(num>0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		//System.out.println(rev);
		if(temp==rev)
		{
			System.out.println(rev +"  is a polindrome");
		}
		else{
			System.out.println(rev +"  is not a polindrome");
		}
	}
}

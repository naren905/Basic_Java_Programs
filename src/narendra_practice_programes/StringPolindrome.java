package narendra_practice_programes;

import java.util.Scanner;

public class StringPolindrome
{

	public static void main(String[] args) 
	{
		
		/*Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();*/
		
		String str="malayalam";
		String sb=new StringBuffer(str).reverse().toString();
		
		if (sb.equals(str))
		{
			System.out.println(str+" : is a polindrome");
			
		}else 
		{
			System.out.println(str+" : is not a polindrome");
		}

	}

}

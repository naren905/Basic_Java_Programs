package practice_2;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//int num=12345;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}

	
	System.out.println("Number of digits in a number is " + count);

}
}
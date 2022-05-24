package interview2;

import java.util.Scanner;

public class Euro {

	public static void main(String[] args) {

		
    // int num=2;
    //int range=10;
	    Scanner sc= new Scanner(System.in);
	    int num=sc.nextInt();
	    int range=sc.nextInt();
	    int i=1;
	 

	while(i<=range)
	{
		System.out.println(num+"*"+i+"="+num*i);

	     i++;
	}
}
 
}



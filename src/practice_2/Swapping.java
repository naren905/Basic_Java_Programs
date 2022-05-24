package practice_2;

public class Swapping {

	public static void main(String[] args) {
		
		// swapping of two numbers by using third variable
		
		int a=10;
		int b=20;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		// swapping three variables
		
		int x=10;
		int y=20;
		int z=30;
		
		y=x+y-(x=y);
		z=y+z-(y=z);
		System.out.println("After swapping : "+x +"  "+y+"  "+z);

	}

}

package frequently_asked;

public class Swapping_of_two_num
{
   public static void main(String[] args) 
   {
			 int a=10;
			 int b=20;
			 int c;
			 
			 c=a; // c is 10
			 a=b; // a is 20
			 b=c; // b is 10
			 
			 System.out.println("After swapping value of a is :" + a);
			 
			 System.out.println("After swapping value of b is :" + b);
			 
			 int x =10;
			 int y =20;
			 int z = 30;
			 y = x+y-(x=y); // 30-20=10
			 z = y+z-(y=z);
			 System.out.println("After swapping :"+ x + " " + y +" " + z );
			 
			}

	}



package practice_2;

public class PolindromeNumber {

	public static void main(String[] args) {
		
		int num=123321;
		int rev=0;
		int temp=num;
		while(num>0)
		{
			rev =rev*10+num%10;
			num=num/10;
		}
		//System.out.println(rev);      reversing the number
		if(temp==rev){
			System.out.println(rev + "  is a polindrome");
		}
		else
			System.out.println(rev + " is not a polindrome");

	}

}

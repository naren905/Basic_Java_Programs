package practice_2;

public class NumberOfEven_Odd {

	public static void main(String[] args) {
		int num=12345678;
		int even=0;
		int odd=0;
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			if(rem%2==0)
			{
				even++;
			}else
				odd++;
			
		}
		System.out.println(even);
		System.out.println(odd);

	}

}

package frequently_asked;

public class Armstrong {

	public static void main(String[] args) 
	{
		int arm=153;
		int temp=arm;
		int r,sum=0;
		while(arm>0)
		{
			r=arm%10;
			sum=sum + r*r*r;
			arm=arm/10;
			
		}
		if(temp==sum)
		{
			System.out.println(sum +"  its a Armstrong Number");
		}
		else
		{
			System.out.println(sum +"  its  not a Armstrong Number");
		}

	}

}

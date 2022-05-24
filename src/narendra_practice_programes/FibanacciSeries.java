package narendra_practice_programes;


public class FibanacciSeries
{
	public static void main(String[] args) 
	{
		
		int[] a=new int[10];
		a[0]=0;
		a[1]=1; 
		
		for (int i = 2; i < a.length; i++)
		{
			
			a[i]=a[i-2]+a[i-1];
//			a[2]=a[0]+a[1]; ===>1
//			a[3]=a[1]+a[2]; ===>2
		}
		
		for (int i : a)
		{
			System.out.println( i );
		}
		
		
		/*int i=1,j=1,k=0;
		System.out.println(i  + " " + j);
		while(k<=50)
		{	
			k=i+j;
			//System.out.println( i + j);
			System.out.print(k + " ");
			i=j;
			j=k;
		}*/
		
		
		
	}

}

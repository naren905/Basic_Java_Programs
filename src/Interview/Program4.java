package Interview;

public class Program4 {
	public static void main(String[] args)
	{
		int [] arr={1,5,7,-1,5};
	    for(int i=1;i<arr.length;i++)
	    {
	        int a=arr[i-1]+arr[i];

			if(a==6)
			{
			   System.out.println(arr[i-1]+" , "+arr[i]);
			}
	    }

	 }

}
 
package Interview;

public class Reverse_of_sentence 
{
	
	public static void main(String[] args)
	{
		String str="my name is narendra";
		String [] a=str.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
}       }
}

//output= narendra is name my 
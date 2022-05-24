package programs;

import java.util.Arrays;

public class SortStringArrayAlpha 
{

	public static void main(String[] args) 
	{
		String [] array={"star","van","tong","win","animal","cat"};
		
		//System.out.println("Insorted array is " + Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println("Sorted array is " + Arrays.toString(array));
	}

}

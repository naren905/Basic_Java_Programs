package narendra_practice_programes;

import java.util.Arrays;

public class SecondHighest 
{
	public static void main(String[] args) 
	{
		int [] array={34,77,45,88,99,100};
		
		Arrays.sort(array);
		
		System.out.println(array[array.length-2]);
		}
	}



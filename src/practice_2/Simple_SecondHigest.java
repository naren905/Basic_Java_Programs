package practice_2;

import java.util.Arrays;

public class Simple_SecondHigest {

	public static void main(String[] args) {
		
		int [] array={2,4,8,10,15,28};
		Arrays.sort(array);
		System.out.println(array[array.length-2]);

	}

}

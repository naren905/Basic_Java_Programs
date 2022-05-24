package youtube;

import java.util.Random;

public class Generating_Random_Num_String {

	public static void main(String[] args) {
		
		
		// Approach 1
		
		Random rand = new Random();
		int ran_int = rand.nextInt(100);
		System.out.println(ran_int);
		
		// Approach 2
		
		System.out.println(Math.random());
		
		// Approch 3 By using Apochai common poi
		
		//RandomStringUtils.randomNumeric(5);
		
		//RandomStringUtils.randomAlphabetic(5);
		
		
		

	}

}

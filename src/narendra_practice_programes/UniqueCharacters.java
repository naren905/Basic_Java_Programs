package narendra_practice_programes;

import java.util.ArrayList;

import java.util.LinkedHashSet;

public class UniqueCharacters {

	public static void main(String[] args) {
		
		String str="gsgffggggugagagggaag";
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		for (int i = 0; i < str.length(); i++)
		{
			
			lhs.add(str.charAt(i));
			
		}
		
		System.out.println(lhs);
	}
 
}

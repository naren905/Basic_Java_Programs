package narendra_practice_programes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacters 
{

	public static void main(String[] args) 
	{
		
	String str="hhhrrrttuuyythk";	
	LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character,Integer>();
	
		for (int i = 0; i < str.length(); i++)
		{
			
			if(hm.containsKey(str.charAt(i)))
			{
				int count=hm.get(str.charAt(i));
				hm.put(str.charAt(i), ++count );
							
			}else 
			{
				hm.put(str.charAt(i), 1);
			 }
			
		}
		System.out.println(hm);
		
		for (Map.Entry<Character, Integer> map : hm.entrySet()) 
		{
			
			if (map.getValue()>1)
			{
				System.out.print(map.getKey());
			}
			
		}
}
}
	
		
		

	



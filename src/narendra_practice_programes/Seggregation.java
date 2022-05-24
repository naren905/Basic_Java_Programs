 package narendra_practice_programes;

 public class Seggregation
{
	public static void main(String[] args)
	{
		String str="asGbHafrMK2fd6j7q@9$v%";
		String lower="";
		String upper="";
		String numbers="";
		String specials="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if('a'<=ch && 'z'>=ch)
			{
			    lower=lower+String.valueOf(ch);
			}
			else if('A'<=ch && 'Z'>=ch)
			{
				upper=upper+String.valueOf(ch);
			}
			else if('0'<=ch && '9'>=ch)
			{
				numbers=numbers+String.valueOf(ch);
			}
			else
			{
				specials=specials+String.valueOf(ch);
			}
		}
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(numbers);
		System.out.println(specials);
		
		
	}			
}

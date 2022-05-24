package practice_2;

public class Seggregation {

	public static void main(String[] args) {
		
		String st="abcDEf346@#u&";
		String lower="";
		String upper="";
		String numb="";
		String spec="";
		
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			
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
				numb=numb+String.valueOf(ch);
			}
			else
				spec=spec+String.valueOf(ch);
			 
		}
		System.out.println("lower = " + lower);
		System.out.println("upper = " +upper);
		System.out.println("number = " +numb);
		System.out.println("special = " +spec);

	}

}

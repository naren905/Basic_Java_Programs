package youtube;

public class CountOfWords_InaString {

	public static void main(String[] args) {
	
		String s="java is a object oriented programming language";
		
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words : " + count);

	}

}

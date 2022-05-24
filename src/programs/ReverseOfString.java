package programs;


public class ReverseOfString 
{
	public static void main(String[] args) 
	{
		String original="ramayana";
		String reverse="";
		for(int i = original.length()-1; i>=0; i--) 
		{
			char c = original.charAt(i);
			reverse=reverse+c;
		}
		System.out.println("Reverse of String is   " +reverse );           //  anayamar
		
		/*char [] c= original.toCharArray();
		for(int i= c.length-1;i>=0;i--)
		{
			System.out.print( c[i]);
		
		}*/
	}

	
}

package programs;

public class Occurrence_of_character {
	public static void main(String[] args) {
		String s="mahabharata";
		for(char c='a';c<='z';c++)
		{    
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				char c1 = s.charAt(i);
				if(c==c1)
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(  c +" present " + count + "times ");
			}
		} 
		

	}

}

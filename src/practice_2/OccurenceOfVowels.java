package practice_2;

public class OccurenceOfVowels {

	public static void main(String[] args) {
		
		String s="Automobile";
		s=s.toLowerCase();
		String defvowels="aeiou";
		
		for(int i=0;i<defvowels.length();i++)
		{
			 int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(defvowels.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(defvowels.charAt(i)+" comes "+ count+" times ");
			}
		}

	}

}

package narendra_practice_programes;

public class OccuVowels {

	public static void main(String[] args) {
		String s="Automobile";
		s=s.toLowerCase();
		String defvow="aeiou";
		for(int i=0;i<defvow.length();i++)
		{       
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(defvow.charAt(i)==s.charAt(j))
				{
					count++;
				}
					
		    }
			if(count>0)
			{
				System.out.println(defvow.charAt(i) + " comes " + count + " times ");
			}
		}

	}

}

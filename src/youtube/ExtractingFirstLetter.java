package youtube;

public class ExtractingFirstLetter {

	public static void main(String[] args) {
		
		String st="Learn with sandeep krishna";
		String [] word=st.split(" ");
		for(int i=0;i<word.length;i++)
		{
			String s = word[i];
			System.out.print(s.charAt(0)+" ");
		}

	}

}

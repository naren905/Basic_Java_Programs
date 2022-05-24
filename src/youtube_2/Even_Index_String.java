package youtube_2;

public class Even_Index_String {

	public static void main(String[] args) {

		String str="bhaskarreddy";
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.print(ch[i]+" ");
			}
		}
	}

}

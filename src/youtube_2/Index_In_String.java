package youtube_2;

public class Index_In_String {

	public static void main(String[] args) {

		String str="bhaskarreddy";
		int index=0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='k')
			{
				index=i;
			}
		}
		System.out.println("Index : "+ index);
	}

}

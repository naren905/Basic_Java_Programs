package frequently_asked;

public class ReverseOnlyTwo {

	public static void main(String[] args) {
		String st="hi how are you";
		String[] word=st.split(" ");
		StringBuffer sb=new StringBuffer();
		String rev="";
		for(int i=0;i<word[0].length();i++)
		{
			//StringBuffer sb=new StringBuffer();
			sb.append(word[i]).reverse();
			rev=rev+sb.toString()+" ";
			sb.setLength(0);
			
		}
		System.out.println(rev+" "+word[2]+" "+ word[3]);

	}

}

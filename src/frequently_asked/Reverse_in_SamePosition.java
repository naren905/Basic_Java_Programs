package frequently_asked;

public class Reverse_in_SamePosition 
{

	public static void main(String[] args)
	{
		String st="welcome to java";
		String[] word=st.split(" ");
		String reverse="";
		for(String s:word)
		{                                                  
			StringBuilder sb=new StringBuilder(s);             //StringBuffer sb=new StringBuffer(w);
			   sb.reverse();
			  reverse=reverse+sb.toString()+ " ";
		}
		System.out.println(reverse);
		

	}

}

                  // output   =     emocleW oT avaj 
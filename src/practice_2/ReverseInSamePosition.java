package practice_2;

public class ReverseInSamePosition {

	public static void main(String[] args) {
		
		String st="welcome to java";
		String[] word = st.split(" ");
		String reverse="";
		for(String s:word)
		{
			StringBuffer sb=new StringBuffer(s).reverse();
			//sb.reverse();
			reverse=reverse+sb.toString()+" ";
		}
		System.out.println(reverse);

	}

}
                                            // emoclew ot avaj 
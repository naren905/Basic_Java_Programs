package practice_2;

public class String_Polindrome {

	public static void main(String[] args) {
		
		String str="malayalam";
		String sb=new StringBuffer(str).reverse().toString();
		if(sb.equals(str))
		{
			System.out.println(str + " : is a string polindrome");
		}
		else
			System.out.println(str + " : is not a string polindrome");

	}

}

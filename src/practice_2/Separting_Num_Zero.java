package practice_2;

public class Separting_Num_Zero {

	public static void main(String[] args) {
		
		String st="123400005673000";
		String num="";
		String zero="";
		
		for(char ch :st.toCharArray())
		{
			if(ch=='0')
			{
				zero=zero+ch;
			}
			else
				num=num+ch;
			  
		}
		System.out.println(num+zero);

	}

}

package Interview;

public class Program5 {

	public static void main(String[] args) {
		String str="12340005600000789";
		String zero="";
		String num="";
		
		for(char ch :str.toCharArray())
		{
			if(ch=='0')
			{
				zero=zero+ch;
				
			}
			else
			{
			
				num=num+ch;
			}
			
		} 
		System.out.println(num+zero);
		
	}

}

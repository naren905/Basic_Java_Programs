  package Interview;

public class New {

	public static void main(String[] args) {

		 
		 
		   String str="AABBCCDDEAAAABB";
		   str=str.toLowerCase();
		   for(char c='a';c<='z';c++)
		   {
		          int count=0;
		    for(int i=0;i<str.length();i++)
		    {
		         char c1 = str.charAt(i);

		          if(c==c1)
		           {
		              count++;
		           }

		   }if(count>0)
		    {
		          System.out.println(c +  " = " + count);
		    }

		  }

		 }


		

	}



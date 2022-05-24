 package Interview;

public class Program3 {
	 public static void main(String[] args)
	 {
	 String s1 = new String ("Test ABC");
	 String s2 = new String("Test ABC");
	 
	 System.out.println(s1==s2); //false

	 String s3= "Test ABC";
	 System.out.println(s1==s3); //false

	 String s4 = "Test ABC";
	 System.out.println(s3==s4); //true

	 String s5 = "Test " + "ABC"; 
	 
	 System.out.println(s3==s5); //true
	 String s6 = "Test ";
	 String s7= s6+"ABC";
	 
	 System.out.println(s3==s7); //false
	 final String s8 = "Test ";
	 String s9 = s8+"ABC";
	 
	 System.out.println(s3==s9); //true
	 System.out.println(s6==s8); //true
	 }
	 }



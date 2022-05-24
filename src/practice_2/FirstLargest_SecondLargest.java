package practice_2;

public class FirstLargest_SecondLargest {

	public static void main(String[] args) {

     int [] array={2,6,8,10,20,40};
     int firlarg=0;
     int seclarg=0;
     for(int i=0;i<array.length;i++)
     {
    	 if(firlarg<array[i])
    	 {
    		 seclarg=firlarg;
    		 firlarg=array[i];
    	 }
    	 else if(seclarg<array[i])
    	 {
    		 seclarg=array[i];
    	 }
     }
     System.out.println("first largest is : "+ firlarg + "\nsecond largest is : "+seclarg);

	}

}

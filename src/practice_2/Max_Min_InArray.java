package practice_2;

public class Max_Min_InArray {

	public static void main(String[] args) {
		
		int [] array={2,4,8,10,15,20};
		int max=array[0];
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(max<array[i])
			{
				max=array[i];
				
			}
			else if(min>array[i])
			
				min=array[i];
			   
			
		}
		System.out.println(" maximum number is : "+max+ " minimum number is : "+min);

	}

}

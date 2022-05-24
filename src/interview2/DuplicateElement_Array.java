package interview2;

public class DuplicateElement_Array {

	public static void main(String[] args) {
		
		int[] array ={2,3,4,5,2,6,4};
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[j]);
				}
			}
		}
		

	}

}

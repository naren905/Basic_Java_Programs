package practice_2;

public class CommonElementsFromArrays {

	public static void main(String[] args) {
		
		int [] array1={2,4,6,8,10,12,14};
		int [] array2={1,3,7,9,4,11,6,12};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.println(array1[i]);
				}
			}
		}

	}

}

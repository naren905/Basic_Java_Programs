package youtube;
import java.util.HashSet;
import java.util.Set;

public class Eliminate_Duplicate {

	public static void main(String[] args) {
	
		int [] array={2,3,6,8,3,6,2,2,5,6};
		
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<array.length;i++)
		{
			set.add(array[i]);
			
		}
		System.out.println(set);
		

	}                                                  

}

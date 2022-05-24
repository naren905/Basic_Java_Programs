package practice_2;

public class Second_Higest {

	public static void main(String[] args) {
		
		int [] array={2,6,8,10,20,40,80};
		int larg=0;
		int seclarg=0;
		for(int i=0;i<array.length;i++)
		{ 
			if(array[i]>larg)
			{
				seclarg=larg;
				larg=array[i];
				
			}
			else if(array[i]>seclarg)
			{
				seclarg=array[i];
			}
		}
//		System.out.println(larg);
		System.out.println(seclarg);

	}

}

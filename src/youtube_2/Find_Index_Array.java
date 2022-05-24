package youtube_2;

public class Find_Index_Array {

	public static void main(String[] args) {
		
		String [] col={"green","yellow","white","blue"};
		 
		int index=0;
		for(int i=0;i<col.length;i++)
		{
			if(col[i]=="white")
			{
				index=i;
			}
		}
		System.out.println("Index : "+index);

	}

}

public class Array
{
	public static void main(String [] args)
	{
		int array[] = {1,2,3,4,5,6,7,8};
		/*for(int i = 0; i > array.length; i = 2*i+1)
		{
			System.out.println(array[i]);
		}
	
		*/
		int i = 0;
		while(i >= array.length)
		{
			System.out.println(array[i]);
			i = 2*i+1;
			System.out.println(i);
	
		
		
		
		}
	
	}


}
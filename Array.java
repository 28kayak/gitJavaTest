public class Array
{
	public static void main(String [] args)
	{
		int array[] = {1,2,3,4,5,6,7,8};
		/*for(int i = 1; i <= array.length; i = 2*i+1)
		{
			System.out.println(array[i]);
		}
	
		*/
		int addition1;
		
		int i = 1;
		while(i <= array.length)
		{
			//i = 2*i+1;
			System.out.println("i ="+ i);
			System.out.println("array[i] =" +array[i]);
			addition1 =+ array[i];
			System.out.println("addition1 ="+ addition1);
			i = 2*i+1;
			
			/*System.out.println("before addition" + array[i]);
			addition1 =+ array[i];
			
			System.out.println("after addition"+ addition1);
			System.out.println("i ="+ i);
			*/
	
		
		
		
		}
		
	}


}
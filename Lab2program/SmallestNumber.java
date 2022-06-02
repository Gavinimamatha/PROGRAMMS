package Lab2program;

public class SmallestNumber {
	
	
	public static int getSecondSmallest(int arr[])
	{
		
			
			
			int smallest=Integer.MAX_VALUE;
			int secondSmallest=Integer.MAX_VALUE;
			
		//{1,2,3,4,5}
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]<smallest)
			{
				
				smallest=arr[i];
			}
			if(arr[i]>smallest && arr[i]< secondSmallest)
			{
				
				secondSmallest=arr[i];
			}
		}
		return secondSmallest;
		
	}
	public static void main(String[]  args) {
		{
			
			int arr[]= {1,2,3,4,5};
			
			//method call
			int result=getSecondSmallest(arr);
			System.out.println("Second smallest number"+ result);
			
		}
				

	}

}

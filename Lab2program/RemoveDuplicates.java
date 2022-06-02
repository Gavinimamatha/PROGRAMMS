package Lab2program;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3, 4,4,5};
		int len=arr.length;
		//int temp[]=new int[arr.length];
		int j=0;
		
		for(int i=0;i<len-1;i++)
		{
			
			if(arr[i]!=arr[i+1])
			{
				 arr[j++]=arr[i];//1,2,3,4,5
			}
		}
		arr[j+1]=arr[len-1];
		
		for(int k=0;k<j;k++)
		{
			
			System.out.println(arr[k]);
		}
		

	}

}

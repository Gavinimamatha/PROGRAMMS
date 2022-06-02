package Lab2program;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int[] array1=new int[] {2,3,4,5};
		System.out.println("The original array is");
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
			
		}
		System.out.println();
		System.out.println("reverse array is");
		 for(int i=array1.length-1;i>=0;i--)
		 {
			 System.out.println(array1[i]+" ");
		 }

	}

}

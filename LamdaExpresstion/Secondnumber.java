package LamdaExpresstion;

import java.util.Arrays;
@FunctionalInterface
interface Intf4{
	void Second(int [] a);
}

public class Secondnumber {

	public static void main(String[] args) {
		
		
		// Find Second highest number in a given array
		
		int[] arr = { 11,29,31,45,5};
		
		Intf4 intf4=(int [] a)  ->{
			Arrays.sort(arr);
			System.out.println("Second highest number in a given array :"+ arr[arr.length-2]);
			
		};
		
		intf4.Second(arr);

	}

}

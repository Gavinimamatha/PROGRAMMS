package lab1_programs;
import java .util.Scanner;

public class SumOfNCubes {

	public static int SumOfNo(int n) {
		int X = (n*(n+1)/2);
		return X*X;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a total numbers")	;
		int n = scan.nextInt();
		System.out.println(SumOfNo(n));
		
	}
	
	
}	
		
		
		
		
		
		
		

	



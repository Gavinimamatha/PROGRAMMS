package lab1_programs;
import java.util.Scanner;

public class DiffBetweenSumOFSquares {
	static int sum=0;
	static int square_sum = 0;
	public static int calculateDifference(int n) {
		for(int i=0; i<n; ++i) {
			sum = sum+i;
			square_sum = square_sum+i*i;
			
		}
		return square_sum-sum*sum;
	}
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = Scan.nextInt();
		System.out.println(calculateDifference(n));
	}
	
		
}		
		

	
		

	
	



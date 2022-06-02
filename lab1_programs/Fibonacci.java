package lab1_programs;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c;
		
		while (true) {
			c=a+b;
			if(c<=100)
				System.out.println(c);
			else
				break;
			a=b;
			b=c;
			
			
			
		}

	}

}

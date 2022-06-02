package LamdaExpresstion;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeException {

	public static void main(String[] args) throws IOException  {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the employeesalary");
		int salary = s.nextInt();
		
		try {
			if (salary>3000)
				System.out.println("valid");
			else
				throw new Exception();
		}catch(Exception a) {
			System.out.println(a);
		}
		}
		

	}


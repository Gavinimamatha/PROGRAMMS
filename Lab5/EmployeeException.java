package Lab5;

import java.util.Scanner;

public class EmployeeException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the employeesalary");
		int salary = s.nextInt();
		
		try {
			if(salary<3000)
				System.out.println("Invalid");
			else
				System.out.println("valid");
		}catch(Exception a) {
			System.out.println(a);
		}

	}

}

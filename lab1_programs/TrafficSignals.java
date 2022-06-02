package lab1_programs;

import java.util.Scanner;

public class TrafficSignals {
	

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("1. Red\n2. Yellow\n3. Green");
				int colour = sca.nextInt();
		String message = "";
		switch(colour) {
	    case 1:
		  message = "Stop";
		  break;
				  
		case 2:
	      message = "Ready";
	       break;
				 
		case 3:
		  message = "Go";
		  break;
		  
		default:
		 message = "Invalid Inout";
		  break;
		}
		System.out.println(message);
				
	}
		

}

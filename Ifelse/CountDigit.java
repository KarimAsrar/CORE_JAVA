package Ifelse;

import java.util.Scanner;

public class CountDigit {
	public static void main(String []arg) {
		Scanner sc = new Scanner (System.in);
			int  n = sc.nextInt();
			
		      int dig = 0;
		      while(n != 0) {
		    	n=n/10;
		    	dig++;
		 
		    }
		
		System.out.println("Here is your digit counting " + dig);
		
	}
}

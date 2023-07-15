package functions;

import java.util.Scanner;

public class Factorials {
	
	//Finf the factorial of n Number
	public static void printFactorial(int n) {
		
		int factorial = 1;
		//loop chlaenge
		
		if(n<0) {
			System.out.println("Invalid number");
			return;
		}
		for(int i=n; i>=1;i--) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
		return;
	 }
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	printFactorial(n);
  }
}

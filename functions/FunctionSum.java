package functions;

import java.util.Scanner;

//make a function to add 2 numbers and return the sum 

public class FunctionSum {

	public static int calculateSum(int a,int b) {
		int sum = a + b;
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = calculateSum(a,b);//call kiya function ko main method ke andar
		System.out.println(sum);
	}
}

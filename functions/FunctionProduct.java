package functions;

import java.util.Scanner;

public class FunctionProduct {
	
	public static int calculateProduct(int a,int b) {
		
		return a*b;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	calculateProduct(a,b);

	System.out.println("product of 2 Number : "+calculateProduct(a, b) );
  }
}

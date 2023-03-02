package Scanner;

import java.util.Scanner;

public class Double {
public static void main(String[] args) {
 double a,b,c;
 Scanner sc = new Scanner(System.in);
	System.out.println("NEW NUMBER");
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();
	
	System.out.println("addition of three even number;"+(a+b+c));
	System.out.println("multiplication of three even  number;"+(a*b*c));
	System.out.println("subtraction of three even number;"+(a-b-c));
	System.out.println("division of three even number;"+(a/b/c));
	
 
}
}

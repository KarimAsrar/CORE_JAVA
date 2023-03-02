package Scanner;

import java.util.Scanner;

public class Float {
public static void main(String[] args) {
	float a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("NEW NUMBER");
	a = sc.nextFloat();
	b = sc.nextFloat();
	c = sc.nextFloat();
	
	System.out.println("addition of three even number;"+(a+b+c));
	System.out.println("multiplication of three even  number;"+(a*b*c));
	System.out.println("subtraction of three even number;"+(a-b-c));
	System.out.println("division of three even number;"+(a/b/c));
	
	
}
}

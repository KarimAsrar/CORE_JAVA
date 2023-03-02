package Scanner;

import java.util.Scanner;

public class Arthematics {
public static void main(String[] args) {
	int a,b;
	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER NEW NUMBER");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("addition of two odd ;"+ (a+b));
	System.out.println("subtraction of two odd ;"+ (a-b));
	System.out.println("multiplication of two odd ;"+ (a*b));
	System.out.println("division of two number;" + (a/b));
}
}

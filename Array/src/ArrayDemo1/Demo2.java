package ArrayDemo1;
import java.util.Scanner;
public class Demo2 {
public static void main(String[] args) {
	int size,i;
	Scanner r = new Scanner(System.in);
	System.out.println("ENTER THE SIZE OF ARRAY");
	size = r.nextInt();
	int a[] = new int[size];
	
	for( i=0; i<size; i++)
	{
		a[i] = r.nextInt(); 
	}
		System.out.println("PRINTED ARRAY ELEMENTS");
		for(i=0; i<size; i++)
		{
			System.out.println(a[i]+" " );
		}
	
}
}

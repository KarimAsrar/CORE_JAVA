package Ifelse;

import java.util.Scanner;

public class InputfromUser {
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		 int n =Integer.parseInt( sc.nextLine());
		 String name = sc.nextLine();
		 {
		 System.out.println("Hello " + name + " your counting is here");
		 }
		 for (int i=1; i<=n; i++) {
		 System.out.println(i);
		 }
		 
		 }
	
}
package Inputfromuser;

import java.util.Scanner;

public class TableOfNumbers {

	public static void main(String[] args) {
	
	//print the Table of a Number input by user	
		
	 System.out.println("Enter the Number for Table");	
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<11; i++) {
	
			System.out.println(n*i);
		}
	}
}

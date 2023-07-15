package aRRAY;

import java.util.Scanner;

public class Array3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();//size input
	int num[] = new int[size];
	
	//for input of integer
	for(int i = 0; i<size;i++) {
		 num[i]= sc.nextInt();
		
	}
	//for output
	for(int i = 0;i<size;i++) {
	System.out.println(num[i]);	
	}
}
}

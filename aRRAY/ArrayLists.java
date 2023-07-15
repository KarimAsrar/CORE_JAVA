package aRRAY;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[]args) {
		
		ArrayList <Integer> list = new ArrayList <>(); 
		
		//add elements
		list.add(0);
		list.add(2);
		list.add(3);
		list.add(6);
		
		System.out.println(list);
		
		//get elements
		int element = list.get(1);
		System.out.println(element);
		
		//to add element in between
		list.add(2, 10);
		System.out.println(list);
		
		//set element ---means have to change the number in place of that!!!!!! 
		list.set(1,1);
		System.out.println(list);
		
		//delete elements
		list.remove(3);
		System.out.println(list);
		
		//size
		int size = list.size();
		System.out.println(size);
		
		//loop
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		    System.out.println();
		
		 //sorting
		 Collections.sort(list);
		 System.out.println(list);   
		    
	}
}

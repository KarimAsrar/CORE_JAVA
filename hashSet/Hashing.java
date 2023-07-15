package hashSet;

import java.util.HashSet;

public class Hashing {

	public static void main(String args[]) {
		//creating
		HashSet <Integer> set = new HashSet<>();
		
		//Inserting
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		
		//size
		System.out.println("size of set is :" + set.size());
		
		//search - contains
		if(set.contains(2)) {
			System.out.println("set contain 1 :");
		}
		if(!set.contains(5)) {
			System.out.println("does not contain");
		}
		//Delete
		set.remove(1);
		if(!set.contains(1)) {
			System.out.println("does not contain 1 - we deleted 1:");
		}
	}
}

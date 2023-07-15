package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashing {

	private static final boolean Integer = false;

	public static void main(String[] args) {
		
		HashMap <String , Integer> map = new HashMap<>();
		//inserting
		map.put("India", 13456);
		map.put("china", 23456);
		map.put("America", 1234);
		map.put("Austrelia", 8976);
		
		System.out.println(map +"  ");
		
		//can also update the value
		map.put("china", 98765);
		System.out.println(map +" ");
		
		//Search --value is present in our List or not-----
//		if(map.containsKey("Nepal")) {
//			System.out.println("key is present in the map");
//		}else {
//			System.out.println("key is not present in the map");
//		}
//		
//		System.out.println(map.get("china"));//key exist
//		System.out.println(map.get("Indonesia"));//key does'nt exist
//		
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
			
		
	}
}








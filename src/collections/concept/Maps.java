package collections.concept;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	public static void main(String[] args) {
		
		 Map<String, Integer> map = new HashMap<String, Integer>();

	        map.put("Alice", 98);
	        map.put("Bob", 99);
	        map.put("Charlie", 85);
	        map.put("David", 90);
	        map.put("Eve", 88);
	        map.put("Frank", 92);
	        map.put("Grace", 95);
	        map.put("Hannah", 87);
	        map.put("Ivy", 93);
	        map.put("Jack", 91);
	        
	        System.out.println("Original Map:");
	        System.out.println(map);
	        
	        Map<String, Integer> newmap = new HashMap<String, Integer>();
	        newmap.put("Kate", 89);
	        newmap.put("Leo", 97);
	        
	        map.putAll(newmap);
	        
		 for(Map.Entry<String, Integer> entry : map.entrySet()) {
			 System.out.println(entry.getKey()+": "+entry.getValue());
		 }
		 
		 System.out.println(map.containsKey("Leo"));
		 System.out.println(map.containsValue(97));
		 
		 System.out.println(map.size());
		  
		 System.out.println(map.getClass());
		 
		 map.clear();
		 }
}

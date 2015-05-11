import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class myMaps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		System.out.println("Hashmap.. the order may not be maintained");
		testMap(hashMap); 
		
		
		System.out.println("linkedHashMap.. maintains the order you gave");
		testMap(linkedHashMap); 
		
		System.out.println("TreeList.. sorts the values based on keys");
		testMap(treeMap); 

	}

	public static void testMap(Map<Integer, String> map){
	
		map.put(1, "a");
		map.put(10, "k");
		map.put(8, "o");
		map.put(20, "q");
		map.put(6, "c");
		map.put(0, "z");
		
		for(Integer key: map.keySet()){
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}
}

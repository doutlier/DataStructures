import java.util.HashMap;
import java.util.Map;


public class myMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		// this overwrites the previous value
		map.put(2, "another two");
		
		String text = map.get(2);
		System.out.println(text);
		
		for(Map.Entry<Integer,String> entry:map.entrySet()){
		
			int key = entry.getKey();
			String value = entry.getValue();
			// hashmap doesn't maintain any order
			System.out.println(key+":"+ value);
			
		}
	}

}

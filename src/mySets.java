import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class mySets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = new HashSet<String>();
		
		//	Set<String> set1 = new LinkedHashSet<String>();
		
		//	Set<String> set1 = new TreeSet<String>();
		if(set1.isEmpty()){
			
			System.out.println("its empty before");
		}
		set1.add("e");
		set1.add("b");
		set1.add("c");
		set1.add("d");
		set1.add("a");
		//adding duplicate item - hashset doesnt take duplicate items unlike
		//lists and maps
		set1.add("a");

		if(set1.isEmpty()){
			
			System.out.println("its empty after");
		}
		// Hash set doesn't retain order but linkedhashset remembers the order you added
		System.out.println(set1);
		/*
		for(String element: set1){
			System.out.println(element);
		}*/
		
		// no need to iterate the elements unlike lists you can directly use contains method
		// to search for an item
		/*if(set1.contains("z")){
			
			System.out.println("contains a");
		}*/
		
		// Intersection - join
		Set<String> set2 = new HashSet<String>();

		set2.add("e");
		set2.add("b");
		set2.add("c");
		set2.add("k");
		set2.add("z");
		
		Set<String> intersection = new HashSet<>(set1);
		System.out.println(intersection);
		
		intersection.retainAll(set2);
		System.out.println(intersection);

		
		// difference - left outer join
		
		Set<String> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
		
	}

}

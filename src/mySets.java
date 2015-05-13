import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class mySets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<String> set1 = new HashSet<String>();
		
//	Set<String> set1 = new LinkedHashSet<String>();
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("e");
		set1.add("b");
		set1.add("c");
		set1.add("d");
		set1.add("a");
		//adding duplicate item - hashset doesnt take duplicate items unlike
		//lists and maps
		set1.add("a");

		// Hash set doesnt retain order but linkedhashset remembers the order you added
		System.out.println(set1);
		
		for(String element: set1){
			System.out.println(element);
		}
		
		
	}

}

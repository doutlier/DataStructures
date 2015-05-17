import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DS {
	

	public static void main(String[] args) {
		
		
		String[] something = {"a","b","c","d","e"};
		
		List<String> list1 = new ArrayList<String>();
		
		for(String x: something){
			//adding an element
			list1.add(x);
		}
		
		

		String[] somethingElse = {"x","a"};
		List<String> list2 = new ArrayList<String>();
		for(String y:somethingElse){
			
			list2.add(y);
		}
		
	
		
	//	for(int i=0; i<list1.size();i++){
			
	//		System.out.println(list1.get(i));
	//	}
		
		editlist(list1, list2);
		printList(list1);
		
		
	}
	
	private static void printList(List<String> list){
		
		for(String x: list){
			
			System.out.println(x);
		}
		
	}

	private static void editlist(List<String> list1, List<String> list2) {
		// TODO Auto-generated method stub
		
		Iterator<String> it = list1.iterator();
		
		while(it.hasNext()){
			
			if(list2.contains(it.next()))
			{
				it.remove();
				
			}
		}
		
	}
	
	

}

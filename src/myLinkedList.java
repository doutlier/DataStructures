import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class myLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		/*
		 * LinkedLists contains the elements where each element has
		 * reference to the previous and next element
		 * [0]>[1]>[2]>[3]
		 *    <   <   <
		 * */
			
		doTimings("ArrayList",arrayList);
		doTimings("LinkedList",linkedList);
			
		}
	// linkedlist and arraylist implements list interface
	
	private static void doTimings(String type, List<Integer> list){

		for(int i=0; i< 1E5; i++ ){
			list.add(i);
		}

		long start = System.currentTimeMillis();
		
		// add items at the end of list
		
		/*
		for(int i=0; i<1E5; i++){
			
			list.add(i);
		}*/
		
		// add items in between list
		
		for(int i=0; i<1E5; i++){
			
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: "+ (end-start)+" ms for " + type);
	}

}

import java.util.ArrayList;


public class myArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers.get(0));
		
		for(Integer x: numbers){
			
			System.out.println(x);
		}
		
		numbers.remove(0);
		numbers.remove(numbers.size()-1);
		
		System.out.println("second iteration...");

		for(int i=0; i< numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
		
		
		}
		
		
		
	}

}

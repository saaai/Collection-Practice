import java.util.*;

public class SizeArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//Printing the initial size of the array
		System.out.println("Initial Size: "  + al.size());
		
		//adding elements to the array
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println("The elements in the list are: " + al);
		
		System.out.println("Size after entering the elements: " + al.size());
		
		//removing few elements
		al.remove(1);
		al.remove(2);
		System.out.println("Size after removing few elements: " + al.size());
		
		System.out.println("Final ArrayList: ");
		for(int num: al)
		{
			System.out.println(num);
		}
		
	}

}

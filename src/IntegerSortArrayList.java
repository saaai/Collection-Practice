//Sorting integer array list

import java.util.*;

public class IntegerSortArrayList {

	public static void main (String[] args)
	{
		//Initializing ArrayList with data type integer
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//adding elements to the arraylist
		al.add(0);
		al.add(2);
		al.add(7);
		al.add(3);
		al.add(1);
		al.add(4);
		al.add(5);
		
		//array list before sorting
		System.out.println("Before Sorting: ");
		for(int counter : al)
		{
			System.out.println(counter);
		}
		
		
		//sorting arraylist with collections
		Collections.sort(al);
		
		System.out.println("After Sorting: ");
		for(int counter : al) {
			System.out.println(counter);
		}

	}
	
}

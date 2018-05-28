//sorting string arraylist

import java.util.*;

public class StringSortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initializing arraylist
		ArrayList<String> listofcountries = new ArrayList<String>();
		
		//adding countries  
		listofcountries.add("India");
		listofcountries.add("US");
		listofcountries.add("China");
		listofcountries.add("Denmark");
		listofcountries.add("Argentina");
		listofcountries.add("Bangladesh");
		
		//to print unsorted list
		System.out.println("Before Sorting: ");
		for( String counter: listofcountries) {
			System.out.println(counter);
		}
		
		//sorting list 
		Collections.sort(listofcountries);
		
		//printing sorted list
		System.out.println("After Sorting: ");
		for(String counter: listofcountries) {
			System.out.println(counter);
		}
		
	}

}

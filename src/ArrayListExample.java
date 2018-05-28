import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creation of array list: Since, we are going to add string type elements so we are making it of string type.
		
		ArrayList<String> name = new ArrayList<String>();
		
		// This is how elements hsould be added to the array list 
		name.add("Sai");
		name.add("Vasudha");
		name.add("Pavan");
		name.add("Dinesh");
		name.add("Sindhu");
		name.add("Sowmya");
		name.add("Nikki");
		
		//Display the above added nameects
		System.out.println("The nameects Currently in the array list \n " + name );
		
		// Adding elements to the array list at a given index
		name.add(0, "Gopal");
		name.add( 1, "Doppalapudi");
		name.add(2,"Chennupati");
		
		System.out.println("Current Arraylist after adding elements using index \n " + name  );
		
		//Remove elements from the array list
		name.remove("Nikki");
		name.remove("Sowmya");
		
		//printing current arraylist
		System.out.println("Current Arraylist after removing elements \n " + name);

		//Remove elements from the arraylist using index
		name.remove(3);
		name.remove(2);
		
		//printing elements after removing using index
		System.out.println("Current Arraylist after removing using index \n " + name );
		
		
		//using set index for updating the element
		name.set(0, "Gopal Sai");
		
		//printing after updating the elements
		System.out.println("After updating \n " + name);
		
		//to get the index position of the element
		int pos = name.indexOf("Gopal Sai");
		int Pos = name.indexOf("Sindhu");
		
		//printing out the index position of the element
		System.out.println("Index position of the element Gopal Sai \n " +  pos);
		System.out.println("Index position of the element Sindhu \n " +  Pos);

		//getting nameect using index position
		String str = name.get( 1 );
		
		//printing element using nameect index
		System.out.println("Printing element using get method at the index \n " + str);
		
		//To check the number of elements in the array list
		int NumberOfItems = name.size();
		
		//printing the size of arraylist
		System.out.println("The size of the current array list \n " + NumberOfItems );
		
		//To check if the element is present in the array list or not
		boolean bo = name.contains("Gopal");
		boolean boo = name.contains("Sindhu");
		
		//printing the elements are present or not
		System.out.println("The elements of Gopal is \n " + bo);
		System.out.println("The elements of Sindhu is \n " + boo );
		
		//Clearing array list using clear()
		name.clear();
		
		//Printing array list after clearing the array list
		System.out.println("The array list is cleared using the clear() \n " + name );
		
		
		//adding element into arraylist
		name.add("Sindhu");
		
		//Printing after adding the element into arraylist
		System.out.println("The objects Currently in the array list \n " + name );
		
	
		
	}

}

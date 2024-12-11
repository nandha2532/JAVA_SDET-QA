package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration
		
		ArrayList al = new ArrayList();
		List al1 = new ArrayList();
		
		//To Store homogeneous data
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		//Add data to arrayList
		
		al.add(10.5);
		al.add(10);
		al.add("Welcome");
		al.add('a');
		al.add(null);
		al.add(10);
		al.add(null);
		
		//Size of array
		System.out.println(al.size());
		
		//Print ArrayList
		
		System.out.println("Print Arraylist : "+al);
		
		//Remove an element or object
		al.remove(5); //5 is index
		
		System.out.println("Print Arraylist after removal : "+al);
		
		//Insert an element in between two elements
		al.add(2, "Hello"); 
		System.out.println("Print Arraylist after insertion : "+al);
		
		//Modify element in the ArrayList (Modify/replace/change)
		al.set(2, "Hello WOrld");
		System.out.println("Print Arraylist after modification : "+al);
		
		//extract or access specific element
		System.out.println(al.get(3)); 	//3 is index
		
		//read all the elements in ArrayList
		
		//using for loop
		System.out.println("using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//using enhanced for loop or for each Loop
		System.out.println("using enhanced for loop or for each Loop");
		for(Object x: al) {
			System.out.println(x);
		}
		
		//Using Iterator
		System.out.println("Using Iterator");
		Iterator<Object> it = al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Checking Array List isempty
		System.out.println("Is arrayList Empty : "+al.isEmpty());
		
		//Remove multiple element from the ArrayList
		
		ArrayList li = new ArrayList();
		li.add(10.5);
		li.add("Welcome");
		
		al.removeAll(li);
		
		System.out.println("Arralist After removing multiple elements : "+al);
		
		//Remove All the elements from the ArrayList
		al.clear();
		System.out.println("Is arrayList Empty : "+al.isEmpty());
		
		
		
		
		
	}

}

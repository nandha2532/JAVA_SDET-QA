package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet myset= new HashSet();
		Set set1 = new HashSet();
		
		HashSet<String> myset1= new HashSet<String>(); //HOmogeneous data	
		HashSet<Integer> myset2= new HashSet<Integer>(); //Primitive Data
		
		myset.add(100);
		myset.add("Hello");
		myset.add(null);
		myset.add(100);
		myset.add(10.5);
		myset.add(null);
		
		//Size of HashSet
		
		System.out.println(myset.size());
		
		//Insertion not maintained
		//duplicates not allowed
		
		System.out.println(myset);
		
		//remove specific element form set
		myset.remove(10.5);	//10.5 is value whereas in ArrayList we use index to remove value
		System.out.println("After removing : "+myset);
		
		//insert element --> not possible in HashSet( since no index and order not preserved)
		
		//Access specific element --> not possible
		
		//COvert HashSet --> ArrayList
		
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//Read all element using for..each
		System.out.println("using for..each");
		for(Object x:myset) {
			
			System.out.println(x);
		}
		
		//Read all element using iterator
		System.out.println("using iterator");
		Iterator it = myset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//remove multiple elements --> not possible
		
		//remove all elements from Set
		
		myset.clear();
		
		System.out.println("Set is empty : "+myset.isEmpty());
		

	}

}

package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration
		
		HashMap map = new HashMap();
		Map m1 = new HashMap();
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "Jhon");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Jhon");
		hm.put(105, "Scott");
		hm.put(101, "David");
		
		System.out.println(hm);
		
		
		//Size
		System.out.println(hm.size());
		
		//Remove key value pair
		hm.remove(103);		//103 is key
		
		System.out.println("After removing key : "+hm);
		
		//access value of specific key
		
		System.out.println(hm.get(101));
		
		//Get all the key from HashMap
		System.out.println(hm.keySet());
		
		//Get all the values from Hashmap
		System.out.println(hm.values());
		
		//Get all the key value pair
		System.out.println(hm.entrySet());
		
		//Read data from HashMap
		System.out.println("Using for..each");
		for(int k:hm.keySet()) {
			System.out.println(k+"    "+hm.get(k));
		}
		
		//Using iterator
		Iterator<Entry<Integer, String>>  it = hm.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Separate key and values");
		
		Iterator<Entry<Integer, String>>  it1 = hm.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<Integer, String> entry = it1.next();
			
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		
		//remove everything 
		
		hm.clear();
		
		System.out.println("HashMap is empty : "+hm.isEmpty());
		
	}

}

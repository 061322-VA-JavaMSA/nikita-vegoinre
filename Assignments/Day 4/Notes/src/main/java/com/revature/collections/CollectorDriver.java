package com.revature.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectorDriver {

	public static void main(String[] args) {
		// 

		int intArr = {1, 2, 3}; //fixed sized array
		
	System.out.println(intArr[2]);
	
	//Create an ArrayList 
	List<Integer> al = new ArrayList<>();
	al.add(1);
	al.add(3);
	al.add(2);
	
	//operators for "returning" a value can be added here
		
	for(Integer i:al) {
		System.out.println(i);
	}
	
	System.out.println();
	
	//here is a common solution for iterating through our list
	Iterator<Integer> i = al.iterator();
	
	//next method will check to see whether or not
	//there is another element in the collection
	//next() returns the element
	
	while(i.hasNext()) {
		System.out.println(j.next());
		
		//Set to pull data into your arraylist
		
		System.out.println();
		
		Queue<Integer> 11 = new LinkedList<>();
		11.add(1);
		11.add(2);
		11.add(3);
		
		System.out.println(11.peek());
		System.out.println(11.poll());
		System.out.println(11.poll());
		
		//set up a map or dictionary
		
		Map<integer, String> hm =new HashMap<>
		hm.put(1, "Hello");
		hm.put(2, "Hello");
		hm.put(null, (World);
		
		// retreve the set (keys) which can be used to iterate
		//Set<String> hs - new HashSet<>
		
		for(Integer k : hm.keySet()) {
			System.out.println(hm.get.(k));
		}
		
	}
	}
	

}

package com.udemy.javamasterclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapUsage {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(2);
		numbers.add(8);
		numbers.add(4);
		numbers.add(18);
		numbers.add(2);
		numbers.add(4);
		numbers.add(2);
		
		for (int i = 0; i<numbers.size(); i++) {
			Set set = hmap.entrySet();
			Iterator it = set.iterator();
			
			boolean newNumber = true; //Knowing whether a number is new to the list or not.
			while(it.hasNext()) {
				Map.Entry mapEntry = (Map.Entry)it.next();
				
				if(Integer.valueOf(mapEntry.getKey().toString()) == numbers.get(i)) {
					hmap.put(numbers.get(i), Integer.valueOf(mapEntry.getValue().toString()) +1);
					newNumber = false;
					break;
				}
			}
			
			if(newNumber) {
				hmap.put(numbers.get(i), 1);
			}
			
		}
		
		
		//Convert HashMap to TreeMap. It will be sorted in natural order
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(hmap);
		Set set = treeMap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) it.next();
			System.out.println("Number: " + mapEntry.getKey() + " - Occurences: " + mapEntry.getValue());
		}
		

	}

}

package com.xyz.projectname.modulename.functionalityname;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollections {
	
	// List, Set, HashTable and HashMap
	
	public static void main(String[] args) {
		//list_collection();
		//set_collection();
		//hashTable_collection();
		hashMap_collection();
		
		
	}
	
	public static void fifth_collection() {
		System.out.println("");
	}
	
	public static void list_collection() {
		
		// List is a collection of records
		// List can have duplicate records
		// List will accept null records as well
		
		List<String> list = new ArrayList<>();
		
		List<Integer> list1 = new ArrayList<>();
		
		list.add("adding values in a list");
		list.add("BYMAT Automation");
		list.add("Pallav");
		list.add("Shrikant");
		list.add("DadaSaheb");
		list.add("Pallav");
		list.add("Shrikant");
		list.add("DadaSaheb");
		list.add(null);
		list.add(null);
		
		list1.add(10);
		
		System.out.println("My list Menbers are: " +list);
		
		for(int i=0; i<list.size(); i++) {
			
			System.out.println("Values in my list at position_"+i+" is:" +list.get(i));
		}
		
		// Advance for loop
		
		//for(DataType_of_list variable : list_name)
		System.out.println("#### getting value for Advance for loop ####");
		for(String a_f_list :list ) {
			
			System.out.println(a_f_list);
		}
		
		
	}

	public static void set_collection() {
		
		// Set is the collection of Unique records
		// Set is accepting null records
		// Set is a collection of Asychronized 
		
		Set<String> set = new HashSet<>();
		
		set.add("adding values in a Set");
		set.add("BYMAT Automation");
		
		set.add("Pallav");
		set.add("Shrikant");
		set.add("DadaSaheb");
		
		set.add("Pallav");
		set.add("Shrikant");
		set.add("DadaSaheb");
		
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
	Iterator<String> itr  = set.iterator();
	
	while(itr.hasNext()) {	
		System.out.println(itr.next());
	}
	
	}
	
	public static void hashTable_collection() {
		
		// HashTable is a collection of Key and Value pairs
		// Key Duplicate  // Over riding the duplicate value
		// Value Duplicate // By default it will be a new entry
		// Both Duplicate // Over riding the duplicate value
		// Hashtable won't accept null key & null value/record
		
		Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("Training", "Selenium");
		ht.put("Name", "BYMAT");
		ht.put("City", "PUNE"); // Dynamic coming from Excel file
		ht.put("Staudent1", "Pallav");
		ht.put("Staudent1", "Rahul");  // Key Duplicate  // Over riding the duplicate value
		
		ht.put("Staudent2", "Srikant");
		
		ht.put("Staudent3", "DadaSaheb");
		ht.put("Staudent3", "Srikant");   // Both Duplicate // Over riding the duplicate value
		
		ht.put("Staudent4", "DadaSaheb"); // Value Duplicate // By default it will be a new entry
		
		// ht.put(null, "sdfsdsdf"); // IMP Interview Question
		
		// ht.put("Road", null);
		
		ht.put("BlankValues", "");
		
		//ht.put("C, "PUNE");
		//ht.put("City", "PUNE");
		
		System.out.println("My HastTable vavlues are: " +ht);
		
		System.out.println(ht.get("City"));
		System.out.println(ht.get("Training"));
		System.out.println(ht.get("Name"));
		System.out.println(ht.get("Staudent2"));
		System.out.println(ht.get("Staudent3"));
		System.out.println(ht.get("Staudent1"));
		System.out.println(ht.get("null"));
		System.out.println(ht.get("Road"));
		System.out.println(ht.get("BlankValues"));
		
}

	
	public static void hashMap_collection() {

		
		// HashMap is a collection of Key and Value pairs
		// Key Duplicate  // Over riding the duplicate value
		// Value Duplicate // By default it will be a new entry
		// Both Duplicate // Over riding the duplicate value
		// Map or HashMap is accepting null key & null value or record
		
		Map<String, String> map  = new HashMap<>();
		
		map.put("Training", "Selenium");
		map.put("Name", "BYMAT");
		map.put("City", "PUNE");
		map.put("Staudent1", "Pallav");
		map.put("Staudent1", "Rahul");      // Key Duplicate  // Over riding the duplicate value
		
		map.put("Staudent2", "Srikant");
		
		map.put("Staudent3", "DadaSaheb");
		map.put("Staudent3", "Srikant");   // Both Duplicate // Over riding the duplicate value
		
		map.put("Staudent4", "DadaSaheb"); // Value Duplicate // By default it will be a new entry
		
		map.put(null, "sdfsdsdf"); // IMP Interview Question
		
		map.put(null, "646464"); // IMP Interview Question
		
		map.put("Road", null);
		
		map.put("BlankValues", "");
		
		//ht.put("C, "PUNE");
		//ht.put("City", "PUNE");
		
		System.out.println("My HastTable vavlues are: " +map);
		
		System.out.println(map.get("City"));
		System.out.println(map.get("Training"));
		System.out.println(map.get("Name"));
		System.out.println(map.get("Staudent2"));
		System.out.println(map.get("Staudent3"));
		System.out.println(map.get("Staudent1"));
		System.out.println(map.get("null"));
		System.out.println(map.get("Road"));
		System.out.println(map.get("BlankValues"));
		
}
}

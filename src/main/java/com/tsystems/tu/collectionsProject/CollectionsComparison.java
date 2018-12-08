/**
 * package with examples used in the T-University
 */
package com.tsystems.tu.collectionsProject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author disern
 *
 */
public class CollectionsComparison {

	@SuppressWarnings("unused")
	private static void testLinkedList() { 
		System.out.println("Test a LinkedList storing Strings");
		Collection<String> s = new LinkedList<String>(); 
		s.add("hola");
		s.add("adios");
		s.add("hola");
		Iterator<String> it = s.iterator(); 
		while (it.hasNext()) {
			String value = (String) it.next(); 
			System.out.println(value);
		}
	}

	@SuppressWarnings("unused")
	private static void testMap() { 
		System.out.println("Test a Map with the pair (String, Integer) ");
		Map<String,Integer> m = new HashMap<String,Integer>(); 
		m.put("hola", 1);
		m.put("adios", 2);
		m.put("hola", 3);
		Iterator<String> it = m.keySet().iterator(); 
		while (it.hasNext()) {
			String key = (String) it.next(); 
			Integer value = (Integer) m.get(key); 
			System.out.println(key + ": " + value);
		}
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testLinkedList();
		testMap();
	}

}

/**
 * 
 */
package collectionsProject;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author disern
 *
 */
public class TestTime {

	public static void testTimeSpent() {
		
		int numElements = 1000000;
		
		final Set<Integer> hashSet = new HashSet<Integer>(numElements);
		final Long startHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
		    hashSet.add(i);
		}
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));
		 
		final Set<Integer> treeSet = new TreeSet<Integer>();
		final Long startTreeSetTime = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
		    treeSet.add(i);
		}
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));
		 
		final Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(numElements);
		final Long startLinkedHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
		    linkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testTimeSpent();

	}

}

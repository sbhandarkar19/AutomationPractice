package javaCollection;
// 3] Set ==> a) HashSet class

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPract1 {

	public static void main(String[] args) {
		HashSet set = new HashSet();       // normal object. default initial capacity (16) & load factor (0.75)
		
		Set set1 = new HashSet();          // up-casting object. default initial capacity (16) & load factor (0.75)
		
		Set<Integer> setOfIntegers = new HashSet<Integer>();  // generic object. default initial capacity (16) & load factor (0.75)
		
//		load factor is a float number
		Set<Double> setOfDoubles = new HashSet<Double>(20, 0.90f);  // default initial capacity (20) & load factor (0.90)
		
//		hash, hashing, hashcode discuss this use setOfInteger.
		
		setOfIntegers.add(18);
		setOfIntegers.add(20);
		setOfIntegers.add(16);
		setOfIntegers.add(21);
		setOfIntegers.add(17);
		setOfIntegers.add(25);
		setOfIntegers.add(15);
		System.out.println(setOfIntegers.add(10));   // true
//		Imp --> If add a number 10 to the set, it return true or false line no 27
		
//		set does not allows duplicate values line no 31
		System.out.println(setOfIntegers.add(10));   // false
		
//		Will return true if the addition is successful. will return false if the addition is not successful.
		
		System.out.println(setOfIntegers);   // [16, 17, 18, 20, 21, 25, 10, 15]
		
//		iterator use in ArrayList, PriorityQueue, HashSet.
		
		System.out.println("*****print hashset data using iterator*****");
		Iterator<Integer> itr = setOfIntegers.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
//	    Collections class methods (.sorting, .shuffling) we cannot use with HashSet class.
		
	}
}

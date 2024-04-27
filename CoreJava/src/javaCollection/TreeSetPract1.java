package javaCollection;
//3] Set ==> b) TreeSet class
//  IMP ==> TreeSet data always shorting order [ascending order]

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPract1 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		set.add(124);
		set.add(271);
		set.add(15);
		
//		TreeSet accept only homogeneous data. i.e. whatever object is first added, we should add other object of same type.
//		set.add('A');
//		set.add(98.23);
//		set.add(true);
//		set.add("TreeSet");
		
		System.out.println(set);   // [15, 124, 271]
		
		Set<String> setStr = new TreeSet<String>();     // generic object create
		setStr.add("Pune");
		setStr.add("Mumbai");
		setStr.add("Delhi");
		System.out.println(setStr.add("Kolkata"));  // true
		System.out.println(setStr.add("Kolkata"));  // false - since TreeSet does not allow duplicate data
		System.out.println(setStr.add(null));       // NullPointerException
		
		System.out.println(setStr);  // [Delhi, Kolkata, Mumbai, Pune]
	}
}

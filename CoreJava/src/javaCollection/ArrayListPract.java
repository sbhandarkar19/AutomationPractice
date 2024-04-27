package javaCollection;
// Program ==> 1] ArrayList

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPract {

	public static void main(String[] args) {
//		ArrayList is the class that implements the List interface
//		ArrayList list = new ArrayList();  // new object is created with initial default capacity of 10
		
		List list = new ArrayList();   // Up-casting used creating the object 
		
//		A] How to added data in Arraylist
		
		list.add(123);    // 0 index
		list.add("Java"); // 1 index
		list.add('$');    // 2 index
		list.add(true);   // 3 index
		list.add(3.14);   // 4 index
		list.add(null);   // 5 index, list allows null & duplicate data
		
//		print the number of object added to the list
		int size = list.size();
		System.out.println("Number of objects added to list : " + size);   // [Number of objects added to list : 6]
		
//		how to print the list
//		1. using println()  2. using for loop  3. using for-each loop  4. using iterator
		
		System.out.println("*****print list data using println()*****");
//		1. using println()
		System.out.println(list);   // [123, Java, $, true, 3.14, null]
		
		list.add("Java");                // added duplicate data
		System.out.println(list);        // [123, Java, $, true, 3.14, null, Java]
		
		list.add(7, '@');                // On which data to add index.
		System.out.println(list);        // [123, Java, $, true, 3.14, null, Java, @]
		
		list.add(5, 999);                // In between to index
		System.out.println(list);        // [123, Java, $, true, 3.14, 999, null, Java, @]   //  shifting takes place
		
		System.out.println("*****print list data using for-loop*****");
//		2. using for-loop
		for (int i = 0; i <= list.size() - 1; i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
//		3. using for-each loop
		System.out.println("*****print list data using for-each loop*****");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
//		iterator use in ArrayList, PriorityQueue, HashSet.
//		4. using iterator
		System.out.println("*****print list data using iterator*****");
//		Iterator is an interface in java, which contains 3 method
//		hasNext() : return boolean true if data is present otherwise false
//		next()    : return the element present & move the pointer to next index
//		remove()  : remove the last returned element
		
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		once we used the iterator, we cannot use it again since it is now point to last element
//		so it is recommended to create new iterator reference
		
//		B] create another object of list
		List list1 = new ArrayList();
		list1.add("Pune");
		list1.add("Mumbai");
		list1.add("Chennai");
		list1.add('+');
		list1.add('-');
		System.out.println("Before adding : " + list1);      // Before adding : [Pune, Mumbai, Chennai, +, -]
		
//		all data covert [list1 to list] & [list to list1]
		list1.addAll(list);                                     // it will add all the objects of list in list1   [ add() method is overloaded method]
		System.out.println( "After adding : " + list1);       // After adding : [Pune, Mumbai, Chennai, +, -, [123, Java, $, true, 3.14, 999, null, Java, @]]
		
//		list1.addAll(index, list);                           // It will add all the data from list to list1
		
//		How to remove data from list
		list1.remove(2);                                      // It will remove object present at index 2 from list1 & [ Can be removed on the basis of index]
		System.out.println(list1);                            // [Pune, Mumbai, +, -, [123, Java, $, true, 3.14, 999, null, Java, @]]
		
		list1.remove((Character) '$');                        // it will remove '$' & [ can be removed on this basis of object]
		                                     // char is primitive data type, character is wrapper class. [ The character will have to be given an object of wrapper class then it will remove]
		System.out.println(list1);                           // [Pune, Mumbai, +, -, [123, Java, true, 3.14, 999, null, Java, @]]
		
		list1.removeAll(list);                               // it will remove the all list data
		System.out.println(list1);                           // [Pune, Mumbai, +, -]
		
//		C] create another object of list
		List list2 = new ArrayList();
		list2.add("Apple");
		list2.add("Orange");
	    list2.add("Mango");
	    
	    System.out.println("Before adding : " + list2);      // Before adding : [Apple, Orange, Mango]
	    
//	    all data covert [list1 to list2]
	    list2.addAll(list1);
	    System.out.println(list2);                           // [Apple, Orange, Mango, Pune, Mumbai, +, -]
	    
	    list2.retainAll(list1);                              // Which data from list2 is to be retained.
	    System.out.println(list2);                           // [Pune, Mumbai, +, -]
 
	}

}

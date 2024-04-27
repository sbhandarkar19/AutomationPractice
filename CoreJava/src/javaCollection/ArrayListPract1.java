package javaCollection;
//Program ==> 1] ArrayList [ remaining topic ]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPract1 {

	public static void main(String[] args) {
		List list = new ArrayList();
//		1] the above object is raw object --> we can add any type of object in this ArrayList
		list.add("Selenium");
		list.add(4.1);
		
//		consider we have to create an arraylist to store name,
//		here we need arraylist that should accept String
		
//		2] for above requirement we need to create generic object of arraylist, which will accept only String
		List<String> studentNameListStdV = new ArrayList<String>();
		studentNameListStdV.add("Rahul");
		studentNameListStdV.add("Amit");
		studentNameListStdV.add("Vinay");
		studentNameListStdV.add("Arush");
//		studentNameListStdV.add(151);
		
//		3] consider we have to create generic object of arraylist to store rollNum
		List<Integer> rollList = new ArrayList<Integer>();
		rollList.add(151);
//		rollList.add(88.45);
		
//		4] StdV object convert StdVI then create new object
		List<String> studentNameListStdVI = new ArrayList<String>(studentNameListStdV);
		System.out.println(studentNameListStdVI);
		
//		5] sorting & shuffling ==> In order to perform sorting or shuffling operation we can Collection class
//	    Collections class methods (.sorting, .shuffling) we can use with ArrayList class.
//		a] Collections class use ==>  .sort() method
		Collections.sort(studentNameListStdVI);
		System.out.println("Sorting : " + studentNameListStdVI);     // Sorting : [Amit, Arush, Rahul, Vinay]
		
//		b] Collections class use ==>  .shuffle() method   [ .shuffle always Randomly]
		Collections.shuffle(studentNameListStdVI);
		System.out.println("Shuffle : " + studentNameListStdVI);     // Shuffle : [Arush, Rahul, Vinay, Amit]
	}
}

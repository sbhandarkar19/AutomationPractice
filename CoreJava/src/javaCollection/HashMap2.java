package javaCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		Map<Integer, String> hMap = new HashMap<Integer, String>();  // generic object create
		
		hMap.put(1, "Java");
		hMap.put(2, "Python");
		hMap.put(3, "JavaScript");
		hMap.put(4, "C#");
		hMap.put(5, "Per1");
		hMap.put(6, "Ruby");
		
		System.out.println(hMap);         // {1=Java, 2=Python, 3=JavaScript, 4=C#, 5=Per1, 6=Ruby}
		
//		1] use .entrySet();method
		Set<Entry<Integer, String>> set = hMap.entrySet();
		System.out.println(set);          // [1=Java, 2=Python, 3=JavaScript, 4=C#, 5=Per1, 6=Ruby]
		
//		2] use .iterator().next();  one value/key gets print here then use method [ .getKey(); & .getValue();]
		Entry<Integer, String> firstEntry = set.iterator().next();                   // 1=Java
		System.out.println("Key for this entry is : " + firstEntry.getKey());        // Key for this entry is : 1
		System.out.println("Value for this entry is : " + firstEntry.getValue() );   // Value for this entry is : Java
		
//		3] print this map --> 1st way here
		for (Map.Entry<Integer, String> entry : hMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("*****#####*****");
		
//		2nd way print here
		Iterator<Entry<Integer, String>> itr = hMap.entrySet().iterator();
		
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}

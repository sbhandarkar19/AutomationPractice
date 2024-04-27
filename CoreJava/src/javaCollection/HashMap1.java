package javaCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Fruit {
	double weight;
	String color;
}

public class HashMap1 {

	public static void main(String[] args) {
		HashMap hMap = new HashMap();        // normal object --> Initial default capacity 16 & load factor 0.75
		
		Map map = new HashMap();             // up-casting --> Initial default capacity 16 & load factor 0.75
		
		Map map1 = new HashMap(32, 0.90f);   // Initial default capacity 32 & load factor 0.90
		
//		1] HashMap data add here then used [ .put(key, value);] method
		map.put("Java", "Selenium");
		map.put(1, 'A');
		map.put(true, 98.56f);
		map.put('a', 1500);
		map.put(2.5, false);
		
//		There is a different class, you will be able to take its object in it also.
		Fruit apple = new Fruit();
		
		map.put("Apple", apple);
		map.put(null, 'S');
		
		System.out.println(map);  // {null=S, Java=Selenium, 1=A, a=1500, Apple=javaCollection.Fruit@1c4af82c, 2.5=false, true=98.56}
		
		map.put(null, "Maven");
		System.out.println(map);  // {null=Maven, Java=Selenium, 1=A, a=1500, Apple=javaCollection.Fruit@1c4af82c, 2.5=false, true=98.56}
		
		map.put(11, null);        // duplicate null value allow here
		map.put(12, null);        // duplicate null value allow here
		System.out.println(map);  // {null=Maven, Java=Selenium, 1=A, a=1500, Apple=javaCollection.Fruit@1c4af82c, 2.5=false, 11=null, 12=null, true=98.56}
		
//		2] how to verify whether a specific key exits in the map [ .containsKey(); & .containsKey(); ]
		System.out.println("Does map contains 2.5 as key : " + map.containsKey(2.5));  // Does map contains 2.5 as key : true
		System.out.println("Does map contains 'A' as key : " + map.containsKey('A'));  // Does map contains 'A' as key : false
		
//		3]  how to verify whether a specific value exits in the map [ .containsValue(); & .containsValue(); ]
		System.out.println("Does map contains Maven as value : " + map.containsValue("Maven"));  // Does map contains Maven as value : true
		System.out.println("Does map contains 3.14 as value : " + map.containsValue(3.14));      // Does map contains 3.14 as value : false
		
//		4] how to get the number of data present in the map [ .size();]
		System.out.println("Number of data present in the map : " + map.size());  // Number of data present in the map : 9
		
//		5] how to read the value for specific key [ .get();]
		System.out.println("Value for key = 1 is : " + map.get(1));              // Value for key = 1 is : A
		
//		6] how to check whether the map is empty or not [ .isEmpty();]
		System.out.println("Map is empty or not : " + map.isEmpty());  // Map is empty or not : false
		
//		7] how to remove specific data from the map [ .remove();]
		map.remove(11);
		System.out.println(map);   // {null=Maven, Java=Selenium, 1=A, a=1500, Apple=javaCollection.Fruit@1c4af82c, 2.5=false, 12=null, true=98.56}
		
//		8] how to get all the keys from the map [ .KeySet();]
		Set keys = map.keySet() ;                                // its return type is Set as it does not allow duplicate entries
		System.out.println("Keys present in the Map : " + keys); // Keys present in the Map : [null, Java, 1, a, Apple, 2.5, 12, true]
		
//		9] how to get all the values from the map
		Collection values = map.values();                        // its return type is Collection
		System.out.println("Values present in the Map : " + values);  // Values present in the Map : [Maven, Selenium, A, 1500, javaCollection.Fruit@1c4af82c, false, null, 98.56]
	}
}

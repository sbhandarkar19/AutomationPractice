package javaCollection;
// Program ==> 2] Priority Queue

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePract1 {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();         // 1] normal raw type object
		
		Queue queue1 = new PriorityQueue();                // 2] raw type up-casted object
		
//		The remaining objects should also be the same as the first object added to the queue.
		
//		1] queue1 add() method
		queue1.add("Java");     // queue1 in first object added then automatically generic. can not added another type object.
//		queue1.add(785);
//		queue1.add(true);
		queue1.add("Selenium");
		queue1.add("JavaScript");
		queue1.add("Python");
		
//		queue will allow to add only one type of data
		System.out.println(queue1);   // [Java, Python, JavaScript, Selenium] --> In case of queue head will be always a smaller object (Java).
		
//		3] Iterator use.
//		iterator use in ArrayList, PriorityQueue, HashSet.
		
		Iterator itr = queue1.iterator();
		
		System.out.println("*****Print queue elements using iterator*****");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		4] Collections class methods (.sorting, .shuffling) we cannot use with Queue.
		
//		2] queue1 remove() method
		queue1.remove("Java");
		
		System.out.println(queue1);  // [JavaScript, Python, Selenium]  --> remove
		
//		3] create generic queue2 of integer object 
//		queue2 added() method 
		
		Queue<Integer> queue2 = new PriorityQueue<Integer>();
		queue2.add(15);
		queue2.add(10);
		queue2.add(5);
		queue2.add(20);
		
		System.out.println(queue2);  //  [5, 15, 10, 20] --> In case of queue head will be always a smaller object (5).
		
//		queue2 remove() method
		
		queue2.remove(5);
		
		System.out.println(queue2);  // [10, 15, 20] --> remove
		
//		4] check this queue2 Size & Empty
		
		System.out.println("queue2 size : " + queue2.size());      // queue2 size : 3
		System.out.println("queue2 empty : " + queue2.isEmpty());  // queue2 empty : false
	}
}

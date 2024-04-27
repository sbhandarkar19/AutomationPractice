package javaCollection;
//Program ==> 2] Priority Queue

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePract2 {

//	IMP ==> PriorityQueue memory(Size) increase & decrease
	
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();      // generic object create
		Queue<String> queue1 = new PriorityQueue<String>();
		
//		PriorityQueue class object is dynamic in terms of memory(Size)
		
		System.out.println("Initial size of Queue : " + queue.size());   // Initial size of Queue : 0
		System.out.println("Queue is empty? : " + queue.isEmpty());      // Queue is empty? : true
		
		System.out.println("Initial size of Queue1 : " + queue1.size());   // Initial size of Queue : 0
		System.out.println("Queue1 is empty? : " + queue1.isEmpty());      // Queue is empty? : true
		
		queue1.add("Apple");
		queue1.add("Kiwi");
		queue1.add("Orange");
		
//		1] use .element() method  --> to get the head element
		String headElement = queue1.element();
		System.out.println("queue1 head : " + headElement);       // queue1 head : Apple
		
//		headElement = queue.element();
//		System.out.println("queue head : " + headElement);        // NoSuchElementException
		
//		2] use .peek() method --> to get the head element
		headElement = queue1.peek();
		System.out.println("queue1 head : " + headElement);       // queue1 head : Apple
		
		headElement = queue.peek();
		System.out.println("queue head : " + headElement);        // queue head : null
		
//		3] use .remove() method --> to get the return & read
		System.out.println("Queue1 : " + queue1);                 // Queue1 : [Apple, Kiwi, Orange]
        System.out.println("Queue : " + queue);                   // Queue : []
        
        headElement = queue1.remove();
        System.out.println("queue1 head : " + headElement);       // queue1 head : Apple
        System.out.println("Queue1 : " + queue1);                 // Queue1 : [Kiwi, Orange]
        
//      headElement = queue.remove();                             // NoSuchElementException
//      System.out.println("queue head : " + headElement);       
//      System.out.println("Queue : " + queue);  
        
//      4] use .poll() method --> to get the return & remove
        headElement = queue1.poll();
        System.out.println("queue1 head : " + headElement);       // queue1 head : Kiwi
        System.out.println("Queue1 : " + queue1);                 // Queue1 : [Orange]
        
        headElement = queue.poll();
        System.out.println("queue head : " + headElement);       // queue head : null
        System.out.println("Queue : " + queue);                  // Queue : []
	}
}

package javaCollection;
//Program ==> 2] Priority Queue

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class PriorityQueuePract3 {
	
//	Imp ==> ArrayBlockingQueue memory (Size) fix.

	public static void main(String[] args) {
		
//		1] use .offer() method --> to add object in the queue
//		ArrayBlockingQueue size (memory) will be fixed
		Queue queue = new ArrayBlockingQueue(3);
				
		System.out.println(queue.offer(123));    // true 
		System.out.println(queue.offer(987));    // true
		System.out.println(queue.offer(147));    // true
		System.out.println(queue.offer(963));    // false
		
//		2] use .add() method --> to add object in the queue
		Queue queue1 = new ArrayBlockingQueue(3);
		
		System.out.println(queue1.add('A'));     // true
		System.out.println(queue1.add('B'));     // true
		System.out.println(queue1.add('C'));     // true
		System.out.println(queue1.add('D'));     // throw IllegalStateException: Queue full
	}
}

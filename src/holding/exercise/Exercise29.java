package holding.exercise;

import java.util.PriorityQueue;

/*
 Create a simple class that inherits from Object and contains no members, and show 
 that you cannot successfully add multiple elements of that class to a PriorityQueue.
 This issue will be fully explained in the Containers in Depth chapter.
 
 Running Result: Exception in thread "main" java.lang.ClassCastException: holding.exercise.Blank cannot be cast to java.lang.Comparable
 */

public class Exercise29 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.offer(new Blank());
		pq.offer(new Blank());
		for(Object o: pq){
			System.out.println(o);
		}
	}
}

class Blank{
	
}
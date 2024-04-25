package day6javaprograms;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {

		
		Deque<String> deque = new ArrayDeque<String>();
		
		
		deque.addFirst("Chennai");
		
		deque.addLast("Hyderabad");
		
		deque.add("Mumbai");
		
		deque.offer("Indore");
		
		deque.offerFirst("Indore");
		
		deque.offerLast("Indore");
		
		
		System.out.println(deque);
		
		deque.removeFirst();
		
		System.out.println(deque);
		
		deque.removeLast();
		
		System.out.println(deque);
		
		
		
		
	}

}

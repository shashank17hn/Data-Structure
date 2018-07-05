package stack.using.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Stack<E> {

	Queue<E> queue = new LinkedList<>();
	
	int size;
	public void push(E x) {
		queue.offer(x);
		size++;
	}
	
	public E pop() {
		int temp =0;
		while(temp != size-1) {
			queue.offer(queue.poll());
			temp++;
		}
		size--;
		return queue.poll();
		
	}
	
	
}

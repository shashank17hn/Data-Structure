package stack.using.queue2;

import java.util.LinkedList;
import java.util.Queue;

public class Stack<E> {
	
	Queue<E> queue1 = new LinkedList<>();
	Queue<E> queue2 = new LinkedList<>();

	int size;
	
	public void push(E x) {
		if(!queue1.isEmpty()) {
			queue1.offer(x);
		} 
		else if(!queue2.isEmpty())
		{
			queue2.offer(x);
		}
		else {
			queue1.offer(x);
		}
		size++;
	}
	
	public E pop() {
		int temp = 0;
		if(!queue1.isEmpty()) {
			while(temp != size-1) {
				queue2.offer(queue1.poll());
				temp++;
			}
			size--;
			return queue1.poll();
		}else {
			while(temp != size-1) {
				queue1.offer(queue2.poll());
				temp++;
			}
			size--;
			return queue2.poll();
		}
		
	
	}
	
	

}

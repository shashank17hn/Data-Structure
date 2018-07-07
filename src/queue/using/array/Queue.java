package queue.using.array;

import java.lang.reflect.Array;

public class Queue<E> {
	
	E[] arr;
	int size;
	int front;
	int rear;
		
	public Queue(Class<E> c, int size) {
		E[] newInstance = (E[]) Array.newInstance(c, size);
		this.arr = newInstance;
		this.size = 0;
		front = -1;
		rear =-1;
	}
	
	public void enqueue(E data) {
		if(size == arr.length) {
			System.out.println("full");
		}
		if(isEmpty()) {
			front = rear =0;	
		}
		else {
			rear = (rear +1)%arr.length;
		}
		arr[rear] = data;
		size++;
	}
	
	public E dequeue() {
		 E val = arr[front];
		 front = (front +1)%arr.length;
		 size--;
		 return val;
		 
	} 
	
	public boolean isEmpty() {
		if(front == -1 && rear ==-1)
			return true;
		else return false;
	}

}

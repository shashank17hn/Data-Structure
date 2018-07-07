package stack.using.array;

import java.lang.reflect.Array;

public class Stack<E> {
	
	int size=0;
	E[] arr ;

	int top =0;
	
	public Stack(Class<E> c, int size) {
		E[] newInstance = (E[]) Array.newInstance(c, size);
		this.arr = newInstance;
		this.size = 0;
		top =-1;
	}
	
	public void push(E val) {
		if(top == arr.length-1) {
			System.out.println("Queue is full");
		}
		else {
			top++;
			arr[top] = val;
		}
	}
	
	public E pop() {
		E val = arr[top];
		top--;
		return val;
	}

}

package stacks;

public class Stack {

	private static class Node{
		private Node next;
		private int data;
		
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node top;

	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(top == null) {
			top = newNode;
		}
		else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	public void delete() {
		top = top.next;
	}
	
	public int peek() {
		return top.data;
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		else {
			return false;
		}
	}
}

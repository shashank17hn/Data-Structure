package queue;

public class Queue {

	private static class Node{
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	private Node tail;
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}
		if(tail != null) {
			tail.next = node;

		}
		tail = node;
	
	}
	
	public void delete() {
		if(head != null) {
	       head = head.next;
		}
		if(head ==null) {
			tail = null;
		}
	}
	
	public boolean isEmpty() {
		if(head ==null) {
			return true;
		}else return false;
	}
	
	public int peek() {
		return head.data;
	}
}

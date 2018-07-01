package linkedlist;

public class LinkedList {

	Node head;
	
	public void appendLast(int value) {
		if(head == null) {
			head = new Node(value);
			return;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new Node(value);
		}
	}
	
	
	public void appendFirst(int value) {
		Node newHead = new Node(value);
		newHead.next = head;
		head = newHead;
		
	}
	
	public void appendAt(int index , int value) {
		if(index == 0) {
			appendFirst(value);
		}
		else {
			Node current = head;
			for(int i=0 ; i<index-1; i++) {
				current = current.next;
			}
			Node newNode = new Node(value);
			newNode.next = current.next;
			current.next = newNode;
			
		}
	}
	
	public void delete(int value) {
		if(head == null) return;
		if(head.data == value) {
			head = head.next;
			return;
		}
		else {
			Node current = head;
			while(current.next.data != value) {
				current = current.next;
			}
			current.next = current.next.next;
			return;
		}
	}
	
	public void deleteAt(int index) {
		 Node current = head;
		if(index ==0) {
		   head = head.next;
		}
		else {
			for(int i=0 ; i<index-1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
		}
	}
	
	
	
	public void showList() {
		Node current = head;
		System.out.println(current.data);
		while(current.next != null) {
			System.out.println(current.next.data);
			current = current.next;
		}
	}
	
}

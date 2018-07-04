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
	
	
	public void sortLinkedList() {
		
		Node current = head;
		Node current2 = head.next;
		
		while(current.next!= null) {
			
			while(current2.next!= null) {
				if(current.next.data >= current2.next.data) {
					System.out.println(current.next.data  + ":" + current2.next.data );
					Node temp = current.next;
					current.next = current2.next;
					current2.next =temp;
					
				}
				current2 = current2.next;
				
			}
			System.out.println(current.next.data  + ":" + current2.next.data );
			current = current.next;
		}
		
	}
	
	public void mergeSortedLinkedList(Node n1, Node n2) {
		
		Node head1 =  new Node(0);
		Node node3 = head1;
		while(n1 != null || n2 != null) {
			if(n1 != null && n2 != null) {
				if(n1.data > n2.data) {
					node3.next = n2;
					n2 = n2.next;
				}
				else {
					node3.next = n1;
					n1 = n1.next;
				}
				//node3 = node3.next;
		}
			else {
				if(n1 == null) {
					node3.next = n2;
					n2 = n2.next;
				}else {
					node3.next = n1;
					n1 = n1.next;
				}
				//node3 = node3.next;
			}
			
		//	System.out.println("liste ready");
			node3 = node3.next;
		}
		System.out.println("liste ready");
		showListMergedList(head1.next);
	}
	
	
	public void showListMergedList(Node head1) {
		Node current = head1;
		System.out.println(current.data);
		while(current.next != null) {
			System.out.println(current.next.data);
			current = current.next;
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

package linkedlistImpl;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class LinkedLists {

	Node head;
	

	// inserting into a list from LAST
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
	
	// inserting into a list from FIRST
	public void appendFirst(int value) {
		Node newHead = new Node(value);
		newHead.next = head;
		head = newHead;
		
	}
	
	// inserting into a list from GIVEN position
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
	
	// deleting given VALUE node
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
	
	// deleting give INDEX node
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
	
	// SORTING NOT WORKING YET
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
	
	
	// Merging two sorted list
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
		System.out.println("list ready");
		showListMergedList(head1.next);
	}
	
	
	// just to display the list
	public void showListMergedList(Node head1) {
		Node current = head1;
		System.out.print(current.data + " ");
		while(current.next != null) {
			System.out.print(current.next.data + " ");
			current = current.next;
		}
	}
	
	// to show the list with head node
	public void showList() {
		Node current = head;
		System.out.print(current.data + " ");
		while(current.next != null) {
			System.out.print(current.next.data + " ");
			current = current.next;
		}
	}
	
	

	// reverse list recursively
	public void ReverseList() {
		//Node tempHead = new Node(0);
		Node result =ReverseListUtils(head);
		showListMergedList(result); 
		
	}
	// reverse list recursively used by above method
	public Node ReverseListUtils(Node node) {
		Node newHead = null;
		if(node.next == null) {
			 newHead = node;
			 return newHead;
		}
		  newHead =ReverseListUtils(node.next);  // 5 (3)
		    node.next.next = node;
		    node.next = null;
		  return newHead;
			
	}
	
	// reversing list iteratively
	public void ReverseListIt() {
		Node current = head;
		Node previous = null;
	
		while(current!= null) {
			Node nextNode = current.next;
			current.next = previous;
			previous = current;
			current = nextNode;
			
		}
		showListMergedList(previous);
	}
	
	// adding two linked list
	public Node Addition(Node n1 , Node n2) {
		n1 =ReverseListUtils(n1);
		n2 = ReverseListUtils(n2);
		Node resultHead = new Node(0);
		Node result = resultHead;
		int carry =0;
		while(n1 != null || n2 != null) {
			int sum =0;
			if(n1 != null && n2 != null) {
			  sum =	n1.data + n2.data + carry;
			    n1 = n1.next;
				n2 = n2.next;
			
			}
			else if(n1 == null) {
			    sum = n2.data + carry;
				carry /= sum;
				sum = sum%10;
				result.next = new Node(sum);
			    n2 = n2.next;
			}
			else if(n2 == null) {
			    sum = n1.data + carry;
				carry /= sum;
				sum = sum%10;
				result.next = new Node(sum);
			    n1 = n1.next;
			}
			carry = sum/10;
			sum = sum%10;
			result.next = new Node(sum);
			result = result .next;
		}
		result = ReverseListUtils(resultHead.next);
		showListMergedList(result);
		return result;
	}
	
	public void deleteKthElementFromLast2Pass(int k) {
		Node current = head;
		int len =1;
		while(current.next != null) {
			len++;
			current = current.next;
		}
		current = head;
		System.out.println("length " + len);
		len = len-k;
		if(len ==0) {
			head = head.next;
			return;
		}
		while(len >=1) {
			len--;
			current = current.next;
			
		}
		current.next = current.next.next;
	}
	
	
	public void deleteKthElementFromLast1Pass(int k) {
		Node fast = head;
		Node slow = head;
		
		for(int i=0 ; i<k; i++) {
			fast = fast.next;
		}
		//System.out.println("fast " + fast.data);
		
		
		
		if(fast == null) {
			head = head.next;
			return;
		}
		
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		
	}
	
	public void addOddAndEvenNodes() {
		Node oddHead = new Node(0);
		Node evenHead = new Node(0);
		Node odd = oddHead;
		Node even = evenHead;
		Node current = head;
		int len =0;
		while(current != null) {
			len++;
			if(len%2 != 0) {
				odd.next = new Node(current.data);
				odd = odd.next;
			}
			
			if(len%2 == 0) {
				even.next = new Node(current.data);
				even = even.next;
			}
		
			current = current.next;
					
		}
		
		showListMergedList(oddHead.next);
		System.out.println();
		showListMergedList(evenHead.next);
	}
	
	
	public void removeDuplicates() {

		Node current = head;
		while(current!= null && current.next != null) {
				if(current.data == current.next.data) {
					// System.out.println(current.data + " " + current.next.data);
					current.next = current.next.next;
				}
				//else {
					current = current.next;
			//	}
				
		}
		
		showListMergedList(head);
	}
	
	public void removeDuplicatesFromUnsorted() {

		Node current = head;
		Node prev = null;
		HashSet<Integer> nodeSet = new HashSet<>();
		while(current!= null) {
		
			int curval = current.data;
			if(nodeSet.contains(curval)) {
				prev.next = current.next;
			}else {
				nodeSet.add(curval);
				prev = current;
			}
			
			current = current.next;
				
		}
		
		showListMergedList(head);
	}
	
	public void swapNode() {
		
		
		Node current = head;
		Node resultHead = new Node(0);
		while(current != null && current.next != null) {
			int temp = current.data;
			current.data = current.next.data;
			current.next.data = temp;
			current = current.next.next;
		}
		
		showListMergedList(head);
	}
	
	
	
	public boolean detectCycle() {
		Node fast = head;
		Node slow = head;
		
		while(slow != null && fast != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isPalindrome() {
		Node node = head;
		Stack<Integer> stack = new Stack();
		
		while(node != null) {
			stack.push(node.data);
			node = node.next;
		}
		node = head;
		while(node != null) {
			if(node.data !=  stack.pop())
				return false;
			node = node.next;
		}
		return true;
	}
	
	
	public void manipulateLinkedList() {
		// I :  10 4 5 3 6 
		// O : -4 -1 5 4 10
		Node current = head;
		Stack<Integer> stack= new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		while(current != null) {
			stack.push(current.data);
			queue.offer(current.data);
			current = current.next;
		}
		Node newHead = new Node(0);
		Node newCurr = newHead;
			for(int i=0 ; i<= (stack.size()/2) ; i++) {
				newCurr.next = new Node(stack.pop()- queue.poll());
				newCurr = newCurr.next;
			}
			while(!stack.isEmpty()) {
				newCurr.next = new Node(stack.pop());
				newCurr = newCurr.next;
			}
		
		showListMergedList(newHead.next);
	}
		
}
	
	
	
	


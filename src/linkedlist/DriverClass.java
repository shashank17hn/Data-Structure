package linkedlist;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  LinkedList list = new LinkedList();
	  LinkedList list2 = new LinkedList();
/*	  list.appendLast(4);
	  list.appendLast(2);
	  list.appendLast(3);
	  list.appendFirst(1);
	 
	  
	  list.showList();
	  System.out.println("----------------------");
	  list.delete(2);
	  list.showList();
	  
	  System.out.println("----------------------");
	  list.delete(1);
	  list.showList();
	  
	  
	  System.out.println("----------------------");
	  list.appendAt(1, 100);
	  list.showList();
	  
	  System.out.println("----------------------");
	  list.deleteAt(0);
	  list.showList();*/
	  
	  System.out.println("----------------------");
	  list.appendLast(1);
	  list2.appendLast(2);
	  list.appendLast(3);
	  list2.appendLast(4);
	  list2.appendLast(5);
	 // list.appendFirst();
	  list.showList();
	  System.out.println("----------------------");
	  list2.showList();
	  System.out.println("----------------------");
	  list.mergeSortedLinkedList(list.head, list2.head);
	  
	/*//  list.sortLinkedList();
	  System.out.println("----------------------");
	  list.showList();*/
	}

}

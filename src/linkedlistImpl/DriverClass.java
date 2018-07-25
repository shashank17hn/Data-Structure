package linkedlistImpl;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  LinkedLists list = new LinkedLists();
	  LinkedLists list2 = new LinkedLists();
	  
	  LinkedLists list3 = new LinkedLists();
	  
	 
	  list3.appendLast(1);
	  list3.appendLast(2);
	  list3.appendLast(3);
	  list3.appendLast(14);

	  System.out.print("----------------------\n");
	  list3.showList();
	/*  System.out.println("----------------------");
	  list3.ReverseList();*/
	//  list3.ReverseListIt();
	  
	  
	  list2.appendLast(1);
	  list2.appendLast(2);
	  list2.appendLast(3);
	  
	  System.out.print("---------------------- \n");
	  
	  list2.showList();
	/*  System.out.println("----------------------");
	  list3.ReverseList();*/

	//  list2.ReverseListIt();
	  System.out.print("---------------------- \n");
	  list2.Addition(list2.head, list3.head);
	  
	  
	//  list3.showList();
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
	  
	 /* System.out.println("----------------------");
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
	  list.mergeSortedLinkedList(list.head, list2.head);*/
	  
	/*//  list.sortLinkedList();
	  System.out.println("----------------------");
	  list.showList();*/
	  
/*	  System.out.println("----------- k element-----------\n");
	  list.appendLast(1);
	  list.appendLast(2);
	  list.appendLast(3);
	  list.appendLast(4);
	  list.appendLast(5);
	  list.showList();
	  list.deleteKthElementFromLast2Pass(2);
	 // list.deleteKthElementFromLast1Pass(2);
	  System.out.println();
	  list.showList();
	  System.out.println();
	  list.deleteKthElementFromLast2Pass(4);
	 // list.deleteKthElementFromLast1Pass(4);
	  System.out.println();
	  list.showList();*/
	  
	  System.out.println("----------- odd/even element-----------\n");
	//  list.appendLast(4);
	//  list.appendLast(6);
	  list.appendLast(1);
	  list.appendLast(2);
	  list.appendLast(3);
	  list.appendLast(4);
	  list.appendLast(2);
	  list.appendLast(1);
//	  list.appendLast(1);
	  list.showList();
	  System.out.println(list.isPalindrome());
//	  System.out.println();
	 // list.swapNode();
//	  list.removeDuplicatesFromUnsorted();
	//  list.addOddAndEvenNodes();
	//  list.removeDuplicates();
	 // list.showList();
	// I :  10 4 5 3 6 
	// O : -4 -1 5 4 10
	  LinkedLists list4 = new LinkedLists();
	  list4.appendLast(10);
	  list4.appendLast(4);
	  list4.appendLast(5);
	  list4.appendLast(3);
	  list4.appendLast(6);
	 // list4.appendLast(1);
	  
	  list4.manipulateLinkedList();
	}

}

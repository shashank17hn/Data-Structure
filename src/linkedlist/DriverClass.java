package linkedlist;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  LinkedList list = new LinkedList();
	  list.appendLast(4);
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
	  list.showList();
	}

}

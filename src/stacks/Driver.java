package stacks;

public class Driver {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		
		
		System.out.println(q.peek());
	     q.delete();
	     System.out.println(q.peek());
	     q.insert(5);
		System.out.println(q.peek());
		

	}

}

package stacks;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack();
		
		System.out.println(s.isEmpty());
		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.insert(4);
		
		System.out.println(s.peek());
		s.delete();
		
		System.out.println(s.peek());
		
		System.out.println(s.isEmpty());
	}

}

package stack.using.array;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack<>(Integer.class, 4);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		s.push(3);
		s.push(4);
		
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}

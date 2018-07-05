package stack.using.queue;

public class Driver {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.pop());
		stack.push(5);
		stack.push(6);
		System.out.println(stack.pop());

	}

}

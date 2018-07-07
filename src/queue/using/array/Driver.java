package queue.using.array;

public class Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new Queue<>(Integer.class, 4);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		System.out.println(q.dequeue());
		q.enqueue(5);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		
		
		

	}

}

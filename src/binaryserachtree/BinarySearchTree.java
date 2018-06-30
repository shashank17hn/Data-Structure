package binaryserachtree;

public class BinarySearchTree {
	
	public static void main(String[] args) {
		
		Node root = new Node(2);
		
		root.insert(1);
		root.insert(3);
		
		System.out.println(root.contains(3));

		System.out.println("In order");
		root.inOrderTraversal();
		
		System.out.println("Pre order");
		root.preOrderTraversal();
		
		System.out.println("Post order");
		root.postOrderTraversal();
	}

}

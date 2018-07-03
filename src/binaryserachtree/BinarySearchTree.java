package binaryserachtree;

public class BinarySearchTree {
	
	static Node root1;
	
	public static void main(String[] args) {
		
		Node root = new Node(2);
		
		root.insert(1);
		root.insert(3);
		root.insert(4);
		
		System.out.println(root.contains(3));

		System.out.println("In order");
		root.inOrderTraversal();
		
		System.out.println("Pre order");
		root.preOrderTraversal();
		
		System.out.println("Post order");
		root.postOrderTraversal();
		
		System.out.println("Level order traversal using queue");
		root.levelOrderTraversalUsingQueue(root);
		
		System.out.println("Level order traversal");
		root.levelOrderTraversal(root);
		
		System.out.println(root.isBST(root));
		
		/*root.left = new Node(1);
		root.left.left = new Node(3);
		root.left.left.left = new Node(2);
		
		System.out.println(root.isBST(root));*/
		
		BinarySearchTree tree = new BinarySearchTree();
		
		 tree.root1 = new Node(4);
	        tree.root1.left = new Node(2);
	        tree.root1.right = new Node(5);
	        tree.root1.left.left = new Node(1);
	        tree.root1.left.right = new Node(3);
	        
	        System.out.println(root1.isBST(root1));
	 
	}

}

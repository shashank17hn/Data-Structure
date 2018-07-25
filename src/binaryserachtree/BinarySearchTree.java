package binaryserachtree;

import java.awt.geom.FlatteningPathIterator;

public class BinarySearchTree {
	
	static Node root2;
	static Node root1;
	static  Node root;
	
	public static void main(String[] args) {
		
		/*Node root = new Node(2);
		
		root.insert(1);
		root.insert(3);
		root.insert(4);
		
		System.out.println(root.contains(3));

		System.out.println("In order");
		root.inOrderTraversal();
		
		System.out.println(root.pathSum(root, 3));*/
		
/*		System.out.println("Pre order");
		root.preOrderTraversal();
		
		System.out.println("Post order");
		root.postOrderTraversal();
		
		System.out.println("Level order traversal using queue");
		root.levelOrderTraversalUsingQueue(root);
		
		System.out.println("Level order traversal");
		root.levelOrderTraversal(root);*/
		
	/*	System.out.println("invert");
		root.invertTree(root);
		root.inOrderTraversal();*/
		
	//	System.out.println(root.isBST(root));
		
		/*root.left = new Node(1);
		root.left.left = new Node(3);
		root.left.left.left = new Node(2);
		
		System.out.println(root.isBST(root));*/
		
		BinarySearchTree tree = new BinarySearchTree();
/*		
		 tree.root1 = new Node(4);
	        tree.root1.left = new Node(2);
	        tree.root1.right = new Node(5);
	        tree.root1.left.left = new Node(1);
	        tree.root1.left.right = new Node(3);
	        
	        System.out.println(root1.isBST(root1));
	 */
		
		
		   /* Constructed binary tree is
        10
       /  \
     12     2
    / \   /
  11   13 2
  
        10
       /  \
     2    13
    / \   / \
   2     11  12
  */
	/*	
		  tree.root = new Node(10);
		  tree.root.left = new Node(12);
		  tree.root.right = new Node(2);
		  tree.root.left.left = new Node(13);
		  tree.root.left.right = new Node(11);
		  tree.root.right.left = new Node(2);
		  
		  
			System.out.println("In order");
			root.inOrderTraversal();
			
			root.invertTree(root);
			System.out.println("------------------------------------");
			System.out.println("In order");
			root.inOrderTraversal();

			// System.out.println(root.pathSum(root, 23));
			System.out.println("------------------------------------");
		
			System.out.println(root.KsmallestElement2(root, 2));
			System.out.println("------------------------------------");
			
			System.out.println(root.KsmallestElement(root,2));
			System.out.println(root.kSmallestEle2);*/
			
			
		/*   1
	        / \
	       2   5
	      / \   \
	     3   4   6*/
	/*		System.out.println("------------------------------------");
			BinarySearchTree tree1 = new BinarySearchTree();
			tree1.root1 = new Node(1);
			tree1.root1.left = new Node(2);
			tree1.root1.left.left = new Node(3);
			tree1.root1.left.right = new Node(4);
			tree1.root1.right = new Node(5);
			tree1.root1.right.right = new Node(6);
			
			root1.preOrderTraversal();
			System.out.println("------------------------------------");

			root1.flattenTreeToLinkedList(root1);
			System.out.println(root1.list);*/
	/*		
			System.out.println("---------------array to bst---------------------");
			int[] arr = {3,2,4,1,5,6};
			
			Node data = root.arrayToBST(arr, 0, arr.length-1);
			data.inOrderTraversal();
			
			in-order:   4 2 5  (1)  6 7 3 8
			post-order: 4 5 2  6 7 8 3  (1)
			System.out.println("---------------inorder-postorder to bst---------------------");
			int[] inorder = {4,2,5,1,6,7,3,8};
			int[] postorder = {4,5,2,6,7,8,3,1};
			
			Node data2 = root.inOrderPostOrderToBST(inorder, postorder);
			data2.preOrderTraversal();
			
			in-order:   4 2 5 (1) 6 7 3 8
			pre-order: (1) 2 4 5  3 7 6 8
			int[] preorder = {1,2,4,5,3,7,6,8};
			System.out.println("---------------inorder-postorder to bst---------------------");
			Node data3 = root.inOrderPreOrderToBST(inorder, preorder);
			data3.preOrderTraversal();*/
		
	  /* 1
        / \
       2   3
      / \   
     4   5   */
		
		
	 /*  1
	    / \
	   2   3
	  /     \
	 4       6        
	/	
   5       */
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.right.right = new Node(6);
	        tree.root.left.left = new Node(4);
	        tree.root.left.left.left = new Node(5);
	       // tree.root.left.right = new Node(5);
	       // tree.root.left.left.left = new Node(8);
			
	   /*     System.out.println(root.isTreeBalanced(root));
			System.out.println("---------------Right view---------------------");
	        root.printRightView(root);
	        System.out.println("---------------Left view---------------------");
	        root.printLeftView(root);
	        
	        System.out.println("---------------Iterator---------------------");
	        
	        root.treeIterator(root);
	        while(root.hasNext()) {
	        System.out.println(root.next());
	
	        }
	        
	        System.out.println("---------------ancestor---------------------");
	        root.lowestCommonAncestor(root, 4,4);
	        root.lowestCommonAncestor(root, 4,2);
	        root.lowestCommonAncestor(root, 4,3);
	       // System.out.println(root.ancestor1);
	       // System.out.println(root.ancestor2);
	        // System.out.println(root.ancestor);
*/	        
	        
	   	 /*  3
		    / \
		   2   2
		  /     \
		 1       4   
		 
		      
		     2
		    / \
		   3   3
		  /     \
		 1       4 
		      
		      */
	        
	        
	       // root.displayNodeWithNoSibling(root);
	        
	        BinarySearchTree tree1 = new BinarySearchTree();
	        tree1.root1 = new Node(3);
	        tree1.root1.left = new Node(2);
	        tree1.root1.left.left = new Node(1);
	        tree1.root1.right = new Node(2);
	        tree1.root1.right.right = new Node(4);
	        
	        BinarySearchTree tree2 = new BinarySearchTree();
	        tree2.root2 = new Node(2);
	        tree2.root2.left = new Node(3);
	        tree2.root2.left.left = new Node(1);
	        tree2.root2.right = new Node(3);
	        tree2.root2.right.right = new Node(4);
	      //  tree2.root2.right.left = new Node(4);
	        
	        System.out.println(root1.isIsomorphic(root1, root2));
	        
	        System.out.println(root1.memo);
	}

}

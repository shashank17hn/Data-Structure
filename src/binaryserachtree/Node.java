package binaryserachtree;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class Node {
	
	
	Node left , right;
	int data;
	
	public Node(int data) {
		this.data = data;
		//left = right = null;
	}
	
	// insert data in a tree
	public void insert(int value) {
		// if value is less then data that mean it will go on left side 
		if(value < data) {
			if(left == null) {
				// if its last node then it will insert
				left = new Node(value);
			}
			else {
				// other wise recursive call will happen to find again whether to go check my left whether there is right or left
				left.insert(value);
			}
		}
		else {  // vice versa 
			if(right == null) {
				right = new Node(value);
			}
			else {
				right.insert(value);
			}
		}
	
	}
	
	// checking node with given value exists or not
	public boolean contains(int value) {
		
		// now this condition will cover root node if value is root or otherwise it will be boundary condition 
		if(value == data) {
		   return true;	
		}
		else if(value < data) {
			if(left == null) {
				return false;
			}
			else {
				return left.contains(value);
			}
		}
		else {
			if(right == null) {
				return false;
			}
			else {
				return right.contains(value);
			}
		}
		
	}
	
	public void inOrderTraversal() {
		if(left != null) {
			left.inOrderTraversal();
		}
		System.out.println(data);
		if(right != null) {
			right.inOrderTraversal();
		}
		
	}
	
	
	public void preOrderTraversal() {
		System.out.println(data);
		if(left != null) {
			left.preOrderTraversal();
		}
		if(right != null) {
			right.preOrderTraversal();
		}
		
	}
	
	
	public void postOrderTraversal() {
		if(left != null) {
			left.postOrderTraversal();
		}
		if(right != null) {
			right.postOrderTraversal();
		}
		System.out.println(data);
		
	}
	
	public boolean isBST(Node node) {
		return isBSTUtils(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public boolean isBSTUtils(Node node, int min , int max) {
		if(node == null) {
			return true;
		}
		if(node.data <min || node.data > max) {
			return false;
		}
		return (isBSTUtils(node.left, node.data -1, max) && isBSTUtils(node.right, min, node.data +1));
	}
	
	public void levelOrderTraversalUsingQueue(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			
			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " , ");
			
			if(tempNode.left != null) {
				queue.add(tempNode.left);
			}
			
			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}
	
	public void levelOrderTraversal(Node node) {
		
		int h = findHeight(node);
		for(int i =0 ; i< h ; i++) {
			levelOrderTraversalUtils(node, i);
		}
		
	}
	
	public void levelOrderTraversalUtils(Node node , int level) {
		
		if(node == null)
			return;
		if(level == 1) {
			System.out.print(node.data + " , ");
		}	
		else {
			levelOrderTraversalUtils(node.left, level-1);
			levelOrderTraversalUtils(node.right, level-1);
		}
		
	}
	
	public int findHeight(Node node) {
		if(node == null)
			return 1;
		else {
			int lHeight = findHeight(node.left);
			int rHeight = findHeight(node.right); 
			
			 if(lHeight > rHeight)
				 return lHeight+1;
			 else return rHeight+1;
			
		}
	}

}

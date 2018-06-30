package binaryserachtree;

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

}

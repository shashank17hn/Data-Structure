package binaryserachtree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
	
	public void invertTree(Node root) {
		
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		if(root.left!= null) {
			invertTree(root.left);
		}
		
		if(root.right != null) {
			invertTree(root.right);
		}
		
	}
	
	Stack<Integer>s = new Stack<>();
	public boolean pathSum(Node root , int sum) {
		
		s.push(root.data);
		boolean ans = pathSumUtils(root,sum);
		System.out.println("data " + s);
		return ans;
	}
	
	public boolean pathSumUtils(Node root , int sum) {
		if(root == null) {
			//s.pop();
			return false;
		}
	
		else {
			int subSum = sum - root.data;
			boolean leftAns = false;
			boolean rightAns = false;
			
			 if(subSum == 0 && root.left == null && root.right == null) {
					return true;
				}
			  	if(root.left != null) {
			  		System.out.println("root left "+ root.data);
			  		leftAns	=pathSumUtils(root.left, subSum );
			  		if(leftAns){
			  			 s.push(root.left.data);
			  		}
			  	}
			  	if(root.right != null) {
			  		
			  	  rightAns =pathSumUtils(root.right , subSum);
			  	  if(rightAns)
			  		s.push(root.right.data);
			  	}
			
			return  leftAns||rightAns ;
		}
	}
	
	Stack<Node> kSmallestEle = new Stack<>(); 
	Queue<Integer> kSmallestEle2 = new LinkedList(); 
	
	public int KsmallestElement(Node root , int k) {
		KsmallestElementUtils(root);
		for(int i=1 ; i<k; i++) {
			kSmallestEle2.poll();
		}
		return kSmallestEle2.poll();
	}
	
	public void KsmallestElementUtils(Node root ) {
	
		if(root.left!= null) {
			KsmallestElementUtils(root.left);

		}
		
		kSmallestEle2.offer(root.data);
		
		if(root.right!= null) {
			KsmallestElementUtils(root.right);
		}
			
	
	}
	
	
	public int KsmallestElement2(Node root , int k) {

		while(!kSmallestEle.isEmpty() || root != null) {
			if(root != null) {
				kSmallestEle.push(root);
				root = root.left;
			}else {
			   Node n = kSmallestEle.pop();
			   k--;
			   if(k==0) {
				   return n.data;
			   }
			   root = n.right;
				
			}
		
		}	
			return 0;
		
	}
	
	List<Integer> list = new LinkedList<>();
	public void flattenTreeToLinkedList(Node root) {
		list.add(root.data);
		if(root.left!= null) {
		  flattenTreeToLinkedList(root.left);
		}
		if(root.right!= null) {
			  flattenTreeToLinkedList(root.right);
		}
	}
	
	
	public Node arrayToBST(int [] arr , int start , int end) {
		
		if(start> end)
			return null;
		
		int mid = (start+end)/2;
		Node newRoot = new Node(arr[mid]);
		newRoot.left = arrayToBST(arr, start, mid-1);
		newRoot.right = arrayToBST(arr, mid+1, end);
		return newRoot;
		
	}
	
	public Node inOrderPostOrderToBST(int[] inOrder, int[] postOrder) {
		int inStart =0;
		int inEnd = inOrder.length-1;
		int postStart =0;
		int postEnd =postOrder.length-1;	
		Node newRoot = null;
		return  newRoot = inOrderPostOrderToBSTUtils(inOrder, inStart, inEnd, postOrder, postStart, postEnd);
	} 
	
	public Node inOrderPostOrderToBSTUtils(int[] inOrder , int inStart , int inEnd , int[] postOrder , int postStart , int postEnd) {
		if(inStart> inEnd || postStart> postEnd)
			return null;
		
		Node newRoot = new Node(postOrder[postEnd]);
		
		int k =0;
		for(int i=0 ; i<inOrder.length ; i++) {
			if(inOrder[i] == newRoot.data) {
				k= i;
			  break;	
			}
			
		}
		
		newRoot.left = inOrderPostOrderToBSTUtils(inOrder, inStart, k-1, postOrder, postStart, postStart+k -(inStart+1));
		newRoot.right = inOrderPostOrderToBSTUtils(inOrder, k+1, inEnd, postOrder, postStart+k-inStart, postEnd-1);
		
		return newRoot;
	}
	
	
	
	
	public Node inOrderPreOrderToBST(int[] inOrder, int[] preOrder) {
		int inStart =0;
		int inEnd = inOrder.length-1;
		int preStart =0;
		int preEnd =preOrder.length-1;	
		Node newRoot = null;
		return  newRoot = inOrderPreOrderToBSTUtils(inOrder, inStart, inEnd, preOrder, preStart, preEnd);
	} 
	
	public Node inOrderPreOrderToBSTUtils(int[] inOrder , int inStart , int inEnd , int[] preOrder , int preStart , int preEnd) {
		if(inStart> inEnd || preStart> preEnd)
			return null;
		
		Node newRoot = new Node(preOrder[preStart]);
		
		int k =0;
		for(int i=0 ; i<inOrder.length ; i++) {
			if(inOrder[i] == newRoot.data) {
				k= i;
			  break;	
			}
			
		}
		
		/*in-order:   4 2 5 (1) 6 7 3 8
		pre-order: (1) 2 4 5  3 7 6 8*/
		
		newRoot.left = inOrderPreOrderToBSTUtils(inOrder, inStart, k-1, preOrder, preStart+1, preStart+(k-inStart));
		newRoot.right = inOrderPreOrderToBSTUtils(inOrder, k+1, inEnd, preOrder, preStart+(k-inStart)+1, preEnd);
		
		
		/* p.left = construct(preorder, preStart+1, preStart+(k-inStart), inorder, inStart, k-1);
		    p.right= construct(preorder, preStart+(k-inStart)+1, preEnd, inorder, k+1 , inEnd);*/
		return newRoot;
	}
	
	
	public boolean isTreeBalanced(Node node) {
		if(node == null) {
			return true;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		
		if(Math.abs(lh-rh)<=1 && isTreeBalanced(node.left) && isTreeBalanced(node.right)) {
			return true;
		}

			return false;
		
		
	}
	
	public int height(Node node) {
		
		if(node == null)
			return 0;
		 return 1 + Math.max(height(node.left), height(node.right));
		
	}
	
	public boolean isTreeSymmetric(Node root) {
		if(root == null) {
			return true;
		}
		return isTreeSymmetricUtils(root.left, root.right);
		
	}

	public boolean isTreeSymmetricUtils(Node l, Node r) {
		if(l.data != r.data) {
			return false;
		}
		if(l == null || r ==  null) {
			return false;
		}
		else if(l == null && r ==  null) {
			return true;
		}
		if(!isTreeSymmetricUtils(l.left, r.right)) {
			return false;
		}
		if(!isTreeSymmetricUtils(l.right, r.left)) {
			return false;
		}
		return true;
	}

	public void printRightView(Node node) {
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			
			int n= q.size();
			for(int i =1; i<=n ;i++) {
				
				Node temp = q.poll();
				if(n == i) {
					System.out.println( temp.data + " ");
				}
				if(temp.left != null) {
					q.add(temp.left);
				}
				if(temp.right !=null) {
					q.add(temp.right);
				}
			}
		}
	}
	
	public void printLeftView(Node node) {
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			
			int n= q.size();
			for(int i =1; i<=n ;i++) {
				
				Node temp = q.poll();
				if(n == i) {
					System.out.println( temp.data + " ");
				}
				if(temp.right !=null) {
					q.add(temp.right);
				}
				if(temp.left != null) {
					q.add(temp.left);
				}
				
			}
		}
	}
	
	Stack<Node> it;
	public void treeIterator(Node node) {
		it = new Stack<>();
		while(node!= null) {
			it.push(node);
			node = node.left;
		}
		
	}
	
	public boolean hasNext() {
		return !it.isEmpty();
	}
	
	public int next() {
		
		Node temp =it.pop();
		int result = temp.data;
		if(temp.right != null) {
			temp = temp.right;
			while(temp != null) {
				 it.push(temp);
				 temp = temp.left;
			}
			
		}
		return result;
		
	}
	

	public boolean lowestCommonAncestorUtils(Node root, int val , Stack<Integer> ancestor) {
		 if(root == null)
			return false;
		 if(root.data == val) {
			 ancestor.push(root.data);
			 return true;
		 }
		 if(root.left != null || root.right != null) {
			boolean l = lowestCommonAncestorUtils(root.left , val , ancestor);
			if(l)
			ancestor.push(root.data);
			boolean r =  lowestCommonAncestorUtils(root.right , val, ancestor);
			if(r)
				ancestor.push(root.data);
				return r||l;
	
		 }
		 else return false;
		
	}
	
	
	public void lowestCommonAncestor(Node root, int val1 , int val2) {
		Stack<Integer> ancestor1 = new Stack<>();
		Stack<Integer> ancestor2 = new Stack<>();
		   lowestCommonAncestorUtils(root, val1 , ancestor1);
		   lowestCommonAncestorUtils(root, val2 , ancestor2);
		   int ans= -1;
		   System.out.println(ancestor1);
		   System.out.println(ancestor2);
		   while(!ancestor1.isEmpty() && !ancestor2.isEmpty()) {
			   if(ancestor1.peek() == ancestor2.peek()) {
				  ans = ancestor1.pop();
				  ancestor2.pop();
			   }else {
			   ancestor1.pop();
			   ancestor2.pop();
			   }
		   }
		   System.out.println(ans);
	}
	
	
}

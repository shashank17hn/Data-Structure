package trie.array;



public class Trie {
	
	static class TrieNode{
		
		char c;
		boolean isLeaf;
		TrieNode[] children = new TrieNode[26];
		
		 TrieNode(){
			 isLeaf = false;
	            for (int i = 0; i < 26; i++)
	                children[i] = null;
	        }
	}
	
	static TrieNode root;
	
 
	
	public static void insert(String word) {
		TrieNode rootNode = root;
		for(int i =0 ; i< word.length() ; i++) {
			int index = word.charAt(i) - 'a';
			if(rootNode.children[index] == null) {
				TrieNode newNode = new TrieNode();
				rootNode.children[index] = newNode;
				rootNode = newNode;
				
			}
			else {
				rootNode = rootNode.children[index];
			}
			if(i == word.length())
				rootNode.isLeaf = true;
		}
	}
	
	
	public static boolean search(String word) {
		TrieNode node = searchUtils(word);
		if(node != null && node.isLeaf)
			return true;
		else
	        return false;
	        
		
	}
	
	public static TrieNode searchUtils(String word) {
		TrieNode node = root;
		for(int i =0 ; i< word.length() ; i++) {
			int index = word.charAt(i) - 'a';
			if(node.children[index] != null) {
				node= node.children[index];
			}
			else {
				return null;
			}

			}
		if(node == root) {
			return null;
			}
			return node;

	}

	public static void main(String[] args) {
		
		root = new TrieNode();
		
		insert("hello");
		System.out.println(search("hello"));
		System.out.println(search("hell"));
	

		
	}

}

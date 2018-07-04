package trie.map;

import java.util.HashMap;
import java.util.Map;


public class Trie {
	
	static class TrieNode{
		char c;
		HashMap<Character, TrieNode> children = new HashMap<Character,TrieNode>();
		boolean isLeaf;
		int size;
		
		public TrieNode() {}

		// constructor accepting the character
		public TrieNode(char c) {
			this.c = c;
		}
	};
	
	static TrieNode root;
	
	
	
	  
	
	public static void insert(String word) {
		 HashMap<Character, TrieNode> children = root.children;
		TrieNode rootNode = root;
		for(int i=0 ; i< word.length() ; i++) {
			if(children.containsKey(word.charAt(i))) {
				TrieNode newNode = children.get(word.charAt(i));
				newNode.size++;
				rootNode = newNode;
		
			}
			else {
				TrieNode newNode = new TrieNode();
				children.put(word.charAt(i), newNode);
				newNode.size++;
				rootNode = newNode;
				
			}
			rootNode.size++;
			children = rootNode.children;
			if(i == word.length()-1)
				rootNode.isLeaf =true;
		}
		
	}
	
	public static boolean search(String word) {
	   TrieNode node  = searchUtils(word);
	   if(node != null && node.isLeaf) {
		   return true;
	   }
	   else return false;
	}
	
	public static  boolean SearchStartsWith(String word) {
		 HashMap<Character, TrieNode> children = root.children;
		TrieNode node = searchUtils(word);
		if(node == null)
			return false;
		else {
			
			System.out.println(node.size);
			return true;
		}
	}
	
	public static TrieNode searchUtils(String word) {
		 HashMap<Character, TrieNode> children = root.children;
		TrieNode node =null;
		for(int i=0 ; i<word.length() ; i++) {
			if(children.containsKey(word.charAt(i))){
				node = children.get(word.charAt(i));
				children = node.children;
			}
			else return null;
		}
		return node;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		root = new TrieNode();
		
		insert("Hello");
		System.out.println(search("Hello"));
		System.out.println(search("Hell"));
		System.out.println(search("Hell00"));
		System.out.println(SearchStartsWith("Hell"));


	}

}

package com.bridgeLabz.binarySearchTree;

public class MyBinaryTree<K extends Comparable <K>> {

	MyBinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {

		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		
		int result = key.compareTo(current.key);
		if (result == 0) {
			return current;
		}
		
		if (result < 0) {
			current.left = addRecursively(current.left, key);
		}
		else {
			current.right = addRecursively(current.right, key);
		}
		
		return current;
	}
	
	public K getKey() {
		return root.key;
	}
	
	public K getLeft() {
		return root.left.key;
	}
	
	public K getRight() {
		return root.right.key;
	}
	
	public int getSize() {
		return getSizeRecursive(root); 
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		
		if (current == null) {
			return 0;
		}
		else {
			return 1 + getSizeRecursive(current.left) + getSizeRecursive(current.right);
		}
		
	}
	
}

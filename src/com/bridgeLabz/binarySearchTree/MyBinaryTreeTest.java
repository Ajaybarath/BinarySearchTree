package com.bridgeLabz.binarySearchTree;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MyBinaryTreeTest {
	
	@Test
	public void addKeyToBinarySearchTree() {
		
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		
		boolean result = myBinaryTree.getKey() == 56 && myBinaryTree.getLeft() == 30 && myBinaryTree.getRight() == 70;
	
	
		Assert.assertEquals(true, result);
	}

	
	@Test
	public void addKeyAndGetSizeOfBinarySearchTree() {
		
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);

		int result = myBinaryTree.getSize();
	
		Assert.assertEquals(7, result);
	}
	
	@Test
	public void searchFromBinarySearchTree() {
		
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		

		int result = myBinaryTree.search(70);
			
		Assert.assertEquals(1, result);
	}
	
}

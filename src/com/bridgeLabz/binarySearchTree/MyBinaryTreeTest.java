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

}

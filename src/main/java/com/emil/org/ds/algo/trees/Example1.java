package com.emil.org.ds.algo.trees;

import java.util.Comparator;

//create BST
//insert /search - O(logn)
public class Example1<E> implements Comparator<E> {

	Node<E> root;
	int size;

	private static class Node<E> {
		E item;
		Node<E> left;
		Node<E> right;

		Node(E item) {
			this.item = item;
		}

		@Override
		public String toString() {
			return "Node [item=" + item + ", left=" + left + ", right=" + right + "]";
		}

	}

	public void insert(E insertItem) {
		Node<E> newNode = new Node<>(insertItem);
		if (root == null) {
			root = newNode;
		} else {
			compareAndInsert(insertItem, root);
		}

		size++;
	}
	
	public boolean lookup(E lookupValue) {
		Node<E> currentNode = root;
		return valueExists(lookupValue, currentNode);
	}
	
	private boolean valueExists(E lookupValue, Node<E> currentNode) {
		
		int result = compare(currentNode.item, lookupValue);
		
		if(result==0) {
			return true;
		}
		
		if(currentNode.right== null && currentNode.left == null) {
			return false;
		}
		
		if(result<0) {
			// search right side nodes
			if(currentNode.right==null) {
				return false;
			}else {
				return valueExists(lookupValue,currentNode.right);
				
			}
		}
		else {
			// search left side nodes
			if(currentNode.left==null) {
				return false;
			}else {
				return valueExists(lookupValue,currentNode.left);
				
			}
		}
		
	//	return false;
		
	}

	private void compareAndInsert(E insertItem, Node<E> currentNode) {

		int result = compare(currentNode.item, insertItem);

		if (result > 0) {
			// Insert to the left
			if(currentNode.left==null) {
				currentNode.left =  new Node<>(insertItem);
				System.out.println("Inserting to the left");
			}else {
				compareAndInsert(insertItem,currentNode.left);
			}
		} else {
			// Insert to the right
			if(currentNode.right==null) {
				currentNode.right =  new Node<>(insertItem);
				System.out.println("Inserting to the Right");
			}else {
				compareAndInsert(insertItem,currentNode.right);
			}
		}

	}

	@Override
	public int compare(E o1, E o2) {
		return ((Comparable) o1).compareTo(o2);
	}

	public static void main(String[] args) {

		Example1<Integer> bst = new Example1<>();
		bst.insert(7);
		bst.insert(9);
		bst.insert(5);
		bst.insert(3);
		bst.insert(10);
		System.out.println("Complete");
		System.out.println(bst);
		System.out.println("BST contains 7 " +bst.lookup(7));
		System.out.println("BST contains 10 " +bst.lookup(10));
		System.out.println("BST contains 5 " +bst.lookup(5));
		System.out.println("BST contains 2 " +bst.lookup(2));

	}

	@Override
	public String toString() {
		return "Example1 [root=" + root + ", size=" + size + "]";
	}
}

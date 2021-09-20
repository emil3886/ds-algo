package com.emil.org.ds.algo.linkedlist;

//Implement stack
//pop/push/peek methods
//Implement browser history
public class Example2<E> {

	E item;
	Node<E> top;
	Node<E> bottom;
	int size = 0;

	private static class Node<E> {

		E item;
		Node<E> next;

		Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}

	}

	// to add an item to the top of the stack
	public void push(E item) {

		Node<E> currentTop = top;
		top = new Node<>(item, currentTop);
		if (currentTop == null) {
			bottom = top;
		}
		size++;

	}

	// to get the top element of the stack
	public Node<E> peek() {
		return this.top;
	}

	// to remove the top element of the stack
	public void pop() {
		if (size == 0) {
			throw new IndexOutOfBoundsException("Empty stack");
		}

		if(size == 1) {
			bottom = null;
		}
		Node<E> currentTop = this.top;
		top = currentTop.next;
		currentTop = null;

		size--;
	}

	public void printElements() {
		Node<E> currentElement = top;

		while (currentElement != null) {
			System.out.println(currentElement.item);
			currentElement = currentElement.next;
		}
	}

	public static void main(String[] args) {
		Example2<String> stack = new Example2<>();
		stack.push("Google.com");
		stack.push("Udemy.com");
		stack.push("Discord.com");
		stack.printElements();
		System.out.println("Size of stack " + stack.size);
		System.out.println("Peek :: " + stack.peek().item);

		System.out.println("=======Perform pop ===========");
		stack.pop();
		stack.printElements();

		System.out.println("=======Perform pop ===========");
		stack.pop();
		stack.printElements();

		System.out.println("=======Perform pop ===========");
		stack.pop();
		stack.printElements();

	}
}

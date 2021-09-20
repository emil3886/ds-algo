package com.emil.org.ds.algo.linkedlist;

//sample linkedlist - doubly linked
public class Example1<E> {

	Node<E> head;
	Node<E> tail;
	int size = 0;

	public Example1() {

	}

	public boolean add(E item) {
		addNode(item);
		return true;
	}

	public void addFirst(E item) {
		if (head == null) {
			addNode(item);
		} else {
			Node<E> prevHead = head;
			final Node<E> newNode = new Node<>(null, item, prevHead);
			prevHead.prev = newNode;
			head = newNode;
			size++;
		}
	}

	public void printElements() {
		Node<E> currentNode = head;

		while (currentNode != null) {
			System.out.println(currentNode.item);
			currentNode = currentNode.next;
		}

	}

	public void addLast(E item) {
		if (tail == null) {
			addNode(item);
		} else {
			Node<E> prevTail = tail;
			final Node<E> newNode = new Node<>(prevTail, item, null);
			prevTail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	public void set(int index, E item) {
		checkIndex(index);
		Node<E> currentNode = head;
		int nodeCount = 0;
		while (true) {
			if (nodeCount == index) {
				Node<E> prevNode = currentNode.prev;
				Node<E> newNode = new Node<>(currentNode.prev, item, currentNode);
				if (index != 0) {
					prevNode.next = newNode;
				} else {
					head = newNode;
				}
				currentNode.prev = newNode;
				break;
			} else {
				currentNode = currentNode.next;
				nodeCount++;
			}

		}
		size++;
	}

	public void reverse() {

		if (size == 1) {
			return;
		}

		int lenght = size;
		Node<E> currentNode = tail;
		Node<E> nextNode = currentNode.prev;
		head = currentNode;
		head.prev = null;

		while (nextNode.prev != null) {
			Node<E> tmp = nextNode;
			Node<E> tmp2 = nextNode.prev;
			currentNode.next = nextNode;
			nextNode.prev = currentNode;
			nextNode.next = tmp2;
			currentNode = tmp;
			nextNode = tmp2;
			lenght--;
			if (lenght == 0) {
				break;
			}
		}

		tail = nextNode;
		tail.next = null;

	}

	private void checkIndex(int index) {
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException("Exceeds size");
		}
	}

	public void remove(int index) {
		checkIndex(index);
		Node<E> currentNode = head;
		int nodeCount = 0;
		while (true) {
			if (nodeCount == index) {
				Node<E> prevNode = currentNode.prev;
				Node<E> nextNode = currentNode.next;
				if (index != 0) {
					prevNode.next = nextNode;
					nextNode.prev = prevNode;
				} else {
					head = nextNode;
					nextNode.prev = null;
				}

				break;
			} else {
				currentNode = currentNode.next;
				nodeCount++;
			}

		}
		size--;
	}

	private void addNode(E item) {
		final Node<E> l = tail;
		final Node<E> newNode = new Node<>(l, item, null);
		tail = newNode;
		if (l == null)
			head = newNode;
		else
			l.next = newNode;
		size++;

	}

	private static class Node<E> {
		E item;
		Node<E> next;
		Node<E> prev;

		Node(Node<E> prev, E item, Node<E> next) {
			this.prev = prev;
			this.item = item;
			this.next = next;

		}

	}

	public static void main(String[] args) {
		Example1<String> myLinkedList = new Example1<>();
		myLinkedList.add("Hello");
		myLinkedList.add("World");
		myLinkedList.add("!!");
		myLinkedList.addFirst("Added head");
		myLinkedList.addLast("TheEnd");
		myLinkedList.set(0, "Added at index 0");
		myLinkedList.set(2, "Added at index 2");

		myLinkedList.remove(2);
		myLinkedList.remove(0);
		System.out.println("Size : " + myLinkedList.size);

		myLinkedList.printElements();
		System.out.println("===================Reverse===============");
		myLinkedList.reverse();
		myLinkedList.printElements();

	}

}

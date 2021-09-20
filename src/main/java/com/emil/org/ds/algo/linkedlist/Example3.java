package com.emil.org.ds.algo.linkedlist;

//implement Queue
//enqueue/dequeue/peek methods
// wait listed apps, like printer,ticket booking
public class Example3<E> {

	Node<E> first;
	Node<E> last;
	int lenght;

	private static class Node<E> {

		E item;
		Node<E> next;

		Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}

		Node(E item) {
			this.item = item;
		}

	}

	public Node<E> peek() {
		return this.first;
	}

	public void enqueue(E item) {
		Node<E> val = new Node<>(item);

		if (lenght == 0) {
			first = val;
			last = val;
		} else {
			last.next = val;
			last = val;
		}

		lenght++;
	}

	public void dequeue() {
		if (lenght == 0) {
			throw new ArrayIndexOutOfBoundsException("Queue is empty");
		}

		if (last == first) {
			last = null;
			first = null;
		} else {
			Node<E> firstEle = this.first.next;
			this.first = firstEle;
			firstEle = null;

		}
		lenght--;
	}

	public void printElements() {

		Node<E> currentElement = first;

		while (currentElement != null) {
			System.out.println(currentElement.item);
			currentElement = currentElement.next;
		}
	}

	public static void main(String[] args) {
		Example3<String> queue = new Example3<>();
		queue.enqueue("Emil");
		queue.enqueue("Renc");
		queue.enqueue("Juju");

		System.out.println("Queue element : ");
		queue.printElements();

		System.out.println("=====peek=====" + queue.peek().item);
		System.out.println("===Dequeue====");
		queue.dequeue();
		queue.printElements();

		System.out.println("===Dequeue====");
		queue.dequeue();
		queue.printElements();

		System.out.println("===Dequeue====");
		queue.dequeue();
		queue.printElements();

	}

}

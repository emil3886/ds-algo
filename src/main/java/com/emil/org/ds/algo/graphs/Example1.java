package com.emil.org.ds.algo.graphs;

import java.util.HashMap;
import java.util.Map;

public class Example1<E> {

	int numberOfNodes;

	static class Node<E> {
		E item;
		Map<E, E> adjacentNodes;

		public Node(E item) {
			this.item = item;
			adjacentNodes = new HashMap<>();
		}

	}

}

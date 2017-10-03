package com.jbohn.quiz;

public class Node {
	private int data;
	private Node next;

	public Node(int data, Node node) {
		this.data = data;
		next = node;
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(final Node next) {
		this.next = next;
	}

}

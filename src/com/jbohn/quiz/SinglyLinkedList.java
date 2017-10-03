package com.jbohn.quiz;

public class SinglyLinkedList {


	private Node head = null;
	private Node tail = null;
	private int size = 0;

	public int size() {
		return size;
	}

	public void printList() {
		System.out.print("List:");
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.getData() + " ");
			tnode = tnode.getNext();
		}
	}

	public void add(int d) {
		this.addLast(d);
	}

	public void addFirst(int d) {
		head = new Node(d, head);
		if (size == 0) {
			tail = head;
		}
		size++;
	}

	public void addLast(int d) {
		Node newNode = new Node(d, null);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.setNext(newNode);
		}
		tail = newNode;
		size++;
	}

	public void removeFirst() {
		if (isEmpty()) {
			return;
		}
		head = head.getNext();
		size--;
		if (size == 0) {
			tail = null;
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void removeLast() {
		if (tail == null) {
			return;
		} else {
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				Node previousToTail = head;
				while (previousToTail.getNext() != tail) {
					previousToTail = previousToTail.getNext();
				}
				tail = previousToTail;
				tail.setNext(null);
			}
		}
	}

	public void clear() {
		Node node;
		for (Node node1 = this.head; node1 != null; node1 = node) {
			node = node1.getNext();
			node1.setNext(null);
		}
		this.head = this.tail = null;
		this.size = 0;
	}


}
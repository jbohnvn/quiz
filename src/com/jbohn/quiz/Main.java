package com.jbohn.quiz;

public class Main {

	public static void main(String[] args) {

		System.out.println("Print intilize list");
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.add(1);
		singlyLinkedList.add(4);
		singlyLinkedList.add(2);
		singlyLinkedList.add(5);
		singlyLinkedList.printList();

		System.out.println("");
		System.out.println("Print list after remove last node:");
		singlyLinkedList.removeLast();
		singlyLinkedList.printList();

		System.out.println("");
		System.out.println("Print list after remove all node:");
		singlyLinkedList.clear();
		singlyLinkedList.printList();
	}
}

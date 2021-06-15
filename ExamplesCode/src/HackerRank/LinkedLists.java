package HackerRank;

import java.util.Iterator;

public class LinkedLists {

	static class SinglyLinkedListNode {
		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}

		int data;
		SinglyLinkedListNode next;
	}

	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

		SinglyLinkedListNode node = new SinglyLinkedListNode(data);

		if (head == null)
			return node;

		if (position == 0) {
			node.next = head;
			return node;
		}

		SinglyLinkedListNode curr = head;

		for (int i = 0; i < position - 1 && curr.next != null; i++)
			curr = curr.next;

		node.next = curr.next;
		curr.next = node;

		return head;

	}

}

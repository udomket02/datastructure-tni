package lab;


class Node {
	public int  data;
	public Node next;
	
	public Node(int value) {
		this.data = value;
		this.next = null;
	}
}

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	
	public String displayList() {
		boolean first = true;
		String  display = "[";
		for (Node current = head; current != null; current = current.next) {
			display += (!first ? ", " : "") + current.data;
			first = false;
		}
		display += "]";
		return display;
	}
	
	public void clear() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
        
		return head == null;
	}
	
	public void append(int value) {
		Node new_node = new Node(value);
		if (isEmpty()) {
			head = new_node;
			tail = new_node;
		} else {
			tail.next = new_node;
			tail = new_node;
		}

	}
	
	public Object get(int position) {
		if (position < 0 || isEmpty()) {
			return null;
		}
		Node current = head;
		int num = 0;
		while (current != null) {
			if (num == position) {
				return current.data;
			}
			current = current.next;
			num++;
		}
		return null;
	}
	
	public void set(int position, int value) {
		int  index = 0;
		Node current = head;
 
		while (current != null) {
			if (index == position) {
				current.data = value;
				System.out.println("Updated data success!!");
				return;
			}
			current = current.next;
			index++;
		}
 
		System.out.println("Updated data fail...");
	}
	
	public boolean contains(int value) {
		for (Node current = head; current != null; current = current.next) {
			if (current.data == value) {
				return true;
			}
		}
 
		return false;
	}
	
	
	public void addAll(SinglyLinkedList otherlist) {
		if (otherlist.isEmpty()) {
			return;
		}
 
		if (this.isEmpty()) {
			this.head = otherlist.head;
			this.tail = otherlist.tail;
		} else {
			this.tail.next = otherlist.head;
			this.tail = otherlist.tail;
		}
	}
	
}

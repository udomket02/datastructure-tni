public class StackLinkedList {

	// pointer to the top node
	private Node top;

	// create an empty stack
	public StackLinkedList() {
		top = null;
	}
	
	public boolean isEmpty() { //O(1)
		return top == null;
	}
	
	public void push(int value) {  //O(1)
		Node new_node = new Node(value);
		if (isEmpty()) {
			top = new_node;
		} else {
			new_node.next = top;
			top = new_node;
		}
	}
	
	public int peek() { //O(1)
		if (!isEmpty()) {
			return top.data;
		}
		return -1;
	}
	
	public int pop() { //O(1)
		if (!isEmpty()) {
			Node temp_node = top;
			int temp_data = temp_node.data;
			top = top.next;
			temp_node = null;
			return temp_data;
		}
		return -1;
	}
	

}
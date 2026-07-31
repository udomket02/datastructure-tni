public class StackArrayBased {

	private int[] stacks; // array to store elements
	private final int MAX_STACK = 50; // maximum size of stack
	private int top; // index of the top element

	// create an empty stack with a maximum size
	public StackArrayBased() {
		stacks = new int[MAX_STACK];
		top = -1;
	}

	// create an empty stack with a specific size
	public StackArrayBased(int capacity) {
		stacks = new int[capacity];
		top = -1;
	}

	public boolean isEmpty() { // O(1)
		return top == -1;
	}

	public boolean isFull() { // O(1)
		return top == stacks.length - 1;
	}

	public boolean push(int new_element) { // O(1)
		if (!isFull()) {
			stacks[++top] = new_element;
			return true;
		}
		return false;
	}

	public int peek() { //O(1)
		if (!isEmpty()) {
			return stacks[top];
		}
		return -1;
	}

	public int pop() { //O(1)
		if (!isEmpty()) {
			return stacks[top--];
		}
		return -1;
	}
	
	public void popAll() { //O(1)
		stacks = new int[MAX_STACK];
		top = -1;
	}

}

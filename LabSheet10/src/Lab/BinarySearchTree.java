package Lab;

public class BinarySearchTree {

	private Node root;
	private Node parent;
	private Node deleteNode;

	public boolean isEmpty() {
		return root == null;
	}

	public void sampleTree1() {
		int[] nums = { 20, 10, 60, 7, 11, 30, 65, 3, 40 };

		for (int num : nums) {
			insert(num);
		}
	}

	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}

	public Node getRoot() {
		return root;
	}

	public Node getParent() {
		return parent;
	}

	public Node getDeleteNode() {
		return deleteNode;
	}

	public void insert(int new_data) {
		if (root == null) {
			root = new Node(new_data);
		} else {
			Node current_node = root;
			while (true) {
				if (new_data < current_node.data) {
					if (current_node.left == null) {
						current_node.left = new Node(new_data);
						break;
					}
					current_node = current_node.left;
				} else if (new_data > current_node.data) {
					if (current_node.right == null) {
						current_node.right = new Node(new_data);
						break;
					}
					current_node = current_node.right;
				}

			} // end while
		} // end if
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////

	public int findMinimum(Node root) {

		if (isEmpty()) {
			return -1;
		} else {
			Node current_node = root;
			if (current_node.left == null) {
				return root.data;
			} else {
				while (current_node.left != null) {
					current_node = current_node.left;
					if (current_node.left == null) {
						return current_node.data;
					}
				}
			}
		}
//				while (current_node != null) {
//					current_node = current_node.left;
//					if (current_node.left == null) {
//						return current_node.data;
//					}
//				}
//			}
//		}

		return -1;
	}

	public int findMaximum(Node root) {
		if (isEmpty()) {
			return -1;
		} else {
			Node current_node = root;
			if (current_node.right == null) {
				return root.data;
			} else {
				while (current_node.right != null) {
					current_node = current_node.right;
					if (current_node.right == null) {
						return current_node.data;
					}
				}
			}
		}

		return -1;
	}

	//// Homework
	public boolean findSpecificData(int target) {
		Node current_node = root;
		while (true) {
			if (target == current_node.data) {
				return true;
			} else if (current_node.left == null && current_node.right == null) {
				return false;
			}
			if (target < current_node.data) {
				current_node = current_node.left;
			} else {
				current_node = current_node.right;
			}
		}

	}

	public void searchDeleteNode(int target) {
		parent = root;
		Node current_node = root;
		while (true) {
			if (target == current_node.data) {
				deleteNode = current_node;
				break;
			}
			parent = current_node;
			if (target < current_node.data) {
				current_node = current_node.left;
			} else {
				current_node = current_node.right;
			}
		}
	}

	public void delete(int target) {
		searchDeleteNode(target);
		if (isEmpty()) {
			System.out.println("Empty Tree");
		} else if (deleteNode == null) {
			System.out.println("Cannot found the delete node");
		} else {
			// case 1: Delete Leaf Node
			if (deleteNode.left == null && deleteNode.right == null) {
				if (deleteNode.data < parent.data) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			}
			// case 2: Delete node with 2 children
			else if (deleteNode.left != null && deleteNode.right != null) {
				deleteByLeftSuTree();
				// deleteByRightSuTree();
			}
			// case 3: Delete node with 1 child
			else {
				if (deleteNode.left != null) { // has a left-child
					if (deleteNode.data < parent.data) {
						parent.left = deleteNode.left;
					} else {
						parent.right = deleteNode.left;
					}
				} else { // has a right-child
					if (deleteNode.data < parent.data) {
						parent.right = deleteNode.right;
					} else {
						parent.right = deleteNode.right;
					}
				}
			}
		}
	}

	public void deleteByLeftSuTree() {
		Node targetNode = deleteNode;
		int maxValue = findMaximum(deleteNode.left);
		delete(maxValue);
		targetNode.data = maxValue;
	}

	public void deleteByRightSuTree() {
		Node targetNode = deleteNode;
		int minValue = findMinimum(deleteNode.right);
		delete(minValue);
		targetNode.data = minValue;
	}

}

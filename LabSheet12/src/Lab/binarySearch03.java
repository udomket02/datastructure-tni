package Lab;

import java.util.*;

public class binarySearch03 {

	public static ArrayList<Integer> traversal(Node root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Deque<Node> stack = new ArrayDeque<Node>();

		Node current_node = root;

		while (!stack.isEmpty() || current_node != null) {
			while (current_node != null) {
				stack.push(current_node);
				current_node = current_node.left;
			}
			current_node = stack.pop();
			list.add(current_node.data);
			current_node = current_node.right;
		}
		return list;
	}

	public static int binarySearch(int[] nums, int target) {
		int Low = 0;
		int high = nums.length - 1;

		while (Low <= high) {
			int middle = (Low + high) / 2;
			if (nums[middle] == target) {
				return middle;
			}
			if (target < nums[middle]) {
				high = middle - 1;
			} else {
				Low = middle + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree();
		tree.printTree(tree.getRoot(), 0);

		ArrayList<Integer> num = traversal(tree.getRoot());
		System.out.println("\nTraversal order : " + num);

		int[] nums = new int[num.size()];

		for (int i = 0; i < num.size(); i++) {
			nums[i] = num.get(i);
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter target: ");
		int target = sc.nextInt();

		int index = binarySearch(nums, target);

		if (index != -1)
			System.out.println("The target (" + target + ") at index " + index);
		else
			System.err.println("Cannot found " + target + " in this tree");
		
		sc.close();
	}
}

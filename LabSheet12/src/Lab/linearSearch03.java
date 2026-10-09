package Lab;

import java.util.*;

public class linearSearch03 {

	public static ArrayList<Integer> traversal(Node root) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		if (root != null) {
			Queue<Node> queue = new ArrayDeque<Node>();
			queue.add(root);

			while (!queue.isEmpty()) {

				int levelSize = queue.size();

				for (int i = 0; i < levelSize; i++) {
					Node current_node = queue.poll();
					if (current_node.left != null) {
						queue.add(current_node.left);
					}
					if (current_node.right != null) {
						queue.add(current_node.right);
					}
					list.add(current_node.data);
				}

			}

		}
		return list;
	}

	public static int linearSearch(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree();
		tree.printTree(tree.getRoot(), 0);

		ArrayList<Integer> list = traversal(tree.getRoot());
		System.out.println("\nTraversal order : " + list);

		int[] nums = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Target: ");
		int target = sc.nextInt();

		int index = linearSearch(nums, target);
		if (index != -1) {
			System.out.print("The target (" + target + ") at index " + index);
		} else {
			System.err.print("Cannot found " + target + " in this tree");
		}
		
		sc.close();

	}

}

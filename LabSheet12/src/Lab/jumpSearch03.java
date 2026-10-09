package Lab;
import java.util.*;

public class jumpSearch03 {

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

    public static int jumpSearch(int[] nums, int target) {
    	int jump_size = (int) Math.floor(Math.sqrt(nums.length));
		int start = 0;
		int m = 0;
		while (m == nums[m]) {
			if (target == nums[m]) {
				return m;
			}
			if (target > nums[m]) {
				start = m;
				m += jump_size;
			} else {
				for (int i = start; i < m; i++)
					if (target == nums[i])
						return i;
			}
		}
		for (int i = start; i < nums.length; i++)
			if (target == nums[i])
				return i;
		return -1;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.sampleTree();
        tree.printTree(tree.getRoot(), 0);

        ArrayList<Integer> num = traversal(tree.getRoot());
        System.out.println("Traversal order : " + num);

        int[] nums = new int[num.size()];

		for (int i = 0; i < num.size(); i++) {
			nums[i] = num.get(i);
		}

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = jumpSearch(nums, target);

        if (index != -1)
            System.out.println("The target (" + target + ") at index " + index);
        else
            System.err.println("Cannot found " + target + " in this tree");
        
        sc.close();
    }
}

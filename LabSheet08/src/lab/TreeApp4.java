package lab;

import java.util.Scanner;

public class TreeApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree tree6 = new BinaryTree();
		tree6.createTree6();
		tree6.printTree(tree6.getRoot(), 0);

		Scanner sc = new Scanner(System.in);

		System.out.print("\nInput number : ");
		int N = sc.nextInt();

		tree6.searchDeleteNode(N);
		Node FoundN = tree6.getDeleteNode();

		if (FoundN == null) {
			System.out.println("Cannot found Node(data=[" + N + "])");
		} else {
			if (FoundN.left != null) {
				System.out.println("Left Child is : " + FoundN.left.data);
			} else {
				System.out.println("No Left Child");
			}
			
			if (FoundN.right != null) {
				System.out.println("Right Child is : " + FoundN.right.data);
			} else {
				System.out.println("No Right Child");
			}
			
			if (FoundN.left == null && FoundN.right == null) {
				System.out.println(N + " is Leaf Node");
			} else {
				System.out.println(N + " is not Leaf Node");
			}

		}

	}

}

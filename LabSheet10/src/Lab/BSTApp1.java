package Lab;

public class BSTApp1 {

	public static void main(String[] args) {
	
		System.out.println("---------------------------------------------------");
		System.out.println("Binary Search Tree from sampleTree1()");
		System.out.println("---------------------------------------------------");
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("---------------------------------------------------");
		System.out.println("sampleTree1() : Minimum Node is " + tree.findMinimum(tree.getRoot()));
		System.out.println("---------------------------------------------------");
		System.out.println("sampleTree1() : Maximum Node is " + tree.findMaximum(tree.getRoot()));
		System.out.println("---------------------------------------------------");
		
		int deLNode = 7;
		tree.searchDeleteNode(deLNode);
		System.out.println("Parent is " + tree.getParent().data);
		System.out.println("Delete Node is " + tree.getDeleteNode().data);
		System.out.println("is 40 in BST => " + tree.findSpecificData(40));
		System.out.println("is 15 in BST => " + tree.findSpecificData(15));
		
		System.out.println("---------------------------------------------------");
		tree.delete(40);
		tree.printTree(tree.getRoot(), 0);
		
		
	}

}


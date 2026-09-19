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
		
		int target = 15; 
		System.out.println("Is " + target + " in BST => " + tree.findSpecificData(target));
		
		int deLNode = 60;
		tree.searchDeleteNode(deLNode);
		System.out.println("Parent is " + tree.getParent().data);
		System.out.println("Delete Node is " + tree.getDeleteNode().data);
		
		
		System.out.println("---------------------------------------------------");
		tree.delete(deLNode);
		tree.printTree(tree.getRoot(), 0);
		
		
	}

}


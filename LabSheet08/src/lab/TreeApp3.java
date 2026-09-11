package lab;

public class TreeApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------------");
		System.out.println("Binary Tree from createTree5()");
		System.out.println("---------------------------------------------------");
		
		BinaryTree tree5 = new BinaryTree();
		tree5.createTree5();
		tree5.printTree(tree5.getRoot(), 0);

		//delete Leaf
		tree5.delete(25);
		System.out.println("---------------------------------------------------");
		tree5.printTree(tree5.getRoot(), 0);

	}

}

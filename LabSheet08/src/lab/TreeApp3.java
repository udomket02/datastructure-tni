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

		// delete Leaf
		System.out.println("---------------------------------------------------");
		System.out.println("Delete Leaf Node 25");
		System.out.println("---------------------------------------------------");
		tree5.delete(25);
		tree5.printTree(tree5.getRoot(), 0);

		// delete Node have Child Node 1 
		System.out.println("---------------------------------------------------");
		System.out.println("Delete Node have one child node 10");
		System.out.println("---------------------------------------------------");
		tree5.delete(10);
		tree5.printTree(tree5.getRoot(), 0);

		// delete Node have Child Node 2
		System.out.println("---------------------------------------------------");
		System.out.println("Delete Node have two child node 60");
		System.out.println("---------------------------------------------------");
		tree5.delete(60);
		tree5.printTree(tree5.getRoot(), 0);
		
	}

}

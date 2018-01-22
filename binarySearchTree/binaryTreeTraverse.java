package binarySearchTree;

public class binaryTreeTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree( 20 );
		int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
		for(int i : nums ) {
		tree.addNode( i );
		}
		
		System.out.println("preorder");
		tree.traversePreOrder();
		
		System.out.println();
		System.out.println("inorder");
		tree.traverseInOrder();
		
		System.out.println();
		System.out.println("postorder");
		tree.traversePostOrder();

	}

}

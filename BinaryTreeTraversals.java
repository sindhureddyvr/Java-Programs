
public class BinaryTreeTraversals {

	static void preOrder(TNode root) {
		 if (root == null)
	            return;
		System.out.print(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	static void InOrder(TNode root) {
		 if (root == null)
	            return;
		 InOrder(root.left);
		System.out.print(root.data);
		InOrder(root.right);
	}

	static void postOrder(TNode root) {
		 if (root == null)
	            return;
		 postOrder(root.left);
		 postOrder(root.right);
		System.out.print(root.data);
	}

	public static void main(String[] args) {
		TNode root = new TNode(4);
		root.left = new TNode(2);
		root.right = new TNode(5);
		root.left.right = new TNode(3);
		root.left.left = new TNode(1);
		System.out.println("PreOrder");
        preOrder(root);
        System.out.println("\n"+"InOrder");
        InOrder(root);
        System.out.println("\n"+"PostOrder");
        postOrder(root);
        
	}

}

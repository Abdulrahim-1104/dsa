package DataStructureAndAlgorithm;

public class doop {
	public static void main(String args[]) {
		doopBinaryTree tree = new doopBinaryTree(0);
	/*	tree.insertLeft(tree.root, 1); 
		tree.insertRight(tree.root, 2);      
		tree.insertLeft(tree.root.left, 3);   
		tree.insertRight(tree.root.left, 4);  
		tree.insertLeft(tree.root.right, 5);  
		tree.insertRight(tree.root.right, 6); 
		tree.preorder(tree.root); 
		System.out.println("");
		tree.inorder(tree.root);
		System.out.println("");
		tree.postorder(tree.root);*/
		tree.insertloop(tree.root, 1);
	    tree.insertloop(tree.root, 2);
	    tree.insertloop(tree.root, 3);
	    tree.insertloop(tree.root, 4);
		tree.preorder(tree.root); 
		System.out.println("");
		if(tree.searchloop(tree.root, 6)==null) {
		System.out.println("Is not found");	
		}
		else {
			System.out.println("Is found");
		}
		
	  
	}

} 
 
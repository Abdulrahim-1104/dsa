package DataStructureAndAlgorithm;

public class AvlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvlTree avl = new AvlTree(6); 
		avl.insert(4);
		avl.insert(8);
		avl.insert(98);
		avl.insert(23);
		avl.insert(46); 
		avl.inorder(avl.root); 
		

	}

}

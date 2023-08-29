package DataStructureAndAlgorithm;
import java.util.*;
public class bstMain {
 public static void main(String args[]) {
	 Scanner scn = new Scanner(System.in);
	 binarySearchTree bst = new binarySearchTree(5);
	 bst.insert(1);
	 bst.insert(2); 
	 bst.insert(3);
	 bst.insert(4);
	 bst.insert(6);
	 bst.insert(7);
	 bst.insert(8); 
	 bst.insert(9);
	 bst.insert(10);
	 bst.inorder(bst.root); 
	 
	 System.out.println("");
	 System.out.println("Enter a value to search");
	 int n=scn.nextInt();
	if( bst.search(bst.root, n)==null) { 
		System.out.println(n+" Is Not  Found");   
	} 
	else {
		System.out.println(n+ " Is  Found"); 
	}
	scn.close();
	bst.delete(bst.root, 7);       
	System.out.println("");
	bst.inorder(bst.root);  
 }

}

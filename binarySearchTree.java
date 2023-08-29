package DataStructureAndAlgorithm;

public class binarySearchTree {
	node root;
	class node{
		int key;
		node left;
		node right; 
		node(int val){
			this.key=val; 
			left=right=null; 
		}
	}
	binarySearchTree(int val){ 
		root = new node(val);
	}
	binarySearchTree(){
		root=null;
	} 
	public void insert(int val) {  
		root=insert(root,val);   
	} 
	public node insert(node r,int val) {  
 		if(r==null) {  
			return new node(val); 
		}
		if(val<r.key) { 
			r.left=insert(r.left,val);
		} 
		else {
			r.right= insert(r.right,val); 
 		}
		return r; 
	}
	public void inorder(node r) {
		if(r==null) {  
			return; 
		}
		inorder(r.left);
		System.out.print(r.key+" ");  
		inorder(r.right);  
	}
	public node search(node r,int val) {
		if(r==null||r.key==val) { 
			return  r;
		} 
		if(val<r.key) { 
		   	 r= search(r.left,val);    
		} 
			else{   
			r=	search(r.right,val);    
			}
		return r;
	} 
 public node delete(node r,int k) {  
	 if(r==null) {  
		 return  r; 
	 }     
	 if(k<r.key) { 
		 r.left=delete(r.left,k); 
		  
	 }
	 else if(k>r.key) {
		r.right= delete(r.right,k); 
	 } 
	 else {
		 if(r.left==null) { 
			 return r.right;  
		 }
		 else  if(r.right==null) {  
			 return r.left;
		 }
		 else { 
		 r.key=mini(r.right); 
		 r.right=  delete(r.right,r.key);   
		 }
	 }    
	 return r; 

 }
 public int  min(node r) { 
	 int min=r.key;
	while(r.left!=null) { 
		min=r.left.key;  
		r=r.left;   
	}
	return min;  
 }
 public int mini(node r) {
	 int prev=r.key; 
	 if(r.left==null) {   
		 return prev;   
	 }  
	return prev=mini(r.left);       
 }
 
}

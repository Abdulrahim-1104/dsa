package DataStructureAndAlgorithm;

public class doopBinaryTree {
	node root;
 class node{
	 int data;
	 node left;
	 node right; 
	 node(int d){
		 this.data=d;
	 } 
 }
 doopBinaryTree(int d){
	 root=new node(d);
 } 
 public void insertLeft(node r,int d) {
	 node newnode = new node(d); 
	 r.left=newnode;  
 }
 public void insertRight(node r,int d) {
	 node newnode=new node(d);
	 r.right=newnode; 
 }
 public void preorder(node r) {
	 if(r==null) {
	 return; 
	 } 
	 System.out.print(r.data+" ");  
		 preorder(r.left);
		 preorder(r.right); 
	 }
 public void inorder(node r) {
	 if(r==null) {  
	 return; 
	 }
		 inorder(r.left);
		 System.out.print(r.data+" "); 
		 inorder(r.right); 
	 }
 public void postorder(node r) {
	 if(r==null) {
	 return; 
	 }

		 postorder(r.left);  
		 postorder(r.right); 
		 System.out.print(r.data+" "); 
	 }
 public node insertloop(node r,int k) {
	 node current=r; 
	 node prev=null;
	 if(root==null) {
		 return new node(k);
	 } 
while(current!=null) {
	prev=current;
	if(k<current.data) {
		current=current.left;
	}
	else {
		current=current.right;
	}
	}
if(k<prev.data) {
	prev.left=new node(k); 
}
else {
	prev.right=new node(k);
}
return r;
}
 public node searchloop(node r,int k) {
	 while(r!=null) {
		 if(k<r.data) {
			 r=r.left; 
		 }
	 else if(k>r.data) {
		 r=r.right;
	 }
	 else {
		 return r;
	 } 
 }
	 return r;
}
}
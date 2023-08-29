package DataStructureAndAlgorithm;
public class AvlTree {
	node root;
	class node{ 
		int key;
		int height;
		node left;
		node right;
		node(int val){ 
			this.key=val;
			height=0;
			left=null;
			right=null;
		}
	} 
	AvlTree(int val){
		root=new node(val);
	}
	public node insert(node n,int val) {
		if(n==null) { 
			return new node(val);
		}
		if(val<n.key) {
			n.left=insert(n.left,val);
		}
		else if(val>n.key) {
			n.right=insert(n.right,val);
		} 
	 	else
			return n; 
		 
		n.height=1+max(getHeight(n.left),getHeight(n.right)); 
		int balance=getBalance(n);     
		//LL
		if(balance>1&&val<n.left.key) { 
			return rightRotate(n);  
		}
		//LR
		if(balance>1&&val>n.left.key) { 
			n.left=leftRotate(n.left);
			return rightRotate(n); 
		}
		//RR
		if(balance<-1&&val>n.right.key) {
			return leftRotate(n); 
		} 
		//RL
		if(balance<-1&&val<n.right.key) {
			n.right=rightRotate(n.right);
			return leftRotate(n);
		}  
		return n;
	} 
	public int getHeight(node n) {  
		if(n==null) {
			return-1;
		}
		return n.height;    
	}
	public int max(int l,int r) { 
		return l>r?l:r;   
	} 
	public int getBalance(node n) {    
		if(n==null) {
			return 0;
		} 
		return getHeight(n.left)-getHeight(n.right);  
	}
	public node leftRotate(node z) {
		node y=z.right;   
		node t4=y.left;  
		y.left=z;  
		z.right=t4;
		z.height=1+max(getHeight(z.left),getHeight(z.right));  
		y.height=1+max(getHeight(y.left),getHeight(y.right));  
		return y;
	}
	public node rightRotate(node z) {
		node y=z.left;  
		node t2=y.right;   
		y.right=z;   
		z.left=t2;  
		z.height=1+max(getHeight(z.left),getHeight(z.right));  
		y.height=1+max(getHeight(y.left),getHeight(y.right));  
		return y;
	} 
	public void inorder(node r) {
		if(r==null) {  
			return; 
		}
		inorder(r.left);
		System.out.println(r.key+" "+r.height+" ");    
		inorder(r.right);  
	} 
	public void insert(int val) {
		root=insert(root,val);
	}

}
 
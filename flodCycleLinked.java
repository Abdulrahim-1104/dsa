package DataStructureAndAlgorithm;
public class flodCycleLinked {
	node last;
	class node{
		int data;
		node next;
		 node(int val) {
			data=val;
			next=null;
		}
	}
	 flodCycleLinked(){
		last=null;
	}
	public void insertAtBegninng(int val) {
		node newnode = new node(val);
		if(last==null) {
			newnode.next=newnode;
			 last=newnode;
		}
	       	else {
	       		newnode.next=last.next;
	       		last.next=newnode;
	       		}
}
	public void display() {
		node temp=last.next;
		do {
			System.out.print(temp.data + " ");
			temp=temp.next; 
			
		}while(temp!=null);
	}
	public boolean hasCycle() {
		node slow=last.next;
		node fast=last.next;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
				return true;
		}
		return false;
		 
	}
	public int returnStartingCycle() {
		node slow=last.next;
		node fast=last.next;
		while(fast!=null&&fast.next!=null) { 
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				slow=last.next;
				fast=last.next;
				while(fast!=slow) {
					slow=slow.next; 
					fast=fast.next;
				}
				if(slow==fast)
					return slow.data;
			} 
			    
		}
		Integer Null = (Integer)null;
		 return  Null;
	}   
}
package DataStructureAndAlgorithm;

public class circularLinkedList {
	node last;
	class node{
		int data;
		node next;
		 node(int val) {
			data=val;
			next=null;
		}
	}
	circularLinkedList(){
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
		do{ 
			System.out.print(temp.data+ " ");
			temp=temp.next;
		
	} while(temp!=last.next); 
}
	public void insertAtend(int val) {
		node newnode = new node(val);
		if(last==null) {
			newnode.next=newnode;
			last=newnode;
		}
	       	else {
	       		newnode.next=last.next;
	       		last.next=newnode;
	       		last=newnode;
	       		} 
		}
	public void deleteAtEnd() {
		node temp=last.next;
		while(temp.next!=last) {
			temp=temp.next;
		}
		temp.next=temp.next.next; 
		last=temp;
	}
	public void deleteAtval(int val) { 
	node temp=last.next;
	node prev=null;  
	if(last.next.data==val) {
		last.next=last.next.next;
	}
	else {
while(temp.next!=last){  
 		prev=temp;  
		if(temp.next.data==val) {  
			prev.next=temp.next.next;  
		   }
		temp=temp.next; 
     	}
	}
if(last.data==val) {
	last=prev.next; 
	last.next=last.next.next;
}
 }
	public void inserAfter(int afterval,int val) { 
		node temp=last.next; 
		node newnode = new node(val);
		if(last.next.data==afterval) { 
		newnode.next=last.next.next;
		last.next.next=newnode; 	
		} 
		while(temp.next!=last) { 
			if(temp.next.data==afterval) {   
				newnode.next=temp.next.next;     
				 temp.next.next=newnode;   
			}  
			temp=temp.next; 
		}
		if(last.data==afterval) {
		 newnode.next=last.next;
		  last.next=newnode;    
		  last=newnode;
		}
	}
 }
 
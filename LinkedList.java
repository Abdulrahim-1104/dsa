package DataStructureAndAlgorithm;
public class LinkedList {
	class node{
		int data;
		node next;
		node(int val){
			data=val;
			next=null;
		}
	}
	node head;
	public LinkedList(){
		head=null;
	}
public void insertAtBegning(int val){ 
			node newnode = new node(val);
			if(head==null) 
				head = newnode;   
			else {
				newnode.next=head;  
				head=newnode; 
			}
	}
public void display() {
	node temp = head; 
	while(temp!=null) {
		System.out.print(temp.data + " ");
		temp = temp.next;  
		}
      }
public void insertAtPosititon(int pos,int val) {
	node newnode = new node(val);
	node temp=head;
	for(int i=1;i<pos;i++) { 
	temp=temp.next;
	} 
	newnode.next=temp.next;
	temp.next=newnode; 
}
public void deleteAtPos(int pos) {
	node temp = head;
	node prev = null;
	if(head == null) {
		System.out.println("List Is Empty");
		return;
	}
	else {
		for(int i=1;i<=pos;i++) {
			prev = temp;
			temp= temp.next;
			}
		prev.next=temp.next;
		
	}
}
public void getIndex(int pos) {
	node temp=head;
	for(int i=1;i<=pos;i++) {
		temp=temp.next;
	}
      System.out.println(temp.data);
}
public void update(int pos,int val) {
	node temp = head; 
	for(int i=1;i<=pos;i++) { 
		temp=temp.next;
	} 
	temp.data=val;   
	}
public void deleteAtEnd() {
	 node temp=head;
	 node prev=null;
	 while(temp.next!=null) {
		 prev=temp; 
	  temp=temp.next;
	 
	   }
	 prev.next=null;
		}
public void insetAtEnd(int val) {
	node temp=head;
	node newnode = new node(val);
	while(temp.next!=null) {
		temp=temp.next;
	} 
	temp.next=newnode;
	newnode=null;
}
public void search(int val) {
	node temp = head;
	boolean bool = false; 
for(int i=0;temp!=null;i++) { 
	
	if(temp.data==val) { 
		bool=true;
		System.out.println("The Index Of " +  val +" Is "+i);
	}
	temp=temp.next; 
	
}
if(bool==false)
		System.out.println(val + " No Such Element");
   }
public boolean contain(int val) {
	node temp = head;
	while(temp!=null) {
		if(temp.data==val)
			return true;
		temp=temp.next;
	}
	return false;  
}
public void reverse() { 
	node next=head.next;
	node current = head; 
	node prev=null; 
	while(current!=null) { 
		next=current.next;   
		current.next=prev;  
		prev=current; 
		current=next;
	 } 
	 head=prev;	
}
public int length() {
	node temp=head;
	int length=1;
	while(temp.next!=null) {
		temp=temp.next;
		length++;
	}
	return length;
}
 }
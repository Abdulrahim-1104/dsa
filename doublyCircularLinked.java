package DataStructureAndAlgorithm;

public class doublyCircularLinked {
	node last;
	class node{
		node prev;
		node next;
		int data;
		node(int val){
		data=val;
			prev=null;
			next=null;
		}
	} 
	doublyCircularLinked(){
		last=null;
	} 
	public void insertAtBeg(int val) {
  		node newnode = new node(val); 
		if(last==null) { 
			newnode.next=newnode;
		   last=newnode;   
			newnode.prev=newnode;  
		 }   
		else {    
			newnode.next=last.next;
			last.next.prev=newnode; 
			newnode.prev=last;   
			last.next=newnode;  
		}  
	}  
	public void display() {
		node temp=last.next; 
		do {  
			System.out.print(temp.data + " ");
			temp=temp.next; 
		}while(temp!=last.next);  
	}   
   public void insetAtEnd(int val){
           node newnode = new node(val); 
          newnode.next=last.next;
          newnode.prev=last;    
          last.next=newnode;  
          last=newnode;
          last.next=newnode.next; 
          last.next.prev=newnode;   
          } 
	public void displayRev() { 
		node temp=last;
	do {                                                
	 	System.out.print(temp.data+" ");
		temp=temp.prev;  
	}while(temp!=last);    
}
	public void deleteAtbegning() {
      last.next=last.next.next;
      last.next.prev=last;
	}
	public void deleteAtEnd() {
		last.prev.next=last.next;
		last=last.prev;
		last.next.prev=last;
	}
	public boolean contain(int val) {
		boolean bool=false;
		node temp=last.next;
		do{ 
		 if(temp.data==val) { 
			 bool=true;
				return true;
			}
		 temp=temp.next;
		  if(bool==false) ;
		}while(temp!=last.next) ;
   return false;
}
	public void size() {
		node temp=last.next;
		int i=0;
		do { 
			temp=temp.next;
			i++;
		}while(temp!=last);
		System.out.println("The Size Of List Is "+ i); 
	}
}

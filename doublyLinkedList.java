package DataStructureAndAlgorithm;

public class doublyLinkedList {
   node head; 
   node tail;
   class node{
	   node next;
	   node prev;
	   int data;
	   node(int val){
		   data=val; 
		   prev=null;
		   next=null;
	   }
   }
   doublyLinkedList(){
	   head=null;
	   tail=null;
   }
   public void insertAtBegning(int val) {
	   node newnode = new node(val); 
	   if(head==null) {
		   head=newnode;
	       tail=newnode; 
	   } 
	      else {
	       newnode.next=head;
	       head.prev = newnode; 
	       }
	   head=newnode;
   }
   public void display() {
	   node temp=head;
	   
	   
	   while(temp!=null) {
		   System.out.print(temp.data + " ");
		   temp=temp.next; 
		  }
   }
   public void displayrev() {
	   node temp=tail; 
	   while(temp!=null) {
		   System.out.print(temp.data + " ");
		   temp=temp.prev;
		  } 
   }
   public void insertAtPos(int pos,int val) {
	   node newnode = new node(val);
	   node temp=head;
	   
	   if(pos==0){     
			  newnode.next=head;
			  head.prev=newnode;
			  head=newnode;
			  return;
	   }
	  for(int i=1;i<pos;i++) {
		  temp=temp.next;
	  }
	   newnode.next=temp.next;
	   newnode.prev=temp;
	   if(temp==tail){
		   tail=newnode;
	   }
	   else
	   temp.next.prev=newnode;
	   temp.next=newnode;
	 }
   public void deleteAtPos(int pos) {
	   node temp=head;
	   if(pos==0) {
		   head=head.next;
		   head.prev=null;
		   return;
		   }
	   for(int i=1;i<=pos;i++) {
		   temp=temp.next; 
	   } 
	   if(temp==tail) {
		  tail=temp.prev;  
		  tail.next=null;
	   } 
	   else {
	 temp.next.prev=temp.prev;
	 temp.prev.next=temp.next;
   }
   }
   public void insertAtend(int val) {
	   node temp=head;
	   node newnode = new node(val);
	   while(temp.next!=null) {
		   temp=temp.next;
	   }
	   temp.next=newnode;
	   newnode.prev=temp;
	   tail=newnode;
	 }
   public void deleteAtend() {
	   node temp=head;
	   while(temp.next!=null) {
		   temp=temp.next;
	   }
	   tail=temp.prev;
	   tail.next=null;
   }
   public void update(int pos , int val) {
	   node temp=head;
	   for(int i=1;i<=pos;i++) {
		   temp=temp.next; 
	   }
	   temp.data=val;
   }
   public void getindex(int pos) {
	   node temp=head;
	   for(int i=1;i<=pos;i++) {
		   temp=temp.next;
	   }
	   System.out.println("The Index Of The Value Is "+temp.data);
   }
   public void search(int val) {
	   node temp = head;
	   boolean bool=false;
	   int i=0;
	   while(temp!=null) {
		  if(temp.data==val) {
			  bool=true;
			   System.out.println("The "+val+" Of The Index Is "+i);
		  }
		  temp=temp.next;
		   i++;
	   }
	   if(bool==false) {
			  System.out.println("No Such Elements In The List");
		  }
   }
   public boolean contain(int val) {
	   node temp=head;
	   while(temp!=null) {
		   int i=0; 
		   if(temp.data==val)
			   return true;
		   temp=temp.next;
		   i++;
	   }
	   return false; 
	   }
  } 
 
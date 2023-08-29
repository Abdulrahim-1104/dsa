package DataStructureAndAlgorithm;
class testing{
	node head;
	class node{
		int data;
		node next;
		node(int val){
			data=val;
			next=null;
		} 
	}
	testing(){
		head=null;
	}
	public void insertAtBegning(int val) {
		node newnode = new node(val);
		if(head==null)
		       head=newnode;
		else 
		newnode.next=head;
		head=newnode;
			
	}
	public void display() {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
			}
	}
	public void insertAtPosition(int pos,int val) {
		node temp=head;
		node newnode = new node(val);
		node prev=null;
		for(int i=1;i<=pos;i++) {
		 	prev=temp;
			temp=temp.next;
			}
		newnode.next=temp;
		prev.next=newnode;
	}
	public void deleteAtPosition(int pos) {
		if(head==null) {
			return;
		}
		node temp=head;
		node prev = null;
		if(pos==0) { 
			head=temp.next;
			return;  
		}
		else
		for(int i=1;i<=pos;i++) {
			prev=temp;
			temp=temp.next;
			}
		prev.next=temp.next;     
		}
	public void getIndex(int pos) {
	 node temp=head;
	 for(int i=1;i<=pos;i++) {
		 temp=temp.next;
	 }
	System.out.println(temp.data);
	}
	public void update(int pos ,int val) {
		node newnode = new node(val);
		node temp = head;
		for(int i=1;i<=pos;i++) {
			temp=temp.next;
		}
		temp.data=newnode.data;
	}
	public void deleteAtend() {
		node temp=head;
		node prev = null;
		while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=null; 
	}
	public void insertAtEnd(int val) {
		node newnode = new node(val);
		node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			}
		temp.next=newnode;
		newnode.next=null;
		
	}
	public void search(int val) {
		node temp=head;
		boolean bool=false;
		for(int i=0;temp!=null;i++) {
			if(temp.data==val) { 
				bool=true;
				System.out.println("The Value " +val+" Of The Index Is "+i);
			}
				temp=temp.next;
		}
		if(bool==false)
			System.out.println("No Such Element");
		
	}
	public boolean contain(int val) {
		node temp=head;
		for(int i=0;temp!=null;i++) { 
			if(temp.data==val)  
				return true;
			temp=temp.next; 
		}
		
		return false;
	}
}
public class TestingProgram { 
	public static void main(String args[]) {
		  testing list = new testing();
		  list.insertAtBegning(2);
		  list.insertAtBegning(3);
		  list.insertAtBegning(4);
          list.insertAtBegning(5);
          list.display();
          System.out.println("");
          list.insertAtPosition(2,8);
		  list.display();
		  System.out.println("");
		  list.deleteAtPosition(0); 
		  list.display();
		   System.out.println("");
		  list.getIndex(3);
		  System.out.println("");
		  list.update(3, 9);
		  list.deleteAtend();
		  list.insertAtEnd(7);
		  list.insertAtEnd(8);
		  list.display();
		  System.out.println("");
		  list.search(8); 
		  System.out.println("");
		System.out.println(  list.contain(8));
		System.out.println(  list.contain(9));
		}
	
	}

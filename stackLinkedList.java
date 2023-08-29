package DataStructureAndAlgorithm;
class stacks{
	node top;
	class node{
		node next;
		int data;
		node(int val){
			data=val;
			next=null;
		}
	} 
	stacks(){
		top=null;
	}
	public void push(int val) {
		node newnode = new node(val);
		newnode.next=top;
		top=newnode;
	}
	public int pop() {
		if(top==null) {
			throw new IndexOutOfBoundsException("Stack is empty");  
		}
		int c =top.data; 
		top=top.next; 
		return c; 
	}
	public int peek() {
			return top.data;
	}
	public boolean isEmpty() {
		if(top==null) return true;
		return false;
	} 
} 
public class stackLinkedList {
	public static void main(String args[]) {
		stacks s = new  stacks();
		s.push(5);
		s.push(3);
		s.push(2);
		s.push(1);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek()); 
		System.out.println(s.isEmpty()); 
		}
}
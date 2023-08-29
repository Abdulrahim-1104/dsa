package DataStructureAndAlgorithm;
class QueueLinkedList{
	node font,rear;
	class node{
	node next;
	int data;
	node(int val){
		next = null;
		data=val;
	}
	}
	QueueLinkedList(){
		font=null;
		rear=null;
	}
	public void enqueueLinked(int val) {
		 node newnode = new node(val);
		if(font==null) {
			font=newnode;
		} 
		else
		rear.next=newnode;
		rear=newnode;
		 
	}
	public int dequeueLinked() {
		if(font==null) {
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		int sol=font.data;
		font=font.next;
		return sol;
	}
	
}
class Queue{
	static final int MAX = 5;
	int arr[];
	int font;
	int rear;
	Queue(){
		arr = new int[MAX];
		font=-1;
		rear=-1;
	}
	public void enqueue(int val)
	{
		if(font==MAX-1)
			throw new IndexOutOfBoundsException("Queue is full");
		if(font==-1)
			font++; 
		arr[++rear]=val; 
	}
	public int dequeue() {
		if(font==-1||rear<font)
		throw new IndexOutOfBoundsException("Queue is Empty");
		return arr[font++];  
	} 
}
class Queuee{
	static final int MAX = 5;
	int arr[];
	int rear;
	Queuee(){
		arr=new int[MAX];
		rear=-1;
		
	}
	public void enqueuee(int val) {
		if(rear==MAX-1)
			throw new IndexOutOfBoundsException("Queue Is full");
		arr[++rear]=val;
	}
	public int dequeuee() {
		if(rear==-1||rear==MAX-1)
			throw new IndexOutOfBoundsException("Queue is Empty");
		int temp=arr[0];
		
		for(int i=1;i<=rear;i++) { 
			arr[i-1]=arr[i];  
		}
		rear--;
		return temp;
		}
	
}
public class queueArray {
	public static void main(String args[]) {
		Queue q= new Queue();
		Queuee qq = new Queuee();
		QueueLinkedList qqq=new QueueLinkedList();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		qq.enqueuee(1);
		qq.enqueuee(2);
		qq.enqueuee(3);
		qqq.enqueueLinked(1);
		qqq.enqueueLinked(2);
		qqq.enqueueLinked(3);
	    System.out.println("Dequeued "+q.dequeue());
		System.out.println("Dequeued "+q.dequeue());
		System.out.println("Dequeued "+q.dequeue());
		System.out.println("Dequeued "+qq.dequeuee());
		System.out.println("Dequeued "+qq.dequeuee());
		System.out.println("Dequeued "+qq.dequeuee());
		System.out.println("Dequeued "+qqq.dequeueLinked());
		System.out.println("Dequeued "+qqq.dequeueLinked());
		System.out.println("Dequeued "+qqq.dequeueLinked());
		
	}
 
}

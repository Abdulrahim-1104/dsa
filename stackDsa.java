package DataStructureAndAlgorithm;
class stack{
	static final int MAX=10;
	int arr[]=new int[MAX];
	int top;
	int data;
	stack() {
		top=-1;
	}
	public void push(int val) {
		if(top==MAX-1)
			System.out.println("Stack Overflow");
		arr[++top]=val;
	}
	public int pop() {
		if(top==-1)
			System.out.println("Stack underflow");
		return arr[top--];  
	}
}
public class stackDsa {
	public static void main(String args[]) {
	   stack s = new stack();
	   s.push(4);
	   s.push(3);
	   s.push(2);
	   s.push(1);
	   System.out.println(s.pop());
	   System.out.println(s.pop());
	  
	}

}

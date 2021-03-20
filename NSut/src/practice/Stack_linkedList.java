package practice;

public class Stack_linkedList {
	int size=0;
	class Node {
		int data;
		Node pre;
	}

	private Node top = null;

	public void push(int data) {
		Node nn = new Node();
		nn.data = data;
		if (this.top == null) { // size=0
			nn.pre = null;
		} else {
			nn.pre = top;
		}
		this.top = nn;
		size++;
	}
	public int pop() {
		if(top==null) {
			System.out.println("Stack is Empty");
			return -1;
		}
		
		int rv=top.data;
		top=top.pre;
		size--;
		return rv;
	}
	public int peek() {
		int rv=top.data;
		return rv;
	}
	public int size() {
		return this.size;
		
	}
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+", ");
			temp=temp.pre;
		}
		System.out.println();
	}
}

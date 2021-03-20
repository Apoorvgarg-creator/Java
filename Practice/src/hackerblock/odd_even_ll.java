package hackerblock;

import java.util.*;
public class odd_even_ll {

	private class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return tail.data;
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public int removeFirst() throws Exception {
		Node fn = this.head;

		if (this.size == 0)
			throw new Exception("linked list is empty");

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			Node np1 = this.head.next;
			this.head = np1;
			size--;
		}

		return fn.data;
	}
	
	public void partition()  throws Exception{
		Queue<Integer> odd=new LinkedList<>();
		Queue<Integer> even=new LinkedList<>();
		Node temp=head;
		
		while(temp!=null) {
			if(temp.data%2==0) {
				even.add(removeFirst());
			}
			else {
				odd.add(removeFirst());
			}
			temp=temp.next;
		}
		while(!odd.isEmpty()) {
			this.addLast(odd.remove());
		}
		while(!even.isEmpty()) {
			this.addLast(even.remove());
		}
	
	
    }

	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


			odd_even_ll ll = new odd_even_ll();
			int n = scn.nextInt();

			for (int j = 0; j < n; j++) {
				int item = scn.nextInt();
				ll.addLast(item);
			}

			ll.partition();
			ll.display();

		
	}
}


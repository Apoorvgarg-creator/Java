package Queue ;
import java.util.*;

class LinkedList {

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
	public Node getnodeAt(int idx) throws Exception {
		if (size==0) {
			throw new Exception("Empty");
		}
		if (idx < 0 || idx > size) {
			throw new Exception("Invalid");
		}
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public LinkedList merge_sorted_list(LinkedList one) throws Exception {

		int i=0;
		int j=0;
		LinkedList ll=new LinkedList();
		while(i<one.size && j<this.size) {
			if(one.getnodeAt(i).data <this.getnodeAt(j).data) {
				ll.addLast(one.getnodeAt(i).data);
				i++;
			}else if(one.getnodeAt(i).data > this.getnodeAt(j).data) {
				ll.addLast(this.getnodeAt(j).data);
				j++;
			}else {
				ll.addLast(one.getnodeAt(i).data);
				i++;
				j++;
			}
			}
			while(i<one.size) {
				ll.addLast(one.getnodeAt(i).data);
				i++;
				
			}
			while(j<this.size) {
				ll.addLast(this.getnodeAt(j).data);
				j++;
				
			}
		
		return ll;
		
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
		
		
		    int t = scn.nextInt();
		    
		    while(t > 0){

			    LinkedList list1 = new LinkedList();
			    int n1 = scn.nextInt();
			 
			    for (int j = 0; j < n1; j++) {
				    int item = scn.nextInt();
				    list1.addLast(item);
			}

                LinkedList list2 = new LinkedList();
			    int n2 = scn.nextInt();
			 
			    for (int j = 0; j < n2; j++) {
				    int item = scn.nextInt();
				    list2.addLast(item);
			}
			  LinkedList list3 = list1.merge_sorted_list(list2);
			  list3.display();
			  System.out.println();

            t--;
            }
		
	}
}

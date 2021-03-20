package L18jan12;
import java.util.*;
public class linkedlist_2 {
	int[] data = new int[5];

	public class node {
		int data;
		node next; // object to store the address of next node to make connections with the previos
					// one

		public node() {
			data = 0;
		}

		public node(int data) {
			this.data = data;
		}
	}

	// for the first node head and tail would have the same value and that too equal
	// to null
	node head;
	node tail;
	int size = 0;

	// method to add data at last
	public int gethead() {
		return head.data;
	}

	public int gettail() {
		return tail.data;
	}

	public void addLast(int item) {
		// 1.create node
		node nn = new node();
		nn.data = item;
		// check size
		if (size == 0) {
			head = nn;
			tail = nn;
		} else {
			// 2.attach node
			tail.next = nn;
			// 3.move tail to next
			tail = nn;
		}
		size++;
	}

	public void addfirst(int item) {
		node nn = new node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
		} else {
			nn.next = head;
			head = nn;
		}
		size++;
	}

	public void addAt(int idx, int item) throws Exception {
		if (idx == 0) {
			addfirst(item);
		} else if (idx == size) {
			addLast(item);

		} else {
			node nn = new node();
			nn.data = item;
			node temp = getnodeAt(idx - 1);
			nn.next = temp.next;
			temp.next = nn;
			size++;
		}
	}

	public node getnodeAt(int idx) throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty");
		}
		if (idx < 0 || idx > size) {
			throw new Exception("Invalid");
		}
		node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;
	}
//	public Linkedlist llsub(int idx,int end) throws Exception {
//		if (isEmpty()) {
//			throw new Exception("Empty");
//		}
//		if (idx < 0 || idx > size) {
//			throw new Exception("Invalid");
//		}
//		Linkedlist ll=new Linkedlist();
//		node temp = getnodeAt(idx);
//		for (int i = idx; i <= end; i++) {
//			ll.addfirst(temp.data);
//			temp = temp.next;
//		}
//
//		return ll;
//	}

	public void display() {
		node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
		System.out.println("-----");
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int removefirst() throws Exception {
		if (size == 0) {
			throw new Exception("Empty");
		}

		int x = head.data;
		head = head.next;
		size--;
		return x;
	}

	public int removeLast() throws Exception {
		if (size == 0) {
			throw new Exception("Empty");
		}
		int x = tail.data;
		node temp = getnodeAt(size - 2);
		tail = temp;
		tail.next = null;
		size--;
		return x;
	}

	public int removeAt(int idx) throws Exception {
		if (size == 0) {
			throw new Exception("Empty");
		}
		int x = -1;
		if (idx == 0) {
			x = removefirst();

		} else if (idx == size - 1) {
			x = removeLast();
		} else {
			node temp = getnodeAt(idx - 1);
			node temp1 = temp.next;
			temp.next = temp1.next;
			x = temp1.data;
			size--;
		}

		return x;

	}

	public void reversepointerll1() throws Exception { // iteration // reverse pointer // O(n^2)

		node temp = tail;
		int a = size;
		for (int i = 1; i <= size - 1; i++, a--) {
			node yo = getnodeAt(a - 2);
			temp.next = yo;
			temp = yo;
		}
		node x = tail;
		tail = head;
		head = x;

		tail.next = null;

	}

	public void reversepointerll() throws Exception { // iteration // reverse pointer // O(n)

		node prev = null;
		node curr = head;
		while (curr != null) {
			node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		node x = tail;
		tail = head;
		head = x;

		tail.next = null;

	}

	public void reversedatall() throws Exception { // iteration //reverse data // O(n^2)
		node p = head;
		node p1 = tail;
		int a = size;
		for (int i = 0; i < size / 2; i++, a--) {
			int temp = p.data;
			p.data = p1.data;
			p1.data = temp;
			node yo = getnodeAt(a - 2);
			p1 = yo;
			p = p.next;
		}

	}

//	public void revrecpoin(Linkedlist ll) throws Exception {        //recursive //reverse data 
//		if(size<=0) {
//			
//			return ;
//		}
//		
//		Linkedlist roll=llsub(1,size-1);
//		roll.display();
//		revrecpoin(roll);
//		int temp=ll.head.data;
//		ll.head.data=ll.tail.data;
//		ll.tail.data=temp;
//		
//		
//		
//	}
	public void recpoinrev() {
		recpoinrev(head, null);
		node temp = head;
		head = tail;
		tail = temp;
	}

	public void recpoinrev(node curr, node prev) { // recursion
		if (curr == null) {
			return;
		}
		recpoinrev(curr.next, curr);
		curr.next = prev;

	}

	class heapover {
		node left;
	}

	public void fold() {
//		fold(head, 0);
		heapover mover = new heapover();
		mover.left = head;
		fold(mover, head, 0);
	}

	public node fold(node right, int cnt) { // recursion
		if (right == null) {
			return head;
		}
		node tmp = fold(right.next, cnt + 1);
		if (cnt > size / 2) {
			node t = tmp.next;
			tmp.next = right;
			right.next = t;
			tmp = t;

		}
		if (cnt == size / 2) {
			tail = tmp;
			tail.next = null;
		}

		return tmp;
	}

	public void fold(heapover mover, node right, int cnt) { // recursion
		if (right == null) {
			return;
		}
		fold(mover, right.next, cnt + 1);
		if (cnt > size / 2) {
			node t = mover.left.next;
			mover.left.next = right;
			right.next = t;

			mover.left = t;

		}
		if (cnt == size / 2) {
			tail = mover.left;
			tail.next = null;
		}

	}

	public void mid() {
		heapover mover = new heapover();
		mover.left = head;
		mid(mover, head, 0); // by using size

	}

	public void mid(heapover mover, node right, int cnt) { // by using size
		if (right == null) {
			return;
		}
		mid(mover, right.next, cnt + 1);
		if (cnt > size / 2) {
			node t = mover.left.next;

			mover.left = t;

		}
		if (cnt == size / 2) {
			System.out.println("mid node data is" + mover.left.data);
		}

	}

	public int mid_1() { // iterative
		node slow = head;
		node fast = head;
		while (fast != null && fast.next != null) { // in case of even--> next element
//			while (fast != null && fast.next.next != null) { // in case of even size --> previous element
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public void mid_rec(node slow, node fast) { // mid by recursion
		if (fast == null && fast.next == null) {
			System.out.println(slow.data);
			return;
		}
		mid_rec(slow.next, fast.next.next);
	}

	public void kthfromlast(int k) {
		kthfromlast(head, k, 0); // by using size

	}

	public void kthfromlast(node right, int k, int cnt) { // by using size
		if (right == null) {
			return;
		}
		kthfromlast(right.next, k, cnt + 1);
		if (size - cnt == k) {
			System.out.println(right.data);
		}
	}

	public int kthfromlast_1(int k) { // iterative
		node slow = head;
		node fast = head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	public boolean detectloop() { // for linked list where tail !=null
		node slow = head;
		node fast = head;
		while (true) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == head) {
				return true;
			}
		}
	}

	public void createDummyList() {
		node n1 = new node(10);
		node n2 = new node(20);
		node n3 = new node(30);
		node n4 = new node(40);
		node n5 = new node(50);
		node n6 = new node(60);
		node n7 = new node(70);
		node n8 = new node(80);
		node n9 = new node(90);
		node n10 = new node(100);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = null;
		n9.next = n10;
		n10.next = n7;
		node h1 = n1;
		node h2 = n9;
		System.out.println(intersection(h1, h2));
	}

	public int intersection(node h1, node h2) {
		node A = h1;
		node B = h2;
		while (A != B) {
			A = (A != null ? A.next : h2);
			B = (B != null ? B.next : h1);
		}
		return (A != null ? A.data : -1);
	}

	public void Kreverse(int k) throws Exception {
		linkedlist_2 prev = null;
		while (this.size > 0) {
			linkedlist_2 curr = new linkedlist_2();
			for (int i = 0; i < k && !isEmpty(); i++) {
				curr.addfirst(this.removefirst());
			}

			if (prev == null) {
				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}

		}

		this.head = prev.head;
		this.tail = prev.tail;
		this.size = prev.size;
	}
	public void kthreverse(int k) throws Exception{
		
	    for(int i=0;i<size;){
			int m=k;
			int l=i;
			for(int j=0;j<k/2;j++,l++,m--){
				
				int temp1=getnodeAt(l).data;
				int temp2=getnodeAt(l+m-1).data;
				getnodeAt(l).data=temp2;
				getnodeAt(l+m-1).data=temp1;
			}
			i=i+k;
		}
	
	}
	public void appendLastN(int n) throws Exception { 
		if(n>this.size) {
			n=n%this.size;
		}
		for(int i=0;i<n;i++) {
		int rv=removeLast();
		addfirst(rv);
		}
	}
	public void deleteLarger() throws Exception {
 
	
    }
}
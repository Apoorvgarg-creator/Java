package L17jan11;



public class Linkedlist {
	int[] data = new int[5];
	

	public class node {
		int data;
		node next; // object to store the address of next node to make connections with the previos
					// one
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
	public Linkedlist llsub(int idx,int end) throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty");
		}
		if (idx < 0 || idx > size) {
			throw new Exception("Invalid");
		}
		Linkedlist ll=new Linkedlist();
		node temp = getnodeAt(idx);
		for (int i = idx; i <= end; i++) {
			ll.addfirst(temp.data);
			temp = temp.next;
		}

		return ll;
	}

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

		
		node prev=null;
		node curr=head;
		while(curr!=null) {
			node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
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
		recpoinrev(head,null);
		node temp=head;
		head=tail;
		tail=temp;
	}
	
	public void recpoinrev(node curr,node prev) {
		if(curr==null) {
			return ;
		}
		recpoinrev(curr.next,curr);
		curr.next=prev;
		
	}
	public void recdatarev() {
		recdatarev(head,0);
		
		
	}
	public node recdatarev(node right,int cnt) {
		if(right==null) {
			node left=head;
			return left;
		}
		
		node temp=recdatarev(right.next,cnt+1);
		if(cnt>size/2) {
			int t=temp.data;
			temp.data=right.data;
			right.data=t;
		}
		
		return temp.next;
		
		
	}

}

package L22feb1;

public class BST {
	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BST(int[] Inorder) {
		root = construct(Inorder, 0, Inorder.length - 1);
	}

	public Node construct(int[] Inorder, int lo, int hi) {
		if (lo > hi) {
			return null;
		}
		int mid = lo + (hi - lo) / 2;
		Node nn = new Node();
		nn.data = Inorder[mid];
		nn.left = construct(Inorder, lo, mid - 1);
		nn.right = construct(Inorder, mid + 1, hi);
		return nn;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(max(node.right), node.data);
	}

	private int max2(Node node) {
		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (item == node.data) {
			return true;
		}
		boolean rr;
		if (item > node.data) {
			rr = find(node.right, item);
		} else {
			rr = find(node.left, item);
		}
		return rr;
	}

	public void printra(int lo, int hi) {
//		print_In_range(root, lo, hi);
		printinrange(root, lo, hi);
	}

	private void print_In_range(Node node, int lo, int hi) { /// method - XXXX
		if (node == null) {
			return;
		}
		if (lo < node.data && node.data < hi) {
			System.out.print(node.data);
		}
		print_In_range(node.left, lo, hi);
		print_In_range(node.right, lo, hi);

	}

	private void printinrange(Node node, int lo, int hi) { ///// method -YYYY
		if (node == null) {
			return;
		}
		if (node.data < lo) {
			printinrange(node.right, lo, hi);
		}
		if (node.data > hi) {
			printinrange(node.left, lo, hi);
		}
		if (node.data >= lo && node.data <= hi) {

			printinrange(node.left, lo, hi);
			System.out.println(node.data);
			printinrange(node.right, lo, hi);
		}

	}

	public void replacewithlarger() {
		replacewithlarger2(root, 0);
	}

	int sum = 0;

	private void replacewithinteger(Node node) {
		if (node == null) {
			return;
		}
		replacewithinteger(node.right);
		int temp = node.data;
		node.data = sum;
		sum += temp;
		replacewithinteger(node.left);
	}

	private int replacewithlarger2(Node node, int ssf) {
		if (node == null) {
			return ssf;
		}
		ssf = replacewithlarger2(node.right, ssf);
		int temp = node.data;
		node.data = ssf;
		ssf += temp;
		return replacewithlarger2(node.left, ssf);

	}

	public void display() {

		display(root);
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";

		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}

		str += "<-" + node.data + "->";

		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}

		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	public void addnode(int toadd) {
		addnode(null, root, toadd);
		display();
	}

	public void addnode(Node Parent, Node child, int toadd) {
		if (child == null) {
			Node nn = new Node();
			nn.data = toadd;
			if (Parent.data > toadd) {
				Parent.left = nn;
			} else {
				Parent.right = nn;
			}
			return;

		}
		if (child.data > toadd) {
			addnode(child, child.left, toadd);
		}
		if (child.data < toadd) {
			addnode(child, child.right, toadd);
		}

	}

	public void addnode2(int toadd) {
		root = addnode2(root, toadd);
	}

	private Node addnode2(Node node, int toadd) {
		if (node == null) {
			Node n = new Node();
			n.data = toadd;
			return n;
		}
		if (node.data > toadd) {
			node.left = addnode2(node.left, toadd);
		} else {
			node.right = addnode2(node.right, toadd);
		}
		return node;
	}

	public void remove(int item) {
		remove(root, root, item);
		display();
	}

	
	private void remove(Node parent, Node child, int item) {
		if(child==null) {
			return ;
		}
		if(child.left==null && child.right==null) {
			
		}

	}
}

package L22feb1;

import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class Binarytree {

	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	Scanner scn;

	public Binarytree(String str) {

		scn = new Scanner(str);
		root = construct(null, true);
	}

	public Binarytree(int[] pre, int[] in) {
		root = constructpre(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node constructpre(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) { // construct a tree when
																							// pre-order and in-order is
																							// given
		if (plo > phi) {
			return null;
		}
		Node nn = new Node();
		nn.data = pre[plo];
		int idx = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == nn.data) {
				idx = i;
				break;
			}
		}
		int nel = idx - ilo;
		nn.left = constructpre(pre, plo + 1, plo + nel, in, ilo, idx - 1);
		nn.right = constructpre(pre, plo + nel + 1, phi, in, idx + 1, ihi);
		return nn;
	}
//	private Node constructpro(int[] pos ,int plo,int phi,int[] in,int ilo,int ihi) {			//construct a tree when post-order and in-order is given
//		if(plo>phi) {
//			return null;
//		}
//		Node nn =new Node();
//		nn.data=pos[phi];
//		int idx=-1;     
//		for(int i=ilo;i<=ihi;i++) {
//			if(in[i]==nn.data) {
//				idx=i;
//				break;
//			}
//		}
//		int nel=idx-ilo;
//		nn.left=constructpro(pos,plo, plo+nel-1, in, ilo, idx-1);
//		nn.right=constructpro(pos, plo+nel, phi, in, idx+1,ihi);
//		return nn;
//	}

	public Node construct(Node parent, boolean isLeftChild) {

		if (parent == null)
			System.out.println("Enter the Data for Root? ");
		else {

			String child = (isLeftChild ? "Left" : "Right");
			System.out.println("Enter the Data for " + child + " child of " + parent.data + "? ");
		}

		int item = scn.nextInt();
		Node nn = new Node();
		nn.data = item;

		System.out.println("Is Left child of " + nn.data + "? ");
		boolean ilc = scn.nextBoolean();

		if (ilc) {

			nn.left = construct(nn, true);
		}

		System.out.println("Is Right child of " + nn.data + "? ");
		boolean irc = scn.nextBoolean();

		if (irc) {
			nn.right = construct(nn, false);
		}

		return nn;
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

	public int size() {
		return size(root);
	}

	private int size(Node node) {

		if (node == null) {
			return 0;
		}

		int lsize = size(node.left);
		int rsize = size(node.right);

		return lsize + rsize + 1;

	}

	public int max() {

		return max(root);
	}

	private int max(Node node) {

		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int lmax = max(node.left);
		int rmax = max(node.right);

		return Math.max(node.data, Math.max(rmax, lmax));

	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}

		if (node.data == item) {
			return true;
		}

		boolean lans = find(node.left, item);
		boolean rans = find(node.right, item);

		return lans || rans;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {

		if (node == null) {

			return -1;
		}

		int l_ht = ht(node.left);
		int r_ht = ht(node.right);

		return Math.max(l_ht, r_ht) + 1;
	}

	public int diameter() {

		return dia(root);
	}

	private int dia(Node node) {

		if (node == null) {

			return 0;
		}

		int ld = dia(node.left);
		int rd = dia(node.right);
		int sd = ht(node.left) + ht(node.right) + 2;

		return Math.max(sd, Math.max(ld, rd));

	}

	int dia = 0;

	public int diameter2() {
		dia2(root);

		return dia;
	}

	private int dia2(Node node) {

		if (node == null) {
			return -1;
		}

		int l_ht = dia2(node.left);
		int r_ht = dia2(node.right);

		int sd = l_ht + r_ht + 2;
		dia = Math.max(dia, sd);
		return Math.max(l_ht, r_ht) + 1;
	}

	class diapair {

		int dia = 0;
		int ht = -1;
	}

	public int diameter3() {

		return dia3(root).dia;
	}

	private diapair dia3(Node node) {

		if (node == null) {
			return new diapair();
		}

		// Left dia pair
		diapair ldp = dia3(node.left);

		// Right dia pair
		diapair rdp = dia3(node.right);

		// Self dia pair
		diapair sdp = new diapair();

		int ld = ldp.dia;
		int rd = rdp.dia;
		int sd = ldp.ht + rdp.ht + 2;

		// Self diameter
		sdp.dia = Math.max(sd, Math.max(ld, rd));

		// Self height
		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;

		return sdp;

	}

	public boolean IsBalanced(Node node) {
		// Method-1 //Time com--->O(n2)
		if (node == null) {
			return true;
		}
		boolean left = IsBalanced(node.left);
		boolean right = IsBalanced(node.right);

		int bf = ht(node.left) - ht(node.right);
		return left && right && Math.abs(bf) <= 1;
	}

	private class balpair {
		int ht = -1;
		boolean Isbalance = true;
	}

	private balpair IsBalanced2(Node node) {

		// Method-2 // time com--->O(n)
		if (node == null) {
			return new balpair();
		}
		balpair lp = IsBalanced2(node.left);
		balpair rp = IsBalanced2(node.right);
		balpair sp = new balpair();
		sp.ht = Math.max(lp.ht, rp.ht) + 1;
		int bf = Math.abs(lp.ht - rp.ht);
		sp.Isbalance = lp.Isbalance && rp.Isbalance && bf <= 1;

		return sp;
	}

	public boolean IsBalanced2() {
		return IsBalanced2(root).Isbalance;
	}

	public void preorder() {
		System.out.println("Preorder");
		preorder(root);

	}

	public void postorder() {
		System.out.println("Postorder");
		postorder(root);

	}

	public void inorder() {
		System.out.println("Inorder");
		inorder(root);

	}

	private void preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}

	private void postorder(Node node) {
		if (node == null) {
			return;
		}

		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}

	private void inorder(Node node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);

	}

	class group {
		Node node;
		boolean Isleft, Isright, Isself;

		public group(Node node) {
			this.node = node;
		}
	}

	public void PreorderIter() { // Iterative Method
		Stack<group> stack = new Stack<>();
		stack.push(new group(root));
		while (!stack.isEmpty()) {
			group peekgroup = stack.peek();
			if (!peekgroup.Isself) {
				System.out.print(peekgroup.node.data + " ");
				peekgroup.Isself = true;
			} else if (!peekgroup.Isleft) {
				if (peekgroup.node.left != null) {
					group left = new group(peekgroup.node.left);
					stack.push(left);
				}
				peekgroup.Isleft = true;
			} else if (!peekgroup.Isright) {
				if (peekgroup.node.right != null) {
					group right = new group(peekgroup.node.right);
					stack.push(right);
				}
				peekgroup.Isright = true;
			} else {
				stack.pop();
			}
		}
	}

	public void PostorderIter() { // Iterative Method
		Stack<group> stack = new Stack<>();
		stack.push(new group(root));
		while (!stack.isEmpty()) {
			group peekgroup = stack.peek();
			if (!peekgroup.Isleft) {
				if (peekgroup.node.left != null) {
					group left = new group(peekgroup.node.left);
					stack.push(left);
				}
				peekgroup.Isleft = true;
			} else if (!peekgroup.Isright) {
				if (peekgroup.node.right != null) {
					group right = new group(peekgroup.node.right);
					stack.push(right);
				}
				peekgroup.Isright = true;
			} else if (!peekgroup.Isself) {
				System.out.print(peekgroup.node.data + " ");
				peekgroup.Isself = true;
			} else {
				stack.pop();
			}
		}
		System.out.println();
	}

	public void Inorderiter() { // Iterative Method
		Stack<group> stack = new Stack<>();
		stack.push(new group(root));
		while (!stack.isEmpty()) {
			group peekgroup = stack.peek();
			if (!peekgroup.Isleft) {
				if (peekgroup.node.left != null) {
					group left = new group(peekgroup.node.left);
					stack.push(left);
				}
				peekgroup.Isleft = true;
			} else if (!peekgroup.Isself) {
				System.out.print(peekgroup.node.data + " ");
				peekgroup.Isself = true;
			} else if (!peekgroup.Isright) {
				if (peekgroup.node.right != null) {
					group right = new group(peekgroup.node.right);
					stack.push(right);
				}
				peekgroup.Isright = true;
			} else {
				stack.pop();
			}
		}
		System.out.println();
	}

	HashMap<Integer, ArrayList<VOpair>> map = new HashMap<>();

	class VOpair {
		int data;
		int hlevel;

		public VOpair(int d, int h) {
			this.data = d;
			this.hlevel = h;
		}

		@Override
		public String toString() {
			return data + "";
		}

	}

	class VOcomparator implements Comparator<VOpair> {

		@Override
		public int compare(VOpair o1, VOpair o2) {
			return o1.hlevel - o2.hlevel;
		}

	}

	public void Vorder() {
		fillmap(root, 0, 0);
		System.out.println(map);
		ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
		Collections.sort(keys);

		for (int key : keys) {
			ArrayList<VOpair> level = map.get(key);
			Collections.sort(level, new VOcomparator());
			System.out.print(key + " " + level);
		}

	}

	public void fillmap(Node node, int Vlevel, int Hlevel) {
		if (node == null) {
			return;
		}
		if (!map.containsKey(Vlevel)) {
			map.put(Vlevel, new ArrayList<>());
		}

		ArrayList<VOpair> List = map.get(Vlevel);
		List.add(new VOpair(node.data, Hlevel));
		map.put(Vlevel, List);

		fillmap(node.left, Vlevel - 1, Hlevel + 1);
		fillmap(node.right, Vlevel + 1, Hlevel + 1);
	}

	//// HOME-WORK
	public boolean flipequivalent(Node node1, Node node2) {

		if (node1.data == node2.data) {
			return true;
		}

		return true;
	}

	public void levelOrderZZ() {
		Stack<Node> currentLevel = new Stack<>();
		Stack<Node> nextLevel = new Stack<>();

		currentLevel.push(root);
		boolean leftToRight = true;

		while (!currentLevel.isEmpty()) {

			Node node = currentLevel.pop();

			System.out.print(node.data + " ");

			if (leftToRight) {
				if (node.left != null) {
					nextLevel.push(node.left);
				}

				if (node.right != null) {
					nextLevel.push(node.right);
				}
			} else {
				if (node.right != null) {
					nextLevel.push(node.right);
				}

				if (node.left != null) {
					nextLevel.push(node.left);
				}
			}

			if (currentLevel.isEmpty()) {
				leftToRight = !leftToRight;
				Stack<Node> temp = currentLevel;
				currentLevel = nextLevel;
				nextLevel = temp;
			}
		}

	}

	public void levelOrderNewLine() {
//		boolean ltr=true;
		LinkedList<Node> curr = new LinkedList<>();
		LinkedList<Node> next = new LinkedList<>();
		curr.addLast(root);
		while (!curr.isEmpty()) {
			Node n;

			n = curr.removeFirst();

			System.out.print(n.data + " ");

			if (n.left != null) {
				next.addLast(n.left);
			}
			if (n.right != null) {
				next.addLast(n.right);
			}

			if (curr.isEmpty()) {
//				ltr=!ltr;
				System.out.println();
				LinkedList<Node> temp = curr;
				curr = next;
				next = temp;
			}
		}
	}

	public ArrayList<ArrayList<Integer>> levelArrayList() {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		LinkedList<Node> curr = new LinkedList<>();
		LinkedList<Node> next = new LinkedList<>();
		curr.addLast(root);
		ArrayList<Integer> a=new ArrayList<>();;
		while (!curr.isEmpty()) {
			
			Node n = curr.removeFirst();
			
				
				
			a.add(n.data);
			if (curr.isEmpty())
				ans.add(a);
			if (n.left != null) {
				next.addLast(n.left);
			}
			if (n.right != null) {
				next.addLast(n.right);
			}
			if (curr.isEmpty()) {
				a = new ArrayList<>();
				LinkedList<Node> temp = curr;
				curr = next;
				next = temp;
			}
			
		}
		return ans;
		}
			

}

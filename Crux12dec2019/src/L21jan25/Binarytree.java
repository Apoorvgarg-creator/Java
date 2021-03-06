package L21jan25;

import java.util.Scanner;

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
		
	}
	private void preorder(Node node) {
		if(node==null) {
			return ;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	private void postorder(Node node) {
		if(node==null) {
			return ;
		}
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
	private void inorder(Node node) {
		if(node==null) {
			return ;
		}
		postorder(node.left);
		System.out.print(node.data+" ");
		postorder(node.right);
		
	}
	
}

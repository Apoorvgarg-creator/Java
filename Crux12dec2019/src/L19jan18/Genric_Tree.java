package L19jan18;

import java.util.*;

public class Genric_Tree {

	public class node {
		int data;
		ArrayList<node> children = new ArrayList<>();

		@Override
		public String toString() {
			return data + "";
		}

	}

	Scanner scn;
	protected node root;

	public Genric_Tree(String str) {
		scn = new Scanner(str);
		root = construct(null, 0);
	}

	public node construct(node Parent, int ith) { ///// No need for base case because the for loop contains both the
													///// base case in itself
		if (Parent == null) {
			System.out.println("Enter data for root node ?");

		} else {
			System.out.println("Enter data for " + ith + "th of" + Parent.data + "?");
		}
		int item = scn.nextInt();

		node nn = new node();
		nn.data = item;
		System.out.println("Enter the number of children for " + item + "?");
		int noc = scn.nextInt();
		for (int i = 0; i < noc; i++) {
			node child = construct(nn, i);
			nn.children.add(child);
		}
		return nn;
	}

	public void display() {
		display(root);
//		System.out.println(size(root));
//		System.out.println(maximum(root));
	}

	public void display(node vnode) {
		System.out.print(vnode.data + " --> ");
		System.out.println(vnode.children);

		// call for recursion
		for (node ch : vnode.children) {
			display(ch);
		}
	}

	public int size(node vnode) {
		int cnt = 0;
		for (node ch : vnode.children) {
			cnt += size(ch);
		}
		cnt += 1;
		return cnt;
	}

	public int maximum(node first) {
		int max = Integer.MIN_VALUE;

		for (node ch : first.children) {

			int x = maximum(ch);
			if (x > max) {
				max = x;
			}

		}

//		
		return ((max < first.data) ? first.data : max);

	}

	private int height(node first) {
		int sh = -1;
		for (node ch : first.children) {
			int ht = height(ch);
			if (ht > sh) {
				sh = ht;
			}
		}
		return sh + 1;
	}

	public void finditem(int item) {
		System.out.println(finditem(root, item));
	}

	public boolean finditem(node first, int item) {

		for (node ch : first.children) {
			boolean b = finditem(ch, item);
			if (b) {
				return true;
			}

		}
		if (first.data == item) {
			return true;
		} else {
			return false;
		}

	}

	public void mirror() {
		mirror(root);
		display();
	}

	public void mirror(node first) {
		if (first.children.size() != 0) {
			int k = first.children.size();
			for (int i = 0; i < first.children.size() / 2; i++, k--) {
				node temp = first.children.get(i);
				first.children.set(i, first.children.get(k - 1));
				first.children.set(k - 1, temp);
			}
		}
		for (node val : first.children) {
			mirror(val);

		}

		return;
	}
	public void sumatlevel(int talev) {
		System.out.println(sumatlevel(root,0,talev));
	}
	public int sumatlevel(node n,int lev,int talev) {
		int sum=0;
		
		if(lev==talev) {
			sum+=n.data;
		}
		for(node val :n.children) {
			sum+=sumatlevel(val,lev+1,talev);
		}
		return sum;
	}
}

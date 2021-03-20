package L20jan19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Genric_tree {

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

	public Genric_tree(String str) {
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
		System.out.println(size(root));
		System.out.println(maximum(root));
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

	public void preorder() {
		preorder(root);
	}

	private void preorder(node node) {
		System.out.println(node.data + " ");

		for (node child : node.children) {
			preorder(child);
		}

	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(node node) {

		for (node child : node.children) {
			postorder(child);
		}
		System.out.println(node.data + " ");

	}

//	public void levelorder() {
//		LinkedList<node> ll = levelorder(root);
//		System.out.println(ll);
//	}
//
//	public LinkedList<node> levelorder(node node) {
//
//		LinkedList<node> ll = new LinkedList<>();
//
//		for (node child : node.children) {
//			ll.addLast(child);
//
//		}
//		for (node child : node.children) {
//
//			levelorder(child);
//
//		}
//
//		return ll;
//
//	}
	
	public void levelorder() {

		LinkedList<node> queue=new LinkedList<>();
		queue.addLast(root);
		while(!queue.isEmpty()) {
			node rn=queue.removeFirst();
			
			System.out.print(rn.data+" ");
			
			for(node child: rn.children) {
				queue.addLast(child);
			}
		}
		
//		System.out.println(queue);
	}
	public  void levelorderlinewise() {					////Method-1
		LinkedList<node> queue=new LinkedList<>();
		LinkedList<node> helper=new LinkedList<>();
		queue.addLast(root);
		while(!queue.isEmpty()) {
			node rn=queue.removeFirst();
			System.out.print(rn.data+" ");
			for(node child: rn.children) {
				helper.addLast(child);
			}
			
			if(queue.isEmpty()) {
			System.out.println();
			queue=helper;
			helper=new LinkedList<>();
			}
		
		}
	}
	public  void levelorderlinewise2() {					////Method-2
		LinkedList<node> queue=new LinkedList<>();
		
		queue.addLast(root);
		queue.addLast(null);
		while(!queue.isEmpty()) {
			node rn=queue.removeFirst();
			if(rn==null) {
				if(queue.isEmpty()) {
					return ;
				}
				System.out.println();
				queue.addLast(null);
				continue ;
			}
			System.out.print(rn.data+" ");
			for(node child: rn.children) {
				queue.addLast(child);
			}
			
			
		}
	
	}
	public void levelorderzigzag() {				//method-1 iterative solution
		LinkedList<node> stack=new LinkedList<>();
		LinkedList<node> helper=new LinkedList<>();
		stack.addFirst(root);
		int level=0;
		while(!stack.isEmpty()) {
			node rn=stack.removeFirst();
			System.out.print(rn.data+" ");
			if(level%2==0) {
			for(node child: rn.children) {
				helper.addFirst(child);
			}}
			else {
				for(int i=rn.children.size()-1;i>=0;i--) {
					helper.addFirst(rn.children.get(i));
				}
			}
			
			if(stack.isEmpty()) {
				level++;
			System.out.println();
			stack=helper;
			helper=new LinkedList<>();
			}
		
		}
	}
//	public void levelorderzigzag2() {				//method-1 iterative solution
//		LinkedList<node> stack=new LinkedList<>();
////		LinkedList<node> helper=new LinkedList<>();
//		stack.addFirst(root);
//		int level=0;
//		while(!stack.isEmpty()) {
//			node rn=stack.removeFirst();
//			if(rn==null) {
//				if(stack.isEmpty()) {
//					
//				}
//			}
//			System.out.print(rn.data+" ");
//			if(level%2==0) {
//			for(node child: rn.children) {
//				helper.addFirst(child);
//			}}
//			else {
//				for(int i=rn.children.size()-1;i>=0;i--) {
//					helper.addFirst(rn.children.get(i));
//				}
//			}
//			
//			if(stack.isEmpty()) {
//				level++;
//			System.out.println();
//			stack=helper;
//			helper=new LinkedList<>();
//			}
//		
//		}
//	}
	
	
	
}

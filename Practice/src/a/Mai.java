package a;

import java.util.*;
public class Mai {
    static Scanner scn = new Scanner(System.in);
    public static void main(String args[]) {
    	Mai m = new Mai();
		
        int n =scn.nextInt();
        int[] pre =new int[n];
        int[] in = new int[n];
        for(int i=0;i<n;i++){
            pre[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            in[i]=scn.nextInt();
        }
		Binarytree b1=m.new  Binarytree(pre,in);
        b1.display();
		
    }
    private class Binarytree {

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	Scanner scn;

//	public Binarytree(String str) {
//
//		scn = new Scanner(str);
//		root = construct(null, true);
//	}
	public Binarytree(int[]pre,int[] in) {
		root=constructpre(pre,0,pre.length-1,in,0,in.length-1);
	}
	private Node constructpre(int[] pre ,int plo,int phi,int[] in,int ilo,int ihi) {			//construct a tree when pre-order and in-order is given
		if(plo>phi) {
			return null;
		}
		Node nn =new Node();
		nn.data=pre[plo];
		int idx=-1;     
		for(int i=ilo;i<=ihi;i++) {
			if(in[i]==nn.data) {
				idx=i;
				break;
			}
		}
		int nel=idx-ilo;
		nn.left=constructpre(pre, plo+1, plo+nel, in, ilo, idx-1);
		nn.right=constructpre(pre, plo+nel+1, phi, in, idx+1,ihi);
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
	public int maxbst(Node node) {
		return 0;
	}
    }
    }


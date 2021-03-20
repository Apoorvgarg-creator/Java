package hackerblock;
import java.util.*;
public class structuallybal {

		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			structuallybal m = new structuallybal();
			BinaryTree bt1 = m.new BinaryTree();
			BinaryTree bt2 = m.new BinaryTree();
			System.out.println(bt1.structurallyIdentical(bt2));
		}

		private class BinaryTree {
			private class Node {
				int data;
				Node left;
				Node right;
			}

			private Node root;
			private int size;

			public BinaryTree() {
				this.root = this.takeInput(null, false);
			}

			public Node takeInput(Node parent, boolean ilc) {

				int cdata = scn.nextInt();
				Node child = new Node();
				child.data = cdata;
				this.size++;

				// left
				boolean hlc = scn.nextBoolean();

				if (hlc) {
					child.left = this.takeInput(child, true);
				}

				// right
				boolean hrc = scn.nextBoolean();

				if (hrc) {
					child.right = this.takeInput(child, false);
				}

				// return
				return child;
			}

			public boolean structurallyIdentical(BinaryTree other) {
				return this.structurallyIdentical(this.root, other.root);
			}

			private boolean structurallyIdentical(Node tnode, Node onode) {
				if(tnode==null && onode==null){
					return true;
				}
				if(tnode!=null && onode!=null){
					boolean ls=structurallyIdentical(tnode.left,onode.left);
					boolean rs=structurallyIdentical(tnode.right,onode.right);
					if( ls && rs){
						return true;
					}else{
						return false;
					}
				}
				
					return false;
				
			}
			public void sibling() {
				this.sibling(this.root);
			}

			private void sibling(Node node) {
				if(node.left==null && node.right==null){
					return ;
				}
				if(node.left!=null && node.right==null){
					System.out.print(node.left.data+" ");
					sibling(node.left);
				}
				else if(node.left==null && node.right!=null){
					System.out.print(node.right.data+" ");
					sibling(node.right);
				}
				else{
					sibling(node.right);
					sibling(node.left);
				}
			}
			public void removeLeaves() {
				this.removeLeaves(null, this.root);
			}

			private void removeLeaves(Node parent, Node child) {
				if(child.left==null && child.right==null){
					if(parent.left==child){
						parent.left=null;
					}else{
						parent.right=null;
					}
					return ;
				}
				if(child.left!=null){
					removeLeaves(child,child.left);
				}
				if(child.right!=null){
					removeLeaves(child,child.right);
				}
				
			}

		}
}


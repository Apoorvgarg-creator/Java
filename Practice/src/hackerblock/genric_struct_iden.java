package hackerblock;
import java.util.*;
public class genric_struct_iden {

		Scanner scn = new Scanner(System.in) ;
		
		public static void main(String[] args) {

			genric_struct_iden m = new genric_struct_iden();
			GenericTree gt1 = m.new GenericTree();
			GenericTree gt2 = m.new GenericTree();

			System.out.println(gt1.structurallyIdentical(gt2));

		}

		private class GenericTree {
			private class Node {
				int data;
				ArrayList<Node> children = new ArrayList<>();
			}

			private Node root;

			public GenericTree() {
				this.root = this.takeInput(scn, null, -1);
			}

			private Node takeInput(Scanner scn, Node parent, int i) {

				int childData = scn.nextInt();

				int numGC = scn.nextInt();

				Node child = new Node();
				child.data = childData;

				for (int j = 0; j < numGC; j++) {
					Node gc = this.takeInput(scn, child, j);
					child.children.add(gc);
				}

				return child;
			}

			public boolean structurallyIdentical(GenericTree other) {
				return this.structurallyIdentical(this.root, other.root);
			}

			private boolean structurallyIdentical(Node tnode, Node onode) {
				if(tnode.children.size()!=onode.children.size()){
					return false;
				}
				if(tnode.children.size()==0 && onode.children.size()==0){
					return true;
				}
				ArrayList<Node> tc=tnode.children;
				ArrayList<Node> oc=onode.children;
				int i=0,j=0;
				boolean rr=false;
				while(i<tc.size()){
					rr=structurallyIdentical(tc.get(i),oc.get(j));
					if(rr){
					i++;
					j++;
					}
					else{
						break;
					}
				}
				return rr;
			}


		}

	}


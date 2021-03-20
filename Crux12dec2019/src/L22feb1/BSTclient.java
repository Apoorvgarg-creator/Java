package L22feb1;

public class BSTclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Inorder= {1,2,3,4,5,9};
		BST b1=new BST(Inorder);
		System.out.println("-----");
		b1.display();
		System.out.println("-----");
		b1.addnode(6);
		System.out.println("-----");
		b1.remove(6);
	}

}

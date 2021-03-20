package L22feb1;

public class Btclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Not balanced
//		String inp2 = "10 true 20 true 40 true 70 false false false false true 30 false true 60 false false";
//		//Balanced
//		String inp3 = "10 true 20 true 40 true 70 false false false true 50 false false true 30 false true 60 false false";
//		String inp4="10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false";
				
		int[] pre={8, 3, 1, 6, 4, 7, 10, 14, 13};
		int[] in={1, 3, 4, 6, 7,
		8, 10, 13, 14} ;
		Binarytree b1=new Binarytree(pre,in);
		b1.display();
//		b1.levelOrderNewLine();
//		System.out.println("nnnn");
//		System.out.println(b1.levelArrayList());
		

	}

}

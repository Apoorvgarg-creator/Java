package L21jan25;

public class Btclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Not balanced
		String inp2 = "10 true 20 true 40 true 70 false false false false true 30 false true 60 false false";
		//Balanced
		String inp3 = "10 true 20 true 40 true 70 false false false true 50 false false true 30 false true 60 false false";
		Binarytree b1=new Binarytree(inp2);
		System.out.println(b1.IsBalanced2());

	}

}

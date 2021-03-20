package practice;

public class sll_client {
	public static void main(String[] args) {
		Stack_linkedList ss=new Stack_linkedList();
		ss.push(1);
		ss.push(2);
		ss.push(3);
		ss.push(4);
		ss.push(5);
		ss.display();
		System.out.println(ss.pop());
		ss.display();
		
	}
}

package L17jan11;

public class llclient {

	public static void main(String[] args) throws Exception {
		Linkedlist ll=new Linkedlist();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.removefirst();
		ll.addAt(2,1);
		ll.addAt(2, 6);
		ll.display();
		ll.recdatarev();
		System.out.println("reverse list");
		ll.display();
		
		
	}

}

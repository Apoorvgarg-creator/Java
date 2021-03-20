package L18jan12;
import java.util.*;
import L17jan11.Linkedlist;

public class llclient1 {
	

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
//		linkedlist_2 ll1= new linkedlist_2();
//		ll1.addLast(12);
//		ll1.addLast(15);
//		ll1.addLast(17);
//		ll1.addLast(20);
//		ll1.addLast(23);
//		ll1.addLast(26);
//		ll1.addLast(30);
		linkedlist_2 ll=new linkedlist_2();
		ll.addLast(12);
		ll.addLast(15);
		ll.addLast(10);
		ll.addLast(11);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(2);
		ll.addLast(3);
//		ll.display();
//		int k =scn.nextInt();
//		ll.kthfromlast(k);
//		ll.mid();
//		ll.Kreverse(3);
//		ll.kthreverse(3);
//		ll.display();
		linkedlist_2 ll2;
//		ll2=merge(ll,ll1);
		ll.deleteLarger();
		ll.display();

	}
	public static linkedlist_2 merge(linkedlist_2 one,linkedlist_2 two) throws Exception {
		int i=0;
		int j=0;
		linkedlist_2 ll=new linkedlist_2();
		while(i<one.size && j<two.size) {
			if(one.getnodeAt(i).data <two.getnodeAt(j).data) {
				ll.addLast(one.getnodeAt(i).data);
				i++;
			}else if(one.getnodeAt(i).data > two.getnodeAt(j).data) {
				ll.addLast(two.getnodeAt(j).data);
				j++;
			}else {
				ll.addLast(one.getnodeAt(i).data);
				i++;
				j++;
			}
			}
			while(i<one.size) {
				ll.addLast(one.getnodeAt(i).data);
				i++;
				
			}
			while(j<two.size) {
				ll.addLast(two.getnodeAt(j).data);
				j++;
				
			}
		
		return ll;
	}

}
	
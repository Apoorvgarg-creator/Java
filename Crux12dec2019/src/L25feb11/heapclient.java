package L25feb11;
import java.util.*;
public class heapclient {
	
	public static void main(String[] args) {
		Heap hp=new Heap();
		hp.add(86);
		hp.add(79);
		hp.add(93);
		hp.add(18);
		hp.add(36);
		hp.add(40);
		hp.add(59);
		hp.add(108);
		hp.add(52);
		hp.add(78);
		hp.add(100);
		hp.add(45);
		
		hp.display();
//		while(!hp.IsEmpty()) {
//			System.out.println(hp.remove());
//		}
//		System.out.println(Kthlargestelement(2, new int[] {6,7,1,2,3,4,3}));
//		

	}
	public static int Kthlargestelement(int k,int[] arr) {
		Heap hp =new Heap();
		for(int i=0;i<k;i++) {
			hp.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			int min=hp.getmin();
			if(min<arr[i]) {
				hp.remove();
				hp.add(arr[i]);
			}
		}
		return hp.getmin();
	}
	 
}

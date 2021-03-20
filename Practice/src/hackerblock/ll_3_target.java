package hackerblock;
import java.util.*;
public class ll_3_target {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n1,n2,n3;
		n1=scn.nextInt();
		n2=scn.nextInt();
		n3=scn.nextInt();
		LinkedList<Integer> ll1=new LinkedList<>();
		LinkedList<Integer> ll2=new LinkedList<>();
		LinkedList<Integer> ll3=new LinkedList<>();
		for(int i=0;i<n1;i++) {
			ll1.addLast(scn.nextInt());
		}
		for(int i=0;i<n2;i++) {
			ll2.addLast(scn.nextInt());
		}
		for(int i=0;i<n3;i++) {
			ll3.addLast(scn.nextInt());
		}
		int target=scn.nextInt();
		System.out.println(ll1);
		System.out.println(ll2);
		System.out.println(ll3);
		
		
		
		
		boolean done=false;
		int ssof=0;
		for(int i=0;i<n1;i++) {
			ssof+=ll1.get(i);
			System.out.println(ssof);
			if(ssof>=target) {
				ssof=0;
				continue;
				
			}
			if(done) {
				break;
			}
			for(int j=0;j<n2;j++) {
				ssof+=ll2.get(j);
				System.out.println(ssof);
				if(ssof>=target) {
					ssof-=ll2.get(j);
				}
				if(done) {
					break;
				}
				for(int k=0;k<n3;k++) {
					ssof+=ll3.get(k);
					System.out.println(ssof);
							if(ssof>target) {
								ssof-=ll2.get(j);
							}
							if(ssof==target) {
								done=true;
								System.out.println(ll1.get(i)+" "+ll2.get(j)+" "+ll3.get(k));
								break;
							}
							if(done) {
								break;
							}
				}
			}
		}
	}

}

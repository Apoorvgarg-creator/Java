package hackerblock;
import java.util.*;

public class subset_target {
	public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	int n=scn.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();
	}
	int target=scn.nextInt();
	int x=st(arr,0,0,target,"");
	System.out.println();
	System.out.println(x);
	}
	public static int st(int[] arr,int ssof,int vidx,int target,String ans){
		if(vidx>=arr.length) {
			if(ssof==target) {
				System.out.print(ans+" ");
				return 1;
			}
			return 0;
		}
        int a=arr[vidx];
        int cnt=0;
        cnt+=st(arr,ssof+a,vidx+1,target,ans+a+" ");
        cnt+=st(arr,ssof,vidx+1,target,ans+"");
        return cnt;
        
    }
}

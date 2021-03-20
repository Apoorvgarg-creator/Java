package L14jan3;

public class divide_conq_mergesort {

	public static void main(String[] args) {
			int[] arr= {5,4,1,2,3};
			int[] ans=mergesort(arr, 0, arr.length-1);
			for(int val: ans) {
				System.out.print(val+" ");
			}
	}
	public static int[] mergesort(int[] arr,int lo,int hi) {
		if(lo==hi) {
			int[] br=new int[1];
			br[0]=arr[lo];
			return br;
		}
		int mid=(lo+hi)/2;
		int[] fh = mergesort(arr, lo, mid);
		int[] sh = mergesort(arr,mid+1,hi);
		
		return mergetwosortedarray(fh,sh);
	}
	public static int[] mergetwosortedarray(int[] one,int[] two) {
		int i=0,j=0,k=0;
		int[] ans=new int[one.length+two.length];
		while(i<one.length && j<two.length) {
			if(one[i]<two[j]) {
				ans[k]=one[i];
				i++;
				k++;
				
			}
			else {
				ans[k]=two[j];
				j++;
				k++;
			}
			}
			while(i<one.length) {
				ans[k]=one[i];
				i++;
				k++;
			}
			while(j<two.length) {
				ans[k]=two[j];
				j++;
				k++;
			}
			return ans;
		}
	}



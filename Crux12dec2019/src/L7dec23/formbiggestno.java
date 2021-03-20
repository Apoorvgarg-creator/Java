package L7dec23;

public class formbiggestno {
	public static void main(String[] args) {
		int[] arr= {123,45,9,95};
		big(arr);
		
	}
	public static void big(int[] arr) {
		int[] lrem=new int[arr.length];
		int[] nod1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int rem=0;
			int nod=0;
			while(temp>0) {
				rem=temp%10;
				temp/=10;
				nod++;
			}
			nod1[i]=nod;
			lrem[i]=rem;
			//max in lrem
			int k=maxindex(lrem);
			
			
	}}
		public static int maxindex(int[] arr) {
			int max = arr[0];
			// OR max=Integer.MIN_VALUE;
			// IF MIN THEN = INFINITY
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			for(int i=0;i<arr.length;i++) {
				if(max==arr[i]) {
					return i;
				}
			}
			return -1;
		}
	}
	



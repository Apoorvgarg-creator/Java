package L14jan3;

public class divide_conq_quicksort {

	public static void main(String[] args) {
		int[] arr= {123,23,22,7543,-1};
		System.out.println("Array Entered:");
		for(int val:arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		quicksort(arr, 0, arr.length-1);
		System.out.println("Sorted Array:");
		for(int val:arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println("By - 2019UIT3151");
	}
	public static void quicksort(int[] arr,int lo,int hi) {
		if(lo>=hi) {
			return ;
		}
		int mid=lo+(hi-lo)/2;
		int left=lo,right=hi;
		int pivot=arr[mid];
		while(left<=right) {
			while(arr[left]<pivot) {
				left++;
			}
			while(arr[right]>pivot) {
				right--;
			}
			if(left<=right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			quicksort(arr,lo,right);
			quicksort(arr, left, hi);
		}
		
	}

}

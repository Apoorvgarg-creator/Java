package L5dec19;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {60,50,30,10,5};
		selectionsort(arr);
		display(arr);

	}public static void display(int[] arr) {
		// enhanced for loop
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	public static void selectionsort(int[] arr) {
		for(int count=0;count<=arr.length-2;count++) {
			//search the index at which smallest value is present
			int min=count;
			for(int j=count+1;j<=arr.length-1;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			//swap the smallest value with count^th index value
			int temp=arr[min];
			arr[min]=arr[count];
			arr[count]=temp;
			
		}
	}

}

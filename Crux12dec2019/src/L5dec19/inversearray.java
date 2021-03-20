package L5dec19;
import java.util.*;
public class inversearray {
static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int[] arr = takeinput(n);
		display(arr);
		arr=inverse(arr);
		display(arr);

	}
	public static int[] takeinput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
		
	}
	public static void display(int[] arr) {
		for(int val: arr) {
			System.out.println(val);
		}
	}
	public static int[] inverse(int[] arr) {
		int[] ar=new int[arr.length] ;
		for(int i=0;i<arr.length;i++) {
			ar[arr[i]]=i;  ///main logic 
		}
		
		
		return ar;
	}

}

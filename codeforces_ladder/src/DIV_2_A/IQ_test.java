package DIV_2_A;

import java.util.Scanner;

public class IQ_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = -1;
		int[] odd = new int[n];
		int[] even = new int[n];
		int pt1 = 0;
		int pt2 = 0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]%2 ==0) {
				even[pt1++] = i+1;
			}else {
				odd[pt2++] = i+1;
			}
			
		}
		if(odd[1]==0) {
			System.out.println(odd[0]);
		}else {
			System.out.println(even[0]);
		}
		
	}

}

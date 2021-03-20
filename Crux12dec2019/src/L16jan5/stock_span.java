package L16jan5;

import java.util.Stack;

public class stock_span {

	public static void main(String[] args) {
		int[] arr= {5,9,6,8,12,7,5,1};
		int[] ans =ss(arr);
		for(int val:ans) {
			System.out.print(val+" ");
		}

	}

	public static int[] ss(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			res[i]=1;
			while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
				s.pop();
			}
		
			
			if(s.isEmpty()) {
				res[i]=i+1;
			}
			else {
				res[i]=i-s.peek();
			}
			
			
			
		s.push(i);
			
			
			
			
		}

		return res;
	}

}

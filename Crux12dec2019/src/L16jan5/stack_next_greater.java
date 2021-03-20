package L16jan5;

import java.util.ArrayList;
import java.util.Stack;

import L14jan3.data_structure_STACK;

public class stack_next_greater {

	public static void main(String[] args) {
		int[] arr= {4,9,2,3,1,0,8};
		int[] ans=nextlarger(arr);
		for(int val: ans) {
			System.out.print(val+" ");
		}
		
		
	}

	public static int[] nextlarger(int[] arr) {
		Stack<Integer> s= new Stack<>();
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && arr[s.peek()]<arr[i]) {
				res[s.pop()]=arr[i];
			}
			s.push(i);
		}
		while(!s.isEmpty()) {
			res[s.pop()]=-1;
		}
		return res;
		
		
	}

}

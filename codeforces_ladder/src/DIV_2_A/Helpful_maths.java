package DIV_2_A;

import java.util.*;

public class Helpful_maths {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<Character,Integer> freq = new HashMap();
		String exp = scn.nextLine();
		if(exp.length() == 1) {
			System.out.println(exp);
			return ;
		}
		for (int i = 0; i < exp.length(); i=i+2) {
			if(freq.containsKey(exp.charAt(i))) {
				freq.put(exp.charAt(i), freq.get(exp.charAt(i))+1);
			}else {
				freq.put(exp.charAt(i), 1);
			}
		}
		
//		for(int i = 0; i<)
		
	}

}


//
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//public class HelpfulMaths339A
//{
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		// Input
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		int[] nums = new int[(s.length()/2)+1];
//		int index = 0;
//
//		// Get actual numbers
//		for (char c : s.toCharArray()) {
//			if (c != '+') {
//				nums[index] = Character.getNumericValue(c);
//				index++;
//			}
//		}	
//
//		// Sort in non-decreasing order
//		Arrays.sort(nums);
//
//		// Output nums
//		for (int i = 0; i < nums.length-1; i++) {
//			System.out.print(nums[i]+"+");
//		}
//		System.out.print(nums[nums.length-1]);
//	}	
//}

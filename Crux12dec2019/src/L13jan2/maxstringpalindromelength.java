package L13jan2;

import java.util.Scanner;

public class maxstringpalindromelength {
	 static int diff=0;
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str=scn.next();
		
	System.out.println(	countpalstr(str));
	}
	public static int countpalstr(String str) {
		int cnt1=0;
		int cnt2=0;
		for(int i=0;i<str.length();i++) {
			
			cnt1=grow(str,i,i);
			cnt2=grow(str,i,i+1);
		}
		return Math.max(cnt1,cnt2);
	}
	public static int grow(String str,int si ,int ei) {
		int cnt=0;
		
		
		while(si>=0 && ei<str.length() &&str.charAt(si)==str.charAt(ei)) {
			System.out.println(str.substring(si,ei+1));
			int diff1=ei+1-si;
			cnt++;
			si--;
			ei++;
			
			diff=Math.max(diff, diff1);
		}
		return diff;
	}
		

}

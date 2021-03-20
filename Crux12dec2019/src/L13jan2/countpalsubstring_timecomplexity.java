package L13jan2;

import java.util.Scanner;

public class countpalsubstring_timecomplexity {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str=scn.next();
	System.out.println(	countpalstr(str));
	}
	public static int countpalstr(String str) {
	
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			
			cnt+=grow(str,i,i);
			cnt+=grow(str,i,i+1);
		}
		return cnt;
	}
	public static int grow(String str,int si ,int ei) {
		int cnt=0;
		
		while(si>=0 && ei<str.length() &&str.charAt(si)==str.charAt(ei)) {
			System.out.println(str.substring(si,ei+1));
			cnt++;
			si--;
			ei++;
			
			
		}
		return cnt;
	}
		

}

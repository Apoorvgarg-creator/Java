package hackerblock;

import java.util.*;

public class isbalance_rec2 {
	static Main<String> s1=new Main<>();

	public static void main(String[] args) {
		
	String str="[a+{b+(c+d)+e}+{f+k+l}]";
	
	System.out.println(chk(str));
	
	}
	public static boolean chk(String s) {
		if(s.length()==0) {
			
			return true;
		}
		String ch=String.valueOf(s.charAt(0));
		String ros=s.substring(1);
		if(ch.equals("[") || ch.equals("{") || ch.equals("(")) {
			s1.addLast(ch);
		}
		
		boolean rr=chk(ros);

		if((ch.equals("]") || ch.equals("}") || ch.equals(")"))&& rr) {
			if(s1.size()==0) {
				return false;
			}
			else if(chk1(s1.peek(),ch)) {
				s1.removeFirst();
				return true;
			}else {
			return false;
			}
		}
		else {
			return rr;
		}
	}
	public static boolean chk1(String s1,String s2) {
		if(s1.equals("[") && s2.equals("]")) {
			return true;
		}
		else if(s1.equals("{") && s2.equals("}")) {
			return true;
		}
		else if(s1.equals("(") && s2.equals(")")) {
			return true;
		}
		else {
			return false;
		}
	}

}

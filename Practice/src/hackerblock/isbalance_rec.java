package hackerblock;

import java.util.*;

public class isbalance_rec {
	

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    String str=scn.nextLine(); 
	Stack<String> s1=new Stack<>();
	System.out.println(chk(str,s1));
	
	}
	public static boolean chk(String s,Stack<String> s1) {
		if(s.length()==0) {
			if(s1.size()!=0) {
				return false;
			}
			return true;
		}
		String ch=String.valueOf(s.charAt(0));
		String ros=s.substring(1);
		if(ch.equals("[") || ch.equals("{") || ch.equals("(")) {
			s1.push(ch);
		}

		boolean res=true;
		if(ch.equals("]") || ch.equals("}") || ch.equals(")")){
			if(chk1(s1.peek(),ch)) {
				s1.pop();
				res=true;
			}else {
				return false;
			}
			
		}
		 return chk(ros,s1) && res;
		
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

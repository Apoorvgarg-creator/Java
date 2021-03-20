package practice;

import java.util.*;

public class codeofstring {

//	public static void main(String[] args) {
//
//		char a = '1';
//
//		int num = Integer.parseInt(String.valueOf(a));
//
//		System.out.println(num);
//
//		String s = "1285";
//		String s1 = s.substring(0, 2);
//		System.out.println(s1);
//System.out.print("[");
//		code(s, "");
//		System.out.print("]");
////		System.out.println(code1(s));
//		
//
//	}
//
//	public static void code(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.print(ans +", ");
//			return;
//		}
//		char ch = ques.charAt(0);
//		int num = Integer.parseInt(String.valueOf(ch));
//		String ros1 = ques.substring(1);
//		code(ros1, ans + alnum(num));
//	
//		if (ques.length() >= 2) {
//			String s1 = ques.substring(0, 2);
//			String ros2 = ques.substring(2);
//			int num1 = Integer.parseInt(s1);
//			code(ros2, ans + alnum(num1));
//			
//		}
//		
//	}
////		public static ArrayList<String> code1(String ques) {
////			if (ques.length() == 0) {
////				ArrayList<String> br= new ArrayList<>();
////				br.add("");
////				return br;
////			}
////			ArrayList<String> mr=new ArrayList<>();
////			char ch = ques.charAt(0);
////			int num = Integer.parseInt(String.valueOf(ch));
////			String ros1 = ques.substring(1);
////			ArrayList<String> rr=code1(ros1);
////			for(String val: rr) {
////				String sb = val+alnum(num);
////				mr.add(sb);
////			}
////			if (ques.length() >= 2) {
////				String s1 = ques.substring(0, 2);
////				String ros2 = ques.substring(2);
////				int num1 = Integer.parseInt(s1);
////				rr=code1(ros2);
////				for(String val: rr) {
////					String sa=val+alnum(num1);
////					mr.add(sa);
////				}
////			}
////			
////			return mr;
////	}
//
//	public static String alnum(int n) {
//		if(n>26) {
//			return "";
//		}
//		char a = 'a';
//		int i = 1;
//		while (i != n) {
//			a++;
//			i++;
//		}
//
//		return String.valueOf(a);
//	}
//	public static String rev(String s) {
//		String ans="";
//		int n =s.length();
//		for(int i=n;i>0;i--) {
//			ans+=s.charAt(i-1);
//		}
//		return ans;
//	}
	
//	    public static void main(String args[]) {
//	        Scanner scn =new Scanner(System.in);
//	        String str=scn.nextLine();
//	        System.out.println(code(str,""));
//	    }
//	    public  static ArrayList<String> code(String Ques, String ans){
//	        if(Ques.length()==0){
//	            ArrayList<String> br=new ArrayList<>();
//	            br.add(ans);
//	            return br;
//	        }
//	        ArrayList<String> Ans=new ArrayList<>();
//	        String s1=Ques.substring(0,1);
//	        String ros1=Ques.substring(1);
//	        int n1= Integer.parseInt(s1);
//	        if (n1<=26 ){
//	            ArrayList<String> rr1=code(ros1,ans+cc(n1));
//	            for(String str : rr1) {
//		        	Ans.add(str);
//		        }
//	        }
//	        if(Ques.length()>=2){
//	        String s2=Ques.substring(0,2);
//	        String ros2=Ques.substring(2);
//	        int n2= Integer.parseInt(s2);
//	        if (n2<=26 ){
//	        	ArrayList<String> rr2=code(ros2,ans+cc(n2));
//	        	for(String str : rr2) {
//		        	Ans.add(str);
//		        }
//	        }
//	        }
//	        
//	        return Ans;
//
//	    }
//	    public static char cc(int n){
//	        int count=1;
//	        char ch='a';
//	        while(n<=26){
//	            if(count==n){
//	                return ch;
//	            }
//	            count++;
//	            ch++;
//	        }
//	        return '\0';
//	    }
	
	public static void main(String[] args) {
		String[]  str =new String("Hello Everybody");
		System.out.print(str.substring(5));
	}
	}




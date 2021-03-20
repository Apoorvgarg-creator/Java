package L9dec25;

import java.util.ArrayList;

public class recsubsequenceascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sub("abc"));

	}
public static ArrayList<String> sub(String str){
	if(str.length()==0) {
		ArrayList<String> br= new ArrayList<>();
		br.add("");
		return br;
		
	}
	
		
		char x=str.charAt(0);
		int s=x;
		String ros=str.substring(1);
		ArrayList<String> rr=sub(ros);
		ArrayList<String> mr=new ArrayList<>();
		
		for(String val: rr) {
			mr.add(val);
			mr.add(x+val);
			mr.add(s+val);
			
		}
		return mr;
	}

}




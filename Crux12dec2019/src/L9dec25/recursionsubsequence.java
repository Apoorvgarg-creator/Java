package L9dec25;

import java.util.ArrayList;

public class recursionsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ArrayList<String> sub(String str){
		if(str.length()==0) {
			ArrayList<String> br= new ArrayList<>();
			br.add("");
			return br;
			
		}
		
		char x=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=sub(ros);
		ArrayList<String> mr=new ArrayList<>();
		
		for(String val: rr) {
			mr.add(val);
			mr.add(x+val);
		}
		return mr;
	}

}

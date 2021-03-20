package L9dec25;

import java.util.ArrayList;

public class forwardpathhorver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazepath(0, 0, 2, 2));

	}
	public static ArrayList<String> mazepath(int vidr,int vidc,int er,int ec){
		if(vidr==er && vidc==ec) {
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		if(vidr>er || vidc>ec) {
			ArrayList<String> br=new ArrayList<String>();
			return br;
		}
		
		
		ArrayList<String> r1=mazepath(vidr+1,vidc,er,ec);
		ArrayList<String> mr=new ArrayList<String>();
		for(String val:r1) {
			mr.add("V"+val);
		}
		ArrayList<String> r2=mazepath(vidr,vidc+1,er,ec);
		
		for(String val:r2) {
			mr.add("H"+val);
		}
		
		return mr;
		
	}

}

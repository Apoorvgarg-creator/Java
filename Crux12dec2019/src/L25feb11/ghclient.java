package L25feb11;

import java.util.ArrayList;

public class ghclient {
	public static void main(String[] args) {
		
	}
	static class group implements Comparable<group>{
		 int value;
		 int listno;
		 int idxno;
		 public group(int v,int l,int i) {
			 value=v;
			 listno=l;
			 idxno=i;
			 
		 }
		@Override
		public int compareTo(group o) {
			
			return o.value-this.value;
		}	
	} 
	public static ArrayList<Integer> mergesortedarray(ArrayList<ArrayList<Integer>> arr){
		Genric_Heap<group> hpg=new Genric_Heap<ghclient.group>();
		for(int i=0;i<arr.size();i++) {
			group gp=new group(arr.get(i).get(0),i,0);
			hpg.add(gp);
		}
		ArrayList<Integer> res=new ArrayList<>();
		while(!hpg.IsEmpty()) {
			res.add(hpg.getmin().value);
			group rg=hpg.remove();
			rg.idxno++;
			
			if(rg.idxno<arr.get(rg.listno).size()) {
				rg.value=arr.get(rg.listno).get(rg.idxno);
				hpg.add(rg);
			}
			
			
		}
		return res;
		 
	 }
	

}

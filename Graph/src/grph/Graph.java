package grph;
import java.util.*;

public class Graph {
	private class vertex{
		HashMap<String,Integer> nbrs=new HashMap<>();
	}
	
	 HashMap<String,vertex> vtces;
	 public Graph(){
		 vtces=new HashMap<>();
	 }
	 public int num_Vertex() {
		 return this.vtces.size();
	 }
	 public void add_Vertex(String vname) {
		 if(!vtces.containsKey(vname)) {
			 vertex value=new vertex();
			 vtces.put(vname, value);
			 return ;
		 }
		 System.out.println("Already Exist");
	 }
	 public String remove_Vertex(String vname) {
		 ArrayList<String> nbrskey=new ArrayList<>(vtces.get(vname).nbrs.keySet());
		 for(String key:nbrskey) {
			 vtces.get(key).nbrs.remove(vname);
		 }
		 vtces.remove(vname);
		 return vname + "removed!";
	 }
	 public boolean contains_Vertex(String vname) {
		 return this.vtces.containsKey(vname);
		 
	 }
	 public int num_Edges() {
		 int noe=0;
		 ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		for(String a: keys) {
			noe+=vtces.get(a).nbrs.size();
		}
		return noe/2;
	 }
	 public boolean contains_Egde(String vname1,String vname2) {
		 if(vtces.containsKey(vname1) && vtces.containsKey(vname2)){
			return vtces.get(vname1).nbrs.containsKey(vname2);
			 }else {
			 System.out.println("Vertices does not exist");
			 return false;
		 }
	 }
	 public void add_Edge(String vname1,String vname2,int edge) {
		 
		 vtces.get(vname1).nbrs.put(vname2, edge);
		 vtces.get(vname2).nbrs.put(vname1, edge);
	 }
	 public int remove_Edge(String vname1,String vname2) {
		 vtces.get(vname2).nbrs.remove(vname1);
		return vtces.get(vname1).nbrs.remove(vname2);
		
	 }
	 public void display() {
		 System.out.println("Display");
		 ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		 for(String key :keys) {
			 vertex vtx=vtces.get(key);
			 System.out.println(key+" : "+ vtx.nbrs);
		 }
	 }
	 //recursion with remove tactics
	 public boolean haspath(String vname1,String vname2) {

		 if(contains_Egde(vname1, vname2)) {
			 return true;
		 }
		 boolean rr=false;
		 vertex vtx=vtces.get(vname1);
		 ArrayList<String> keys=new ArrayList<>(vtx.nbrs.keySet());
		 for(String key: keys) {
			 int rv=remove_Edge(vname1, key);
			 if(haspath(key,vname2)) {
				 rr=true;
			 }
			 add_Edge(vname1,key, rv);
			 
		 }
		 return rr;
	 }
	 HashMap<String,Boolean> visited=new HashMap<>();
	 //recursion with visit tactics
	 public boolean haspath_1(String vname1,String vname2) {
		 
		 visited.put(vname1, true);
		 if(contains_Egde(vname1, vname2)) {
			 return true;
		 }
		 boolean rr=false;
		 vertex vtx=vtces.get(vname1);
		 ArrayList<String> keys=new ArrayList<>(vtx.nbrs.keySet());
		 for(String key: keys) {
			 if(visited.containsKey(key)) {
				 continue ;
				 }
			 if(haspath_1(key,vname2)) {
				 rr=true;
			 }
			 
			 
		 }
		 return rr;
	 }
	 
	 //BFS
	 /*Algorithm for searching in graph data structure.
	  *It starts from source node
	  *and explore all neighbors at the present depth 
	  *to moving on to the nodes
	  *at next  depth level.
	  *BFS----> Shortest path
	  */
	private class bfs_pair {
		 String vname;
		 String psf="";
		 public bfs_pair(String v,String psf) {
			 this.vname=v;
			 this.psf=this.psf+psf;
		 }
	 }
	 public boolean bfs_haspath(String src,String dst) {
		 LinkedList<bfs_pair> queue=new LinkedList<>();
		 bfs_pair sp=new bfs_pair(src,src);
		 HashMap<String,Boolean> processed=new HashMap<>();
		 queue.addLast(sp);
		 boolean rr=false;
		 while(!queue.isEmpty()) {
			bfs_pair rp=queue.removeFirst();
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			 if(contains_Egde(rp.vname, dst)) {
				 System.out.println(rp.psf+dst);
				 rr= true;
//				 return rr;
			 }
			 ArrayList<String> keys=new ArrayList<>(vtces.get(rp.vname).nbrs.keySet());
			 for(String key :keys) {
				 if(!processed.containsKey(key)) {
					 bfs_pair np=new bfs_pair(key,rp.psf+key);
					 queue.addLast(np);
				 }
			 }
		 }
		return rr; 
	 }
	 /*
	  * Depth first search
	  * similar to pre/post/in order traversal of tree
	  * dfs does not give us shortest path
	  */
	 public boolean dfs_haspath(String src,String dst) {
		 LinkedList<bfs_pair> stack=new LinkedList<>();
		 bfs_pair sp=new bfs_pair(src,src);
		 HashMap<String,Boolean> processed=new HashMap<>();
		 stack.addFirst(sp);
		 boolean rr=false;
		 while(!stack.isEmpty()) {
			bfs_pair rp=stack.removeFirst();
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			 if(contains_Egde(rp.vname, dst)) {
				 System.out.println(rp.psf+dst);
				 rr= true;
				 return rr;
			 }
			 ArrayList<String> keys=new ArrayList<>(vtces.get(rp.vname).nbrs.keySet());
			 for(String key :keys) {
				 if(!processed.containsKey(key)) {
					 bfs_pair np=new bfs_pair(key,rp.psf+key);
					 stack.addFirst(np);
				 }
			 }
		 }
		return rr; 
	 }
	 
	 
	 //breadth first traversal 
	 public void bft() {
		 HashMap<String,Boolean> processed=new HashMap<>();
		 LinkedList<bfs_pair> queue=new LinkedList<>();
		 ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		 for(String src : keys) {
		 
			 System.out.println("****"+src+"*****");
//			 HashMap<String,Boolean> processed=new HashMap<>();
//			 LinkedList<bfs_pair> queue=new LinkedList<>();
			 if(processed.containsKey(src)) {
					continue;
				}
		 bfs_pair sp=new bfs_pair(src,src);
		 queue.addLast(sp);
		 while(!queue.isEmpty()) {
			bfs_pair rp=queue.removeFirst();
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			System.out.println(rp.vname+" <--via--> "+ rp.psf);
			 ArrayList<String> nbrs=new ArrayList<>(vtces.get(rp.vname).nbrs.keySet());
			 for(String key :nbrs) {
				 if(!processed.containsKey(key)) {
					 bfs_pair np=new bfs_pair(key,rp.psf+key);
					 queue.addLast(np);
				 }
			 }
		 }
		 System.out.println("****END*****");
		 }
		 
	 }
	 public void dft() {
		 LinkedList<bfs_pair> stack=new LinkedList<>();
		 HashMap<String,Boolean> processed=new HashMap<>();
		 ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		 for(String src : keys) {
			 System.out.println("****"+src+"*****");
//			 LinkedList<bfs_pair> stack=new LinkedList<>();
//			 HashMap<String,Boolean> processed=new HashMap<>();
			 if(processed.containsKey(src)) {
				 System.out.println("****END*****");
					continue;
				}
		 bfs_pair sp=new bfs_pair(src,src);
		 stack.addFirst(sp);
		 while(!stack.isEmpty()) {
			bfs_pair rp=stack.removeFirst();
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			System.out.println(rp.vname+" <--via--> "+ rp.psf);
			 ArrayList<String> nbrs=new ArrayList<>(vtces.get(rp.vname).nbrs.keySet());
			 for(String key :nbrs) {
				 if(!processed.containsKey(key)) {
					 bfs_pair np=new bfs_pair(key,rp.psf+key);
					 stack.addFirst(np);
				 }
			 }
		 }
		 System.out.println("****END*****");
		 }
	 }
	 public boolean IsCyclic() {
		 HashMap<String,Boolean> processed=new HashMap<>();
		 LinkedList<bfs_pair> queue=new LinkedList<>();
		 ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		 for(String src : keys) {
		 
			 if(processed.containsKey(src)) {
					continue;
				}
		 bfs_pair sp=new bfs_pair(src,src);
		 queue.addLast(sp);
		 while(!queue.isEmpty()) {
			bfs_pair rp=queue.removeFirst();
			if(processed.containsKey(rp.vname)) {
				return true;
			}
			processed.put(rp.vname, true);
			
			 ArrayList<String> nbrs=new ArrayList<>(vtces.get(rp.vname).nbrs.keySet());
			 for(String key :nbrs) {
				 if(!processed.containsKey(key)) {
					 bfs_pair np=new bfs_pair(key,rp.psf+key);
					 queue.addLast(np);
				 }
			 }
		 }
		
		 }
		 return false;
	 }
	 public boolean IsConnected() {
	
		 HashMap<String,Boolean> processed=new HashMap<>();
		 LinkedList<bfs_pair> queue=new LinkedList<>();
		 ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		 int count=0;
		 for(String src : keys) {
		 
			 if(processed.containsKey(src)) {
					continue;
				}
			 count++;
		 bfs_pair sp=new bfs_pair(src,src);
		 queue.addLast(sp);
		 while(!queue.isEmpty()) {
			bfs_pair rp=queue.removeFirst();
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			
			 ArrayList<String> nbrs=new ArrayList<>(vtces.get(rp.vname).nbrs.keySet());
			 for(String key :nbrs) {
				 if(!processed.containsKey(key)) {
					 bfs_pair np=new bfs_pair(key,rp.psf+key);
					 queue.addLast(np);
				 }
			 }
		 }
		
		 }
		 
		if(count>=2) {
			return false;
		}else {
			return true;
		}
	 }
	 public boolean IsTree() {
		 return !this.IsCyclic()&&this.IsConnected();
	 }
	 public ArrayList<ArrayList<String>> getconnectedcomponent(){
		 HashMap<String,Boolean> processed=new HashMap<>();
		 LinkedList<bfs_pair> queue=new LinkedList<>();
		 ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		 ArrayList<ArrayList<String>> ans=new ArrayList<>();
		 for(String src : keys) {
			 ArrayList<String> com=new ArrayList<>(); 
			 if(processed.containsKey(src)) {
					continue;
				}
					
		 bfs_pair sp=new bfs_pair(src,src);
		 queue.addLast(sp);
		 while(!queue.isEmpty()) {
			bfs_pair rp=queue.removeFirst();
			
			
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			
			processed.put(rp.vname, true);
			com.add(rp.vname);
			 ArrayList<String> nbrs=new ArrayList<>(vtces.get(rp.vname).nbrs.keySet());
			 for(String key :nbrs) {
				 if(!processed.containsKey(key)) {
					 bfs_pair np=new bfs_pair(key,rp.psf+key);
					 queue.addLast(np);
				 }
			 }
		 
		 }
		 ans.add(com);
		 
		 }
		return ans; 
	 }
	 
	 private class Primspair implements Comparable<Primspair>{
		String vname;
		String acqvname;
		int cost=0;
		
		@Override
		public int compareTo(Primspair o) {
			
			return o.cost-this.cost;
		}
		
	 }
	 //Minimum spanning tree
	 public Graph prims() {
		 Graph mst=new Graph();
		 HashMap<String,Primspair> map=new HashMap<>();
		 
		 Genric_Heap<Primspair> heap=new Genric_Heap<>();
		 ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		 for(String key:keys) {
			 Primspair np=new Primspair();
			 np.vname=key;
			 np.acqvname=null;
			 np.cost=Integer.MAX_VALUE;
			 heap.add(np);
			 map.put(key, np);
		 }
		 while(!heap.IsEmpty()) {
			 Primspair rp=heap.remove();
			 map.remove(rp.vname);
			 if(rp.acqvname==null) {
				 mst.add_Vertex(rp.vname);
			 }else {
				 mst.add_Vertex(rp.acqvname);
				 mst.add_Edge(rp.vname, rp.acqvname, rp.cost);
			 }
			 for(String nbr: vtces.get(rp.vname).nbrs.keySet()) {
				 if(map.containsKey(nbr)) {
				 int oc = map.get(nbr).cost;
				 int nc=vtces.get(rp.vname).nbrs.get(nbr);
				 if(nc<oc) {
				 map.get(nbr).acqvname=rp.vname;
				 map.get(nbr).cost=nc;
				 
				 heap.updatepriorty(map.get(nbr));
				 }
			 }
		 }
			 
			 }
		 return mst;
		 
	 }
	 /*
	  * Dijkstra Algorithm
	  * it helps find out the shortest path from one fixed point 
	  * to every other Nodes.
	  */
	 private class Dijpair implements Comparable<Dijpair>{
		 String vname;
		 String psf;
		 int distance;
		@Override
		public int compareTo(Dijpair o) {
			// TODO Auto-generated method stub
			return o.distance-this.distance;
		}  //Cost
		 
		 
	 }
	 public HashMap<String,Integer> Dijkstra(String src){
		 HashMap<String,Integer> ans=new HashMap<>();
		 HashMap<String,Dijpair> map=new HashMap<>();
		 Genric_Heap<Dijpair> heap=new Genric_Heap<>();
		 ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		 for(String key:keys) {
			 Dijpair np=new Dijpair();
			
			 np.vname=key;
			 np.psf=null;
			 np.distance=Integer.MAX_VALUE;
			 	if(key.equals(src)) {
			 			np.psf=key;
			 			np.distance=0;
				 
			 }
			 heap.add(np);
			 map.put(key, np);
		 }
		 while(!heap.IsEmpty()) {
			 Dijpair rp=heap.remove();
			 map.remove(rp.vname);
				 ans.put(rp.vname, rp.distance);
			 
			 for(String nbr: vtces.get(rp.vname).nbrs.keySet()) {
				 if(map.containsKey(nbr)) {
				 int oc = map.get(nbr).distance;
				 int nc=rp.distance+vtces.get(rp.vname).nbrs.get(nbr);
				 if(nc<oc) {
				 map.get(nbr).psf=rp.psf+nbr;
				 map.get(nbr).distance=nc;
				 
				 heap.updatepriorty(map.get(nbr));
				 }
			 }
		 }
			 
			 }
		 return ans;
		 
	 }
}

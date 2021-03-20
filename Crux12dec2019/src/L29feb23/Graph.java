package L29feb23;

import java.util.*;
import java.util.HashMap;
import java.util.Queue;

public class Graph {
	private int[][] matrix;
	private int numV;

	public Graph() {
		this(5);

	}

	public Graph(int vertices) {
		numV = vertices;
		matrix = new int[numV + 1][numV + 1];

	}

	public void addEdge(int u, int v, int wt) {
		matrix[u][v] = wt;
		matrix[v][u] = wt;

	}

	public String toString() {
		String str = "";
		for (int u = 1; u <= numV; u++) {
			str += u + "-->";
			for (int v = 1; v <= numV; v++) {
				if (matrix[u][v] != 0)
					str += v + ", ";
			}
			str += "\n";
		}
		return str;
	}

	public int numEdges() {
		int edges = 0;
		for (int u = 1; u <= numV; u++) {

			for (int v = 1; v <= numV; v++) {
				if (matrix[u][v] != 0)
					edges++;
			}

		}
		return edges / 2;

	}

	public boolean containsEdge(int u, int v) {
		return matrix[u][v] != 0;
	}

	public int removEdge(int u, int v) {
		int val = matrix[u][v];
		matrix[u][v] = 0;
		matrix[v][u] = 0;
		return val;
	}

	public boolean haspath(int u, int v) {
		if (u == v || containsEdge(u, v)) {
			return true;
		}

		boolean rr = false;

		for (int k = 1; k <= numV; k++) {
			if (matrix[u][k] != 0) {
				int x = removEdge(u, k);
				rr = haspath(k, v);
				addEdge(u, k, x);
				if (rr)
					return true;
			}
		}

		return rr;

	}

	public void hasallpath(int u, int v) {
		HashMap<Integer, Boolean> visited = new HashMap<>();
		hasallpath(u, v, visited, "");
	}

	private void hasallpath(int u, int v, HashMap<Integer, Boolean> visited, String ans) {
		if (u == v) {
			System.out.println(ans + v + " ");
			return;
		}

		visited.put(u, true);
		for (int k = 1; k <= numV; k++) {
			if (matrix[u][k] != 0) {
				hasallpath(k, v, visited, ans + u + " ");

			}
		}
		visited.remove(u);
	}
//	class pair implements Comparable<pair>{
//		String str="";
//		int countstep=0;
//		
//		@Override
//		public int compareTo(pair o) {
//			
//			return this.countstep-o.countstep;
//		}

//	}
//	private pair shortpath(int u,int v,HashMap<Integer,Boolean> visited,pair d) {
//		if (u == v ) {	
//			return ;
//		}
//		pair np=new pair();
//		visited.put(u, true);
//		for (int k =1; k <= numV; k++) {
//			if (matrix[u][k] != 0) {
//				shortpath(k, v,visited,d);
//			}
//		}
//		visited.remove(u);
//	}
//	 return pair;
//		
//	}

	//// Shortest Path
	class pair {
		int data;
		String psf;

		public pair(int d, String p) {
			data = d;
			psf = p;
		}
	}

	public boolean BFS(int u, int v) {

		LinkedList<pair> queue = new LinkedList<>();

		pair np = new pair(u, "");
		queue.addLast(np);

		HashMap<Integer, Boolean> visited = new HashMap<>();

		while (!queue.isEmpty()) {

			pair rp = queue.removeFirst();

			if (visited.containsKey(rp.data)) {

				// isCyclic
				continue;
			}

			if (rp.data == v) {
				System.out.println(rp.psf + v);
				return true;
			}

			System.out.println(rp.data + "->" + rp.psf + rp.data);

			visited.put(rp.data, true);

			for (int nbr = 1; nbr <= numV; nbr++) {

				if (containsEdge(rp.data, nbr) && !visited.containsKey(nbr)) {
					pair nbrPair = new pair(nbr, rp.psf + rp.data);
					queue.addLast(nbrPair);
				}
			}

		}

		return false;

	}

	public void BFT() {

		HashMap<Integer, Boolean> visited = new HashMap<>();

		for (int u = 1; u <= numV; u++) {

			if (visited.containsKey(u)) {
				continue;
			}

			LinkedList<pair> queue = new LinkedList<>();
			pair np = new pair(u, "");
			queue.addLast(np);

			while (!queue.isEmpty()) {

				pair rp = queue.removeFirst();

				if (visited.containsKey(rp.data)) {

					// isCyclic
					continue;
				}

				System.out.println(rp.data + " -> " + rp.psf + rp.data + ", ");

				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (containsEdge(rp.data, nbr) && !visited.containsKey(nbr)) {
						pair nbrPair = new pair(nbr, rp.psf + rp.data);
						queue.addLast(nbrPair);
					}
				}

			}

		}
	}

}

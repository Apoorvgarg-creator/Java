package grph;

public class grph_client {
	public static void main(String[] args) {
		Graph gg=new Graph();
		
		gg.add_Vertex("A");
		gg.add_Vertex("B");
		gg.add_Vertex("C");
		gg.add_Vertex("D");
		gg.add_Vertex("E");
		gg.add_Vertex("F");
		gg.add_Vertex("G");
//		gg.add_Vertex("K");
		gg.add_Edge("A", "B", 3);
		gg.add_Edge("A", "D", 2);
		gg.add_Edge("C", "D", 7);
		gg.add_Edge("C", "B", 4);
		gg.add_Edge("F", "E", 9);
		gg.add_Edge("F", "G", 6);
		gg.add_Edge("D", "E", 10);
		gg.add_Edge("G", "E", 8);
//		gg.add_Edge("A", "K", 11);
//		gg.add_Edge("F", "K", 16);
//		gg.remove_Vertex("E");
//	System.out.println(	gg.remove_Edge("A","B"));
//		System.out.println(gg.num_Edges());
//		gg.display();
//		System.out.println(gg.dfs_haspath("A","F"));
//		System.out.println(gg.bfs_haspath("A","F"));
//		gg.dft();
//		gg.bft();
//		System.out.println(gg.IsConnected());
//		System.out.println(gg.IsCyclic());
//		System.out.println(gg.IsTree());
//		System.out.println(gg.getconnectedcomponent());
		System.out.println(gg.Dijkstra("A"));
	
		
	}

}

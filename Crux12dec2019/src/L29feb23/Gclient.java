package L29feb23;

public class Gclient {

	public static void main(String[] args) {
		Graph gp=new Graph(7);
		gp.addEdge(1, 2, 3);
		gp.addEdge(1, 4, 2);
		gp.addEdge(2, 3, 4);
		gp.addEdge(2, 5, 5);
		gp.addEdge(3, 4, 1);
		gp.addEdge(5, 6, 6);
		gp.addEdge(5, 7, 1);
		gp.addEdge(6, 7, 2);
		System.out.println(gp);
		System.out.println(gp.removEdge(2, 5));
		System.out.println(gp.haspath(7, 1));
	}

}

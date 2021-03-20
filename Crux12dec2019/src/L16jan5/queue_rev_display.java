package L16jan5;

import L15jan4.data_structure_queue;

public class queue_rev_display {

	public static void main(String[] args) throws Exception {
		data_structure_queue obj = new data_structure_queue(5);
		obj.Enqueue(10);
		obj.Enqueue(20);
		obj.Enqueue(30);
		obj.Enqueue(40);
		obj.Enqueue(50);
		data_structure_queue s = new data_structure_queue();
//		actualrev(obj);
		revdisplay(obj, 0);

		System.out.println();
		System.out.println("-----");
		obj.display();

	}

	public static void revdisplay(data_structure_queue q, int cnt) throws Exception {
		if (q.size() == cnt) { // different base case...

			return;
		}
		int val = q.Dequeue();
		q.Enqueue(val);
		revdisplay(q, cnt + 1);
		System.out.print(val + " ");

	}

	public static void actualrev(data_structure_queue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}
		int val = q.Dequeue();
		actualrev(q);
		q.Enqueue(val);

	}

}

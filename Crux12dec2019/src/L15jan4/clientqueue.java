package L15jan4;

public class clientqueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		data_structure_queue obj = new data_structure_queue(12);
//		obj.Enqueue(10);
//		obj.Enqueue(20);
//		obj.Enqueue(30);
//		obj.Enqueue(40);
//		
//		obj.Enqueue(50);
//		obj.Enqueue(60);
//		obj.Enqueue(70);
//		
//		obj.Enqueue(80);
//		obj.Enqueue(90);
//		
//		obj.Enqueue(100);
//		obj.Dequeue();
//		obj.Dequeue();
//		obj.Dequeue();
//		obj.display();
		data_structure_queue obj1 = new data_structure_queue(7);
		for(int k=1; k<=7;k++) {
			obj1.Enqueue(k);
		}
		for(int k=1;k<=4;k++) {
			obj1.Enqueue(obj1.Dequeue());
			int val=obj1.Dequeue();
		}
		obj1.display();
		
	}

}

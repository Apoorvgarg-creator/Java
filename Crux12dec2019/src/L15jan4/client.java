package L15jan4;

public class client {
	public static void main(String[] args) throws Exception {
		dynamic_Queue obj=new dynamic_Queue();
		obj.Enqueue(10);
		obj.Enqueue(20);
		obj.Enqueue(30);
		obj.Enqueue(40);
		
		obj.Enqueue(50);
		obj.Enqueue(60);
		obj.Enqueue(70);
		
		obj.Enqueue(80);
		obj.Enqueue(90);
		
		obj.Enqueue(100);
		obj.Dequeue();
		obj.Dequeue();
		obj.Dequeue();
		obj.display();
		
	}

}

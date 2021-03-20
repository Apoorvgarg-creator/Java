package Queue;

public class qclie {

	public static void main(String[] args) {
		Queue_Array q1=new Queue_Array();
		q1.Enqueue(1);
		q1.Enqueue(2);
		q1.Display();
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		q1.Display();
		q1.dequeue();
	}

}

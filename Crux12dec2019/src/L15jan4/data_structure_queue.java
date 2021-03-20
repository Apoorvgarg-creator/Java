package L15jan4;

public class data_structure_queue {
		public int[] data;
		 public int front;
		public int size;
		
		public data_structure_queue() {
			this(5);
		}
		public data_structure_queue(int cap) {
			data=new int[cap];
			front=0;
			size=0;
		}
		public void Enqueue(int item) throws Exception {
			if(isFull()) {
				throw new Exception("Queue is Full");			}
			int rear =(front+size)%data.length;
			data[rear]=item;
			size++;
		}
		public boolean isFull() {
			
			return size==data.length;
		}
		public boolean isEmpty() {
			return size==0;
		}
		public int Dequeue() throws Exception {
			if(isEmpty()) {
				throw new Exception("Queue is empty");
			}
			int rv=data[front];
			data[front]=0;
			front=(front+1)%data.length;
			size--;
			return rv;
		}
		public int size() {
			return size;
		}
		public int getFront() throws Exception {
			if(isEmpty()) {
				throw new Exception("Queue is empty");
			}
			int rv=data[front];
			return rv;
		}
		public void display() {
			int i=0;
			while(i<size) {
				int idx=(front+i)%data.length;
				System.out.print(data[idx]+" ");
				i++;
			}
		}
		public int last() {
			return data[(front+size)%data.length];
		}
		

}

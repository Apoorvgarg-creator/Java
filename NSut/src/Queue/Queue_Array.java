package Queue;

public class Queue_Array {
	
	int front;
	int[] data;
	int size ;
	
	public Queue_Array() {
		this(5);
	}
	
	public Queue_Array(int cap) {
		this.data=new int[cap];
		size=0;
		front=0;
	}
	
	//Method-1
	//Enqueue--> Add an element 
	public void Enqueue(int item) {
		if(Isfull()) {
			System.out.println("Queue is completey filled");
			return ;
		}
		data[front+size]=item;
		size++;
		
	}
	//Method-2
	//Isfull-- check whether queue is full or not 
	public boolean Isfull() {
		
		return front+size==data.length;
	}
	//Method-3 
	//dequeue-- remove an element from first
	public String  dequeue() {
		if(IsEmpty()) {
			System.out.println("Queue is Empty");
			return "NO_element";
			
		}else {
			int rv=data[front];
			data[front]=0;
			front++;
			size--;
			return "Removed element : "+rv;
		}
	}
	//Method-4
	//IsEmpty-- check whether queue is empty or not 
	public boolean IsEmpty() {
		return this.size==0;	
	}
	//Method-5
	//size-- No. of elements present in Queue
	public int size() {
		return this.size;
		
		
	}
	//Method-6
	//getFront--> get first element
	public int getfront() {
		if(IsEmpty()) {
			return -1;
			
		}
		return data[front];
	}
	//Method-7
	//getLast--> get last element
	public int getlast() {
		if(IsEmpty()) {
			return -1;
		}
		return data[front+size-1];
	}
	
	//Method-8
	//display
	public void Display() {
		for(int i=this.front;i<front+size;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

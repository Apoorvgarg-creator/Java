package L15jan4;
import L14jan3.*;
public class Dynamic_stack_inheritance extends data_structure_STACK {
	
	@Override
	public void push(int item) throws Exception {
		if(isFull()) {
			int[] na = new int[data.length*2];
			
			for(int i=0;i<data.length;i++) {
				na[i]=data[i];
			}
			data=na;
			
		}
		super.push(item);  //super is a keyword that stores the reference of parent class
	}

}

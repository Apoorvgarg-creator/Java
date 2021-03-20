package L1dec12;

public class text3 {

	public static void main(String[] args) {
		// conditional statement
		
		System.out.println("HI");
		int marks=50;
		
		if(marks>80) {
			System.out.println("good");
		//	System.out.println("in if"); 
			
		}
		else if( marks >50 && marks< 80)
		{
		System.out.println("avg");	
		}
		else if(marks>20 && marks<50)
		{
			System.out.println("bad");
			
		}

		else
			System.out.println("in else");
		
		
		System.out.println("bye");
	}

}
// in else if ladder only one block in executed
// && "logical and" operator  
// || "logical or" operator
// == checks equality

package practice;

public class Tower_of_hanoi {
	public static void main(String[] args) {
	int x	=towerOfHanoi(2, 1, 2,3);
	System.out.println(x);
	}

	//Geeks_for_geeks//
	
	 public static int towerOfHanoi(int n, int i, int j, int k) 
	    { 
	        if (n == 1) 
	        { 
	            System.out.println("Move " + n + "th disc from T" +  i + " to T" + j); 
	            return 1; 
	        } 
	        int cnt=1;
	       cnt+= towerOfHanoi(n-1, i, k, j); 
	        System.out.println("Move " + n + "th disc from T" +  i + " to T" + j); 
	      cnt+=  towerOfHanoi(n-1, k, j, i); 
	      return cnt;
	    } 
	      

}

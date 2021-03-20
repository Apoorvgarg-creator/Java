package a;

import java.util.*;

public class playingwithcards {
	public static void main(String[] args) {
		int[] cards= {3 ,4 ,7 ,6, 5};
		cards(cards,1);
		
	}
	public static void cards(int[] card,int Q) {
		ArrayList<Stack<Integer>> A= new ArrayList<>();   //ArrayList of stack  A
        ArrayList<Stack<Integer>> B= new ArrayList<>();   //ArrayList of stack  B
            A.add(new Stack());
         for(int val: card){
             A.get(0).push(val);
         }
         for(int i=1;i<=Q+1;i++) {
        	 A.add( new Stack<>());
        	 B.add( new Stack<>());
        	 }
         for (int i = 1; i <= Q; i++) {
        	 	while(!A.get(i-1).isEmpty()) {
        	 int t=A.get(i-1).pop();
        	 if(t% ithprime(i)==0) {
        		 B.get(i).push(t);
        	 }
        	 else {
        		 A.get(i).push(t);
        	 }
        	 }
        	 
         }
         for(Stack<Integer> ss : B) {
        	 while(!ss.isEmpty()) {
        	 System.out.println(ss.pop());
        	 }
         }

         Stack<Integer> LastStack = A.get(Q);
 		while (!LastStack.isEmpty()) {
 			System.out.println(LastStack.pop());
 		}
    }
	public static int ithprime(int t) {
		int count=2;
		int prime_cnt=0;
		while(true) {
			if(isprime(count)) {
				prime_cnt++;
			}
			if(prime_cnt==t) {
				return count;
			}
			count++;
		}
	}
	public static boolean isprime(int t) {
		for(int i=2;i*i<=t;i++) {
			if(t%i==0) {
				return false;
			}
			
		}
		return true;
	}

}

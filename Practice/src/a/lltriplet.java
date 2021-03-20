package a;
import java.util.*;
public class lltriplet {
	static Scanner scn = new Scanner(System.in);
    public static void main (String args[]) {
        int n =scn.nextInt();
                int m=scn.nextInt();
                        int o =scn.nextInt();
        LinkedList<Integer> ll1=new LinkedList<>();
        LinkedList<Integer> ll2=new LinkedList<>();
        LinkedList<Integer> ll3=new LinkedList<>();
        for(int i=0;i<n;i++){
            int item =scn.nextInt();
            ll1.addLast(item);
        }
         for(int i=0;i<m;i++){
            int item =scn.nextInt();
            ll2.addLast(item);
        }
         for(int i=0;i<o;i++){
            int item =scn.nextInt();
            ll3.addLast(item);
        }
        int target=scn.nextInt();
        for(int j=0;j<n;j++){
            for(int k=0;k<m;k++){
                for(int l=0;l<o;l++){
                    int x=ll1.get(j)+ll2.get(k)+ll3.get(l);
                    if(x==target){
                        System.out.println(ll1.get(j)+" "+ll2.get(k)+" "+ll3.get(l));
                    }
                }
            }
        }

    }
}



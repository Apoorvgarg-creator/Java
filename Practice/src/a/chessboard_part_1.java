package a;
import java.util.*;
public class chessboard_part_1 {
	
	    static Scanner scn = new Scanner(System.in);
	    public static void main(String args[]) {
	        int n = scn.nextInt();
	        int x=pathpiece(0,0,n-1,n-1,"");
	        System.out.println();
	        System.out.print(x);

	    }
	    public static int pathpiece(int cr,int cc,int er,int ec,String ans){
	        if(cr==er && cc==ec){
	            System.out.print(ans+"{"+cr+"-"+cc+"} ");
	            return 1;
	        }
	        if(cr<0 || cc<0 || cc>ec || cr>er ){
	            return 0;
	        }
	        int cnt=0;
	        //Knight like moves (any cell)
	      //case 1
	         cnt+=pathpiece(cr+2,cc+1,er,ec,ans+"{"+cr+"-"+cc+"}K");
	        //case 2
	        cnt+=pathpiece(cr+1,cc+2,er,ec,ans+"{"+cr+"-"+cc+"}K");
	        
	         //rook like moves (border)
	         if(cr==0 || cr==er || cc==0 || cc==ec){
	        	 // horizontal right
	             int i=1;
	             int phrm=ec-cc;  //pvdm possible horizontal right move
	             while(i<=phrm){
	                    cnt+=pathpiece(cr,cc+i,er,er,ans+"{"+cr+"-"+cc+"}R");
	                    i++;
	                }
	             // vertical down
	              i=1;
	             int pvdm=er-cr;  //pvdm possible vertical down move
	             while(i<=pvdm){
	                    cnt+=pathpiece(cr+i,cc,er,er,ans+"{"+cr+"-"+cc+"}R");
	                    i++;
	                }
	           

	            }
	        // bishop like moves  (when piece is  present at diagonals)
	        if(cr==cc || cr+cc==er){
	            int i=1;
	            int pdm=er-cr;   //possible diagonal moves
	            while(i<=pdm){
	                cnt+=pathpiece(cr+i,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}B");
	                i++;
	            }
	        }    

	             
	        return cnt;

	    }
	}




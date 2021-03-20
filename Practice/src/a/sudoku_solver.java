package a;
import java.util.*;
public class sudoku_solver {
	static Scanner scn = new Scanner (System.in);
	public static void main(String args[]) {
        // Your Code Here
		int[][] page=new int[9][9];
		int[][] ans=new int[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				page[i][j]=scn.nextInt();
				ans[i][j]=page[i][j];
			}
		}
		solve(page,0,0,8,8,"");
//		for(int i=0;i<9;i++){
//			for(int j=0;j<9;j++) {
//				System.out.print(page[i][j]+" ");
//			}
//			System.out.println();
//			
//		}
//		System.out.println(safe(5,0,0,page));
}
    public static void solve(int[][] page,int cr,int cc,int er,int ec,String ans){
        if(cr==page.length){
            return ;
        }
        if(cc==page.length){
//        	System.out.println(ans);
            cr=cr+1;
            cc=0;
        }
//        if(cr<0 || cc<0 ||cr>=page.length || cc>=page.length) {
//        	return ;
//        }
        if(page[cr][cc]!=0){
            solve(page,cr,cc+1,er,ec,ans+0+" ");
            
        }
        
        for(int i=1;i<=9;i++){
            if(safe(i,cr,cc,page)){
                page[cr][cc]=i;
                solve(page,cr,cc+1,er,ec,ans+i+" ");
                page[cr][cc]=0;
              }
        	}
        
    }
    // ntbp ==== number to be placed
    public static boolean safe(int ntbp,int cr,int cc,int[][] page){
        //Horizontal left
        int row=cr;
        int col=cc;
        while(col>=0){
            if(ntbp==page[row][col]){
                return false;
            }
            col--;
        }
        //Horizontal right
        row=cr;
        col=cc;
        while(col<page.length){
            if(ntbp==page[row][col]){
                return false;
            }
            col++;
        }
        //up
        row=cr;
        col=cc;
        while(row>=0){
            if(ntbp==page[row][col]){
                return false;
            }
            row--;

        }
        //Down
        row=cr;
        col=cc;
        while(row<page.length){
            if(ntbp==page[row][col]){
                return false;
            }
            row++;
        }
     // Entire grid
     	 row = cr - cr % 3;
     	 col = cc - cc % 3;

     		for (int i = row; i < row + 3; i++) {
     			for (int j = col; j < col + 3; j++) {
     				if (page[i][j] == ntbp) {
     					return false;
     				}
     			}
     		}
        return true;
    }
}





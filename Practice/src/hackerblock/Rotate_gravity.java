package hackerblock;

public class Rotate_gravity {
	public static void main(String[] args) {
		String[][] matrix = {
				{"#", "#", ".", ".", ".", ".", "."},
				{"#", "#", "#", ".", ".", ".", "."},
				{"#", "#", "#", ".", ".", "#", "."}
		};
		String[][] ans = new String[matrix[0].length][matrix.length];
		for(int i=0;i<ans.length;i++) {
        	for(int j=0;j<ans[0].length;j++) {
        		ans[i][j] = ".";
        	}
        	
        }
		int x = matrix.length-1;
        for(int i=0;i<matrix.length;i++){
            int store = matrix[0].length - 1 ;
            for(int j=matrix[0].length-1;j>=0;j--){
                if(matrix[i][j].equals("*")){
                    ans[j][x-i] = "*";
                    if(j == 0){
                        store = store - 1;
                    }else{
                    store = j-1;
                    }
                }
                if(matrix[i][j].equals("#")){
                    ans[store][x-i] = "#";
                    store = store - 1; 
                }
                
            }
            
        }
        
        for(int i=0;i<ans.length;i++) {
        	for(int j=0;j<ans[0].length;j++) {
        		System.out.print(ans[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}

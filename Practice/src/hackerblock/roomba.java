package hackerblock;

public class roomba {
	public static void main(String[] args) {
		int x =1;
		int y=1;
		String[] moves = {"NORTH","EAST"};
		int a = 0;
        int b = 0;
        for(int i=0;i<moves.length;i++){
        if(moves[i] == "NORTH"){
            b = b + 1;
        }
        else if(moves[i] == "EAST"){
            a = a + 1;
        }
        else if(moves[i] == "SOUTH"){
            b = b - 1;
        }
        else{
            a = a - 1;
        }
    }
    System.out.print("a" + a);
    System.out.print("b" + b);
    boolean ans = (a==x && b == y) ? true: false;
    
    System.out.print(ans);
                
    }
	}



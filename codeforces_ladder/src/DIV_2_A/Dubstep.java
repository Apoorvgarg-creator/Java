package DIV_2_A;
import java.util.*;
public class Dubstep {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String input = scn.nextLine();
		String wub= "WUB";
		int[] arr = new int[input.length()];
		String Output = "";
//		System.out.println(input.substring(0,3));
		int max = input.length();
//		boolean chk = true;
		for(int i = 0; i < max ;) {
			if(i+3 > max) {
				break;
			}
			String chk = input.substring(i, i+3);
//			System.out.println(chk);
			if(chk.equals(wub) ) {
//				System.out.println("RUN");
				arr[i]=1;
				arr[i+1]=1;
				arr[i+2]=1;
				i = i+3;
			}else {
				i++;
			}
		}
//		for(int a: arr) {
//			System.out.print(a);
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int max = input.length();
//		for(int i=0; i<max;i++) {
//			if(i + 3 < max && input.substring(i, i+3)== wub ) {
//				arr[i]=1;
//				arr[i+1]=1;
//				arr[i+2]=1;
//				
//			}
//			
//		}
		for(int i=0;i<max;i=i+1) {
			if(arr[i]==0) {
				while ( i<max && arr[i]==0 ) {
					
					Output += input.charAt(i) +"";
					i++;
				}
				Output += " ";
			}
		}
		
		System.out.println(Output);
	}

}

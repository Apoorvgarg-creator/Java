package L8dec24;

public class recmaxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,9,5,19,6};
		System.out.println(max(arr,0));

	}
	public static int max(int[] arr,int vidx) {
		
		if(vidx==arr.length) {
			return arr[vidx-1];
		}
		int maxo=arr[vidx];
		
		int res=max(arr,vidx+1);
		if(res>maxo) {
			maxo=res;
		}
		
		return maxo;
	}

}
///or
//public static int max(int[] arr,int vidx) {
//	
//	if(vidx==arr.length) {
//		return arr[vidx-1];
//	}
//	
//	
//	int res=max(arr,vidx+1);
//	//	
//	return Math.max(arr[vidx],res);
//}


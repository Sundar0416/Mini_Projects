package palgm;

public class BuySell {
	public static void main(String[] args) {
		int[] arr= {1,5,5,10,8,7,6,4,5,2,6,1,10};
		int res=totalprofit(arr);
		System.out.println(res);
	}
	public static int totalprofit(int[] arr) {
		int totalprofit=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1])
				totalprofit=totalprofit+arr[i+1]-arr[i];
		}
		return totalprofit; 
	}
}


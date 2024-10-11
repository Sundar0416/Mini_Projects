package interview;

public class bigaddition {

	public static void main(String[] args) {
		int sum=0;
		int big=0;
		int[] arr= {0,4,6,0,4,7,1,0,3,0};
		for(int i=0;i<arr.length-1;i++) {
			sum=arr[i]+arr[i+1];
			if(sum>big) {
				big=sum;
			}
		}
		System.out.print(big);
	

	}

}

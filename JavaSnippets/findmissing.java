package interview;

public class findmissing {
	public static void main(String[] args) {
		int[] arr= {3,12,6,15,18};
		int n=18;
		int sum1=0;
		int sum2=0;
		for(int i=3;i<=n;i+=3) {
			sum1=sum1+i;
		}
		for(int i=0;i<arr.length;i++) {
			sum2=sum2+arr[i];
		}
		int missingno = sum1-sum2;
		System.out.print("Missing Num: "+ missingno );
	}
}
package interview;

public class oddlyeven {
	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		int[] arr= {1,2,3,4,5,6,7};
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum1=sum1+arr[i];
			}
			else {
				sum2=sum2+arr[i];
			}
		}
		int diff=sum1-sum2;
		System.out.print("Diff : " + diff);
	}

}

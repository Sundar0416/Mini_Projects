package cheek;

public class largenoinsubarray {
	public static void main(String[] args) {
		int [] arr= {1,3,2,4,6,7,8,5};
		int k=3,max = 0;
		find(arr,k);
	}
	public static void find(int[] arr,int k) {
		int n=arr.length;
		for(int i=0;i<n-k;i++) {
			int max=arr[i];
			for(int j=1;j<k;j++) {
				if(arr[i+j]>max) {
					max=arr[i+j];
				}
			}
			System.out.print(max);
		}
	}
}
package pgm;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr= {2,3,6,4,1,7,4,6,8,33,56,887,20};
		for(int i=0;i<arr.length;i++) {
			int s=i;;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[s]) {
					s=i;
				}
				int temp=arr[s];
				arr[s]=arr[j];
				arr[j]=temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

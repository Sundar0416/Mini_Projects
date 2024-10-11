package palgm;

public class in_bw_no {
	public static void main(String[] args) {
		int[] arr= {4,2,6,7,23,17,10};
		int x=4;
		int y=10;
		if (x<y) {
			for(int i=0;i<arr.length;i++) {
				if (x<arr[i] && arr[i]<y) {           //  x<arr[i]<y
					System.out.print(arr[i]+" ");
				}
			}
		}
		else {
			System.out.print("condition mismatched");
		}
	}
}
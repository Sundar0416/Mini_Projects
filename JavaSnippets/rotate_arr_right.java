package palgm;

import java.util.Arrays;

public class rotate_arr_right {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int n=1;  // 1,2,3,.... (or) -1,-2,-3,....
		n=n%arr.length;
		if(n<0) {
			n=n+arr.length;
		}
		for(int j=0;j<n;j++) {
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		System.out.print(Arrays.toString(arr));
	}
}
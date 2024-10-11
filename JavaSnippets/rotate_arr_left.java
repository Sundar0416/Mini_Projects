package palgm;
import java.util.*;
public class rotate_arr_left {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int n=1;   // 1,2,3,.... (or) -1,-2,-3,....
		n=n%arr.length;
		if(n<0) {
			n=n+arr.length;
		}
		for(int j=0;j<n;j++) {
			int temp=arr[0];
			for(int i=1;i<arr.length;i++) {
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
		}
		System.out.print(Arrays.toString(arr));
	}
}
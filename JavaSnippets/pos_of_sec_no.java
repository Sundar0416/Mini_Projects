package interview;

import java.util.Arrays;

public class pos_of_sec_no {
	public static void main(String[] args) {
		int[] arr= {7,5,3,6,2,1,4};
		Arrays.sort(arr);
		if(arr.length%2!=0) {
			for(int i=1;i<arr.length;i+=2) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
			for(int nums:arr) {
				System.out.print(nums);
			}
		}
		else {
			System.out.print("Give the array in odd length");
		}
		
	}
}

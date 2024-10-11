package palgm;

import java.util.Arrays;

public class right_left_low {
	public static void main(String[] args) {
		int[] arr= {10,40,20,30,70,60,50};
		if(arr.length%2!=0) {
			Arrays.sort(arr);  //10,20,30,40,50,60,70
			for(int i=0;i<arr.length;i++) {
				if(i%2!=0) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		else {
			System.out.print("not a odd length");
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
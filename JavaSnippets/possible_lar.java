package palgm;

import java.util.Arrays;

public class possible_lar {
	public static void main(String[] args) {                //ip-- 4 8 7 6 9 0
		String output="";                                   //op-- 987640 
		int[] arr= {4,18,78,6,9,65,0};                      //ip-- 4 18 78 6 9 65 0
		for(int j=0;j<arr.length;j++){                      //op-- 9786654180
			for(int i=1;i<arr.length-j;i++) {               
				if(arr[i-1]>arr[i]){
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}
		}
//		System.out.print(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				String xy=arr[i]+""+arr[j];
				String yx=arr[j]+""+arr[i];
				if(Integer.parseInt(xy)<Integer.parseInt(yx)) {
					int temp1=arr[i];
					arr[i]=arr[j];
					arr[j]=temp1;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			output=output+arr[i];
		}
		System.out.print(output);
		
	}
}
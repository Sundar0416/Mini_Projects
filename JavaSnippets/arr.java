package palgm;

import java.util.Arrays;

public class arr {
	public static void main(String[] args) {
		int[] arr1= {3,7,2,9,4};
		int[] arr2= {7,2,9,10,11};
		int[] arr=new int[arr1.length+arr2.length];
		int arr1_index=0;
		int arr2_index=0;
		for(int i=0;i<arr1.length;i++) {
			arr[i]=arr1[arr1_index++];
		}
		for(int i=0;i<arr2.length;i++) {
			arr[arr1.length+i]=arr2[arr2_index++];
		}
		for(int j=1;j<arr.length;j++) {
			for(int i=0;i<arr.length-j;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		int visited=-1;
		int[] visited_arr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited_arr[j]=visited;
				}
			}
			if(visited_arr[i]!=visited) {
				visited_arr[i]=count;
			}
		}
		for(int i=0;i<visited_arr.length;i++) {
			if(visited_arr[i]!=visited) {
				System.out.print(arr[i]+" ");
				//System.out.println(arr[i]+"("+visited_arr[i]+")");
			}
		}
		
	}
}


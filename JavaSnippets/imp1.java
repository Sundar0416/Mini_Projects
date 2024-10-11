package palgm;

import java.util.Arrays;

public class imp1 {
	public static void main(String[] args) {
		int[] arr= {20 ,49 ,6 ,64, 12};
		int[] total_pnt=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int perf_pnt=0;
			int mul_pnt=0;
			int eve_pnt=0;
			int root=(int)Math.sqrt(arr[i]);
			if(root*root==arr[i]) {
				perf_pnt=5;
			}
			if(arr[i]%4==0 && arr[i]%6==0) {
				mul_pnt=4;
			}
			if(arr[i]%2==0) {
				eve_pnt=3;
			}
			int total=perf_pnt+mul_pnt+eve_pnt;
			
			total_pnt[i]=total;
			}
		for(int j=1;j<total_pnt.length;j++) {
			for(int i=0;i<total_pnt.length-j;i++) {
				if(total_pnt[i]<total_pnt[i+1]) {
					int temp=total_pnt[i];
					total_pnt[i]=total_pnt[i+1];
					total_pnt[i+1]=temp;
					int temp1=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp1;
				}
			}
		}
		for (int i = 0; i < total_pnt.length; i++) {
			System.out.print(total_pnt[i]+" ");
        }
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			  System.out.print(arr[i]+" ");
           }
	}
}

/*
Given an array of number 

You need to find the weights based on the following conditions
-5 points if a perfect square
-4 points if multiple of 4 and 6
-3 points if even number

ip-->10 36 3 49 12
op-->36 12 49 10 3

ip-->20 49 6 64 12
op-->64 12 49 20 6

ip-->8 25 2 81 32
op-->81 25 32 8 2

int root= (int)Math.sqrt(n);
		if(root*root==n) {
			System.out.println("perf");
		}
*/

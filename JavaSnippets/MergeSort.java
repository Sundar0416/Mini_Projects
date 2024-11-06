package pgm;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int [] arr= {8,0,1,4,2,54,32,77,43,98,12,53,76,41,40};
		int l=0;
		int h=arr.length-1;
		System.out.println(Arrays.toString(arr));
		divide(arr,l,h);
		System.out.println(Arrays.toString(arr));
	}
	public static void divide(int[] arr, int l, int h) {
		if(l==h)
			return;
		int mid=(l+h)/2;
		divide(arr,l,mid);
		divide(arr,mid+1,h);
		merge(arr,l,mid,h);
	}
	public static void merge(int[] arr, int l, int mid, int h) {
		int[] k=new int[h-l+1];
		int x=0;
		int left=l;
		int right=mid+1;
		while(left<=mid && right<=h) {
			if(arr[left]<=arr[right]) {
				k[x++]=arr[left++];
			}
			else {
				k[x++]=arr[right++];
			}
		}
		while(left<=mid) {
			k[x++]=arr[left++];
		}
		while(right<=h) {
			k[x++]=arr[right++];
		}
		x=0;
		for (int i = 0; i < k.length; i++,x++) {
            arr[l+i] = k[x];
        }
	}
}

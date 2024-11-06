package palgm;
import java.util.Arrays;
public class arr1 {
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
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=Integer.MAX_VALUE;
				}
			}
			if(arr[i]!=Integer.MAX_VALUE) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

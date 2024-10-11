package palgm;
import java.util.*;
public class sort {
	public static void main(String[] args) {
		int[] arr= {2,4,3,7,5};
		for(int j=1;j<arr.length;j++) {
			for(int i=0;i<arr.length-j;i++) {
				if(arr[i]<arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

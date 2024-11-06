package pgm;
import java.util.Arrays;
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr= {1,2,4,6,5,8,7};    // 1,2,4,5,6,7,8
		Arrays.sort(arr);
		int key=6;
		int min=0;
		int max=arr.length-1;
		boolean flag=false;
		while(min<=max) {
			int mid=(min+max)/2;
			if(key==arr[mid]) {
				flag=true;
				System.out.println(key+" is present in "+mid);
				break;
			}
			else if(key<arr[mid]) {
				max=mid-1;
			}	
			else if(key>arr[mid]) {
				min=mid+1;
			}	
		}
		if(!flag) {
			System.out.print("not present");
		}
	}
}

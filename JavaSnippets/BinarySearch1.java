package pgm;

public class BinarySearch1 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int key=70;
		String res=Binsea(arr,key);
		System.out.print(res);
	}
	public static String Binsea(int[] arr,int key) {
		int min=0;
		int max=arr.length-1;
		while(min<=max) {
			int mid=(min+max)/2;
			if(key==arr[mid]) {
				return "present";
			}
			else if(key<arr[mid]) {
				max=mid-1;
			}
			else if(key>arr[mid]) {
				min=mid+1;
			}
		}
		return "absent";
	}
}
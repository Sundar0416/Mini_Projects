package sri;
public class bibarysearch1 {
	public static void main(String args[]) {
		bibarysearch1 b=new bibarysearch1();
		int position=b.binarysearch();
		if(position>0) {
			System.out.println("key is present in "+position);
		}
		else {
			System.out.println("key is not present");
			}
	}
	private int binarysearch() {
		int[] arr= {10,20,33,44,50,67,89,95,99};
		int key=67;
		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;
		while(min<max) {
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				max=mid-1;
			}
			else if(key>arr[mid]) {
				min=mid+1;
			}
			else {
				System.out.print("not present");
			}
		}return -1;
		}
	}
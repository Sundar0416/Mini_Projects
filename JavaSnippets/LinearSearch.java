package pgm;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {1,2,4,6,5,8,7};
		int key=8;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				flag=true;
				System.out.print(arr[i]+" is present in the position of "+(i+1));
			}
		}
		System.out.print("not present");
		
	}
}

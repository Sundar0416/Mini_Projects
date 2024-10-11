package palgm;

public class small {
	public static void main(String[] args) {
		int[] arr= {10,23,31,96,64,3};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.print(min);
	}

}

package palgm;

public class sec_small {
	public static void main(String[] args) 
	{
		int[] arr= {10,23,31,96,64,3,5};
		int min=arr[0];
		int secmin=0;
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				secmin=min;
				min=arr[i];
			}
			else if(secmin>arr[i]) {
				secmin=arr[i];
			}
		}
		System.out.print(secmin);
	}
}

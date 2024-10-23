package pgm;

public class PrintDup {
	public static void main(String[] args) {
		int[] arr= {4,5,7,5,4,4};
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				    arr[j]=Integer.MAX_VALUE;
				}
			}
			if(count>1 && arr[i]!=Integer.MAX_VALUE)
				System.out.println(arr[i]);
		}
	}
}

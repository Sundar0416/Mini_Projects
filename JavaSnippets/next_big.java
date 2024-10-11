package palgm;

public class next_big {
	public static void main(String[] args) {
		int[] arr= {8,3,19,10};
		for(int i=0;i<arr.length;i++) {
			int big=Integer.MAX_VALUE;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					if(big>arr[j]) {
						big=arr[j];
					}
				}
			}
			if(big!=Integer.MAX_VALUE) {
				System.out.print(" "+arr[i]+" -> "+big);
			}
			else {
				System.out.print(" "+arr[i]+" -> ");
			}
		}
		
	}
}

package pgm;

public class Array4 {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
                }
				System.out.print("  ");
			}
			
			System.out.println();
		}
	}
}
/*
(2,3) (2,3,4) (2,3,4,5) (2,3,4,5,6)
(3,4) (3,4,5) (3,4,5,6)
(4,5) (4,5,6)
(5,6) 
*/
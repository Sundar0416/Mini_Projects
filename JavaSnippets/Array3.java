package pgm;

public class Array3 {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.print("("+arr[i]+","+arr[j]+") ");
			}
			System.out.println();
		}
	}
}
/*
(2,3) (2,4) (2,5) (2,6)
(3,4) (3,5) (3,6)
(4,5) (4,6)
(5,6) 
*/
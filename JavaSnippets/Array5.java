package pgm;

public class Array5 {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int cs=0;
				for(int k=i;k<=j;k++) {
					cs=cs+arr[k];
			    }
				System.out.print(cs);
				if(cs>max) {
					max=cs;
				}
				System.out.print("  ");
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.print(max);
	}
}
//2,3,4,5,6

//2  5  9  14  20  
//3  7  12  18  
//4  9  15  
//5  11  
//6  

//20
package interview;

public class in_between_nos {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int x=2;
		int y=6;
		if(x<y) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>x && y>arr[i]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
		else {
			System.out.print("Mismatch_Conditon");
		}
		
	}

}

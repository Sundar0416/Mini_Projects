package were;

public class z11 {
	public static void main(String[] args) {
		int n=4;
		int size=2*n-1;
		int front=0;
		int last=size-1;
		int[][] arr=new int[size][size];
		while(n!=0) {
			for(int i=front;i<=last;i++) {
				for(int j=front;j<=last;j++) {
					if(i==front||i==last||j==front||j==last) {
						arr[i][j]=n;
					}
				}
			}
			front++;
			last--;
			n--;
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
			    System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}


package were;

public class zz11 {
	public static void main(String args[]) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+j-1);
			}
			for(int j=i;j>1;j--) {
				System.out.print(i+j-2);
			}
			
			System.out.println();
		}
		
	}

}

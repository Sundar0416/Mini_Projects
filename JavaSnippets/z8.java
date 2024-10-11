package were;

public class z8 {
	public static void main(String[] args) {
		int n=3;
		for(int i=1,p='A';i<=n;i++,p++) {
			int k=p;
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++) {
				
				System.out.print((char)k++);
				
			}
			k=k-2;
			
			for(int j=1;j<i;j++) {
				System.out.print((char)k++);
			}
			
			System.out.println();
		}
	}

}



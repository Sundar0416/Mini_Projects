package were;

public class ap130 {
	public static void main(String[] args) {
		int n=5;
		char c='E';
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print(c);
				
			}
			c--;
			System.out.println();
		}
	}

}


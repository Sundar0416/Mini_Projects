package were;

public class ap8 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1,p='A';i<=n;i++,p++) {
            for(int j=i;j<n;j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				
				System.out.print((char)p);
			}

			for(int j=2;j<=i;j++) {
				
				System.out.print((char)p);
			}
			System.out.println();
		}
	}

}

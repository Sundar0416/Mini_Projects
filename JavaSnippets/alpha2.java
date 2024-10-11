package were;

public class alpha2 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1,p='B';i<=n;i++,p++) {
			int k=p;
			for(int j=1;j<i;j++) {
				
				System.out.print((char)k);
				
			}
			
			
			for(int j=i;j<=n;j++) {
				System.out.print((char)p++);
			}
			System.out.println();
		}
	}

}


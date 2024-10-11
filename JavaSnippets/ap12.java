package were;

public class ap12 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int p ='E';
			for(int j=1;j<=i;j++) {
				System.out.print((char)p--);
			}System.out.println();
		}
	}
}

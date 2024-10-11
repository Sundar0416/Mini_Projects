package were;

public class ap15 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1,k='A';i<=n;i++,k++) {
			int p='A';
			for(int j=1;j<=i;j++) {
				System.out.print((char)p++);
			}System.out.println();
		}
	}

}


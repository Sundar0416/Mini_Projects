package were;

public class ap19 {
	public static void main(String[] args) {
		String s="CODER";
		int n=s.length();
		for(int i=1,k=4;i<=n;i++,k--) {
			int p = k;   //p=4
		//	for(int j=1;j<i;j++) {
		//		System.out.print(" ");
		//	}
			for(int j=i;j<=n;j++) {
				System.out.print((s.charAt(p--)));
			}
			System.out.println();
		}
	}
}

package were;

public class ap18 {
	public static void main(String[] args) {
		String s="CODER";
		int n=s.length();
		for(int i=1;i<=n;i++) {
			int p=s.length()-1;   //p=4
			for(int j=1;j<=i;j++) {
				System.out.print(s.charAt(p--));
			}System.out.println();
		}
	}

}

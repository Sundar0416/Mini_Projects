package sundar;

public class dia {
	public static void main(String args[]) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int space = n-i;space>=0;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("*");
			}System.out.print("\n");}
		for(int i=n-1;i>=1;i--) 
		   {
			for(int space=1;space<=n-i;space++)
                {
				System.out.print(" ");
			    }
			for(int j=1;j<=i;j++) 
			    {
				System.out.print("*");
				}
			System.out.print("\n");
		}

}
}
package ram;

public class ht {
	public static void main(String args[]) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int space=n-i;space>0;space--) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
		    for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
		    for(int j=i+1;j<=n;j++) {
				System.out.print("*");
			}
		    System.out.println();}
		for(int i=n-1;i>=1;i--) {
			for(int space=n-i;space>0;space--) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
		    for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
		    for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		    System.out.println();}}

}

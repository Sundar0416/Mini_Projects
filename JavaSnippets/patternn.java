package palgm;
import java.util.Scanner;
public class patternn {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int space=n-i;space>0;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+j-1);
			}
		    for(int j=i;j>1;j--) {
				System.out.print(i+j-2);
			}System.out.println();
		}
	}

}

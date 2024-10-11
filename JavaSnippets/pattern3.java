package sundar;

import java.util.Scanner;
public class pattern3{
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the value:");
		int n = a.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

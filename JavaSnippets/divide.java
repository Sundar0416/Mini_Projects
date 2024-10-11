package pgm;
import java.util.Scanner;
public class divide {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0 && i!=1) {
				System.out.println(i);
			}
		}
	}
}

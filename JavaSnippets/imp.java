package sri;
import java.util.Scanner;
public class imp {


	public static void main(String args[]) {
		int n;
		Scanner b = new Scanner(System.in);
		System.out.print("enter the value:");
		n = b.nextInt();
		
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
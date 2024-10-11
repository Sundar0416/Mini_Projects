
package sundar;
import java.util.Scanner;

public class pattern1{
	public static void main(String args[]) {
		int k=1;
		
		Scanner a = new Scanner(System.in);
        System.out.println("enter the value:");
		int n=a.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				System.out.print(k++);
				System.out.print("   ");
			}
			System.out.print("\n");
		}
	}

}




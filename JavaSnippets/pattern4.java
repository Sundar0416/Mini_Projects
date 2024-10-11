package sundar;
import java.util.Scanner;

	public class pattern4{
		public static void main(String args[]) {
			Scanner a=new Scanner(System.in);
			System.out.print("enter the value:");
			int n=a.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++){
					System.out.print(i);
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}






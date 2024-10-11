package sundar;
import java.util.Scanner;
public class pattern111 {
	public static void main(String args[]) {
		int n=5;
		int sum=0;
		Scanner a=new Scanner(System.in);
		for(int i=1;i<=n;i++) {
		
			System.out.print("Enter the value");
			int k=a.nextInt();
			sum=sum+i;
			
		}
		System.out.print(+sum);
	}

}

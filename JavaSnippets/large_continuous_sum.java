package ram;
import java.util.Scanner;
public class large_continuous_sum {
	public static void main(String args[]) {
		int sum=0;
		int big=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the length");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			sum=arr[i]+arr[i+1];
			if(big<sum) {
				big=sum;
			}
		}
		System.out.print(big);
		
	}

}

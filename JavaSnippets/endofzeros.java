package ram;
import java.util.Scanner;
public class endofzeros {
	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		while(count<n) {
			arr[count++]=0;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
			
		}
		
	}
}
